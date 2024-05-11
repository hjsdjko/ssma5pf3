const base = {
    get() {
        return {
            url : "http://localhost:8080/ssma5pf3/",
            name: "ssma5pf3",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssma5pf3/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "预约挂号系统小程序"
        } 
    }
}
export default base
