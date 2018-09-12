//服务层
app.service('deliveryTemplateService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../deliveryTemplate/findAll.do');		
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../deliveryTemplate/findPage.do?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../deliveryTemplate/findOne.do?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../deliveryTemplate/add.do',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../deliveryTemplate/update.do',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../deliveryTemplate/delete.do?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../deliveryTemplate/search.do?page='+page+"&rows="+rows, searchEntity);
	}    	
});