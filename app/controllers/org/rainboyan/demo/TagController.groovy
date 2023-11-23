package org.rainboyan.demo

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class TagController {

    TagService tagService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond tagService.list(params), model:[tagCount: tagService.count()]
    }

    def show(Long id) {
        respond tagService.get(id)
    }

    def create() {
        respond new Tag(params)
    }

    def save(Tag tag) {
        if (tag == null) {
            notFound()
            return
        }

        try {
            tagService.save(tag)
        } catch (ValidationException e) {
            respond tag.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'tag.label', default: 'Tag'), tag.id])
                redirect tag
            }
            '*' { respond tag, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond tagService.get(id)
    }

    def update(Tag tag) {
        if (tag == null) {
            notFound()
            return
        }

        try {
            tagService.save(tag)
        } catch (ValidationException e) {
            respond tag.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'tag.label', default: 'Tag'), tag.id])
                redirect tag
            }
            '*'{ respond tag, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        tagService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'tag.label', default: 'Tag'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'tag.label', default: 'Tag'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
