var main = {
    init : function() {
        var _this = this;
        $('#btn-save').on('click', function() {
                    _this.save();
        })/*,

        $('#btn-update').on('click', function() {
                    _this.update();
        }),

        $('#btn-delete').on('click', function() {
                    _this.delete();
        })*/;
    },
    save : function() {
        /*var data = {
            title: $('#title').val(),
            author: $('#author').val(),
            content: $('#content').val()
        };
        */
        var data = {
            act_name: $('#act_name').val(),
            organizer_plan: $('#organizer_plan').val(),
            organizer_manage: $('#organizer_manage').val(),
            tag: $('#tag').val(),
            start_period: $('#start_period').val(),
            end_period: $('#end_period').val(),
            contents: $('#contents').val(),
            price: $('#price').val(),
            poster: $('#poster').val(),
            file: $('#file').val(),
            manager: $('#manager').val(),
            page: $('#page').val(),
            phone_number: $('#phone_number').val(),
            max_people: $('#max_people').val()
        };
        /*
        $.ajax({
            type: 'POST',
            url: '/api/v1/posts',
            dataType: 'json',
            contentType: 'application/json; charset=UTF-8',
            data: JSON.stringify(data)
        }).done(function() {
            alert('글이 등록되었습니다.');
            window.location.href = '/';
        }).fail(function(error) {
            alert(JSON.stringify(error));
        });
        */
        $.ajax({
            type: 'POST',
            url: '/api/v1/activities',
            dataType: 'json',
            contentType: 'application/json; charset=UTF-8',
            data: JSON.stringify(data)
        }).done(function() {
            alert('정보가 등록되었습니다.');
            window.location.href = '/';
        }).fail(function(error) {
            alert(JSON.stringify(error));
        });

    }/*,
    update : function() {
        var data = {
            title: $('#title').val(),
            content: $('#content').val()
        };

        var id = $('#id').val();

         $.ajax({
             type: 'PUT',
             url: '/api/v1/posts/'+id,
             dataType: 'json',
             contentType: 'application/json; charset=UTF-8',
             data: JSON.stringify(data)
         }).done(function() {
             alert('글이 수정되었습니다.');
             window.location.href = '/';
         }).fail(function(error) {
             alert(JSON.stringify(error));
         });

    },
    delete : function() {
         var id = $('#id').val();

         $.ajax({
             type: 'DELETE',
             url: '/api/v1/posts/'+id,
             dataType: 'json',
             contentType: 'application/json; charset=UTF-8'
         }).done(function() {
             alert('글이 삭제되었습니다.');
             window.location.href = '/';
         }).fail(function(error) {
             alert(JSON.stringify(error));
         });

    }*/
};

main.init();