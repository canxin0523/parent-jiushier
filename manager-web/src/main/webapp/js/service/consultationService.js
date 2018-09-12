//服务层
app.service('consultationService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../consultation/findAll.do');		
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../consultation/findPage.do?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../consultation/findOne.do?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../consultation/add.do',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../consultation/update.do',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../consultation/delete.do?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../consultation/search.do?page='+page+"&rows="+rows, searchEntity);
	}    	
});
