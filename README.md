# 销售数据可视化展示

## 需求分析
### 开发背景：
电商行业的快速发展，许多零售商受到严重冲击，许多连锁零售商纷纷借助大数据和人工智能等技术赋能进入了精细化管理的阵列。在消费升级的助推下，零售消费市场逐渐回归理性，市场逐步由供给驱动转为消费驱动，对于全渠道零售企业的数据化管理能力要求越来越高。销售数据可视化平台实现有效数据的搜集、整理和聚合管理，提供各种报表，从时间维度、地域维度、渠道维度以及业务形态等多种角度可视化分析结果，完善基础数据指标和报表，实现用户活跃监测、供应链优化、营销组合优化、渠道优化等功能。销售数据可视化平台通过渠道数据化分析，有效监控各种渠道每天新增，活跃，成交用户数。监测商品销售的品牌、类别和地区分布，并跟踪其销售金额和销售量的情况，实现单品的实时管理。根据供需的缺口，适时调整各种商品的供货，优化周转率。销售数据可视化平台是对产品库存、供销产业链、店铺运营、营销推广、用户分析的综合应用管理平台，实现从产品数据到店铺数据的全面实时监控管理，帮助企业及时调整战略，促进产品的销量提升，提升企业盈利能力。
### 研究现状：
作为一种数据分析的工具，可视化业已成为各类数据分析的理论框架和应用中的必备要素，并成为科学计算、商业智能、安全等领域中的普惠技术。21世纪之初以后，国内外信息环境发生了很大的变化，可视化的意义也逐渐为世人所知。各类科研基金和企业研发经费纷纷投向高效、高质量的可视化方法和系统的研究与开发。国家自然科学基金于2012年资助了“探索式可视分析的基础理论与方法”重点项目，团队成员来自浙江大学、北京大学、香港科技大学、北京应用物理与计算数学研究所等单位。产业界也纷纷发力，国内著名企业均投入重兵，研发新兴可视化技术。阿里巴巴、阿里云、百度、蚂蚁金服、华为、360，都相继成立了可视化的研发团队。阿里云早期和浙江大学合作的DataV可视化组件库，“被阿里巴巴的各类产品线广泛使用（如数据魔方、淘宝指数、对外数据大屏和‘双11’大屏等产品），打破了国外highcharts等收费方案的垄断，帮助阿里集团的众多大数据产品以最低成本大幅提高数据输出效果和质量”。百度公司发布的ECharts可视化工具，位列github可视化工具第三，占有国内70%的开源可视化工具市场。蚂蚁金服研发的AntV、G2等开源可视化工具，也逐渐在轻量级Web可视化方面输出能力。此外，新型大数据可视化创业公司如海云数据、永洪科技等，以可视化和可视分析技术为亮点，逐步在国内市场占据一席之地。
从2014年到2017年，中国计算机学会大数据专家委员会每年都发布大数据十大趋势，可视化和可视分析年年入选。从入选评价，不难看出大数据学术界对可视化的期望：2014年，第四，大数据分析与可视化；2015年，第八，可视化分析与可视化呈现；2016年，第一，可视化推动大数据平民化；2017年，第十，可视化技术和工具提升大数据分析工具的易用性。

### 可视化展示平台的优点：
易用性：不使用SQL语句，也不使用C或者Java等编程语句，简便易上手，没有繁琐的更新步骤，提供丰富的二次开发接口，支持自行改进、增加组件，不需要换包或者打补丁，不重启服务器的情况下就可以完成组件的更新；
性能：秒级响应，各项操作流畅，即使数据庞大，也不会出现卡顿的情况；
视觉：不仅仅形态多变，而是真正的让用户感受到视觉冲击，内置近百种酷炫的组件和3D特效；
操作：只需要通过数据传输就可以实现酷屏的制作，每个组件有其对应的预览图，方便用户的理解，还有多种模板；
图表分析：传统的饼图，柱状图之外，还有流向地图以及光晕图等十余种的个性化图表。
从这些问题可以看到，未来的数据可视化趋势已成为了必然性，国内的数据可视化工具也越来越多，这样的趋势只有创新才能走的更远。在越来越多的企业、政府等的应用场景应用也会普及，根据实时的监控数据，把最新的数据展现在大屏幕上，清楚的看到自己想要看到的数据，同时根据这些数据做出决策的调整。

## 概要设计
   此部分主要对系统的总体设计进行分析，阐述整个系统的架构、实现原理、类的设计，考虑安全性、能耗问题。
  ### 整体框架：
框架可以理解为半成品软件，确实是我们开发的利器，但是框架无非就是一些类的封装，整合。
SSM框架是spring、spring MVC 、和mybatis框架的整合，是标准的MVC模式。标准的SSM框架有四层，分别是dao层（mapper），service层，controller层和View层。使用spring实现业务对象管理，使用spring MVC负责请求的转发和视图管理，mybatis作为数据对象的持久化引擎。

#### Spring:
Spring是一个开源框架，是为了解决企业应用程序开发复杂性而创建的。框架的主要优势之一就是其分层架构，分层架构允许您选择使用哪一个组件，同时为 J2EE 应用程序开发提供集成的框架。

#### SpringMVC:
SpringMVC 是一种基于 Java 的实现 MVC 设计模型的请求驱动类型的轻量级 Web 框架，属于 Spring FrameWork 的后续产品，已经融合在 Spring Web Flow 里面。Spring 框架提供了构建 Web
应用程序的全功能 MVC 模块。使用 Spring 可插入的 MVC 架构，从而在使用 Spring 进行 WEB 开发时，可以选择使用 Spring 的 Spring MVC 框架或集成其他 MVC 开发框架。


#### Mybats:
MyBatis 是一款持久层框架，它支持自定义 SQL、存储过程以及高级映射。MyBatis 免除了几乎所有的 JDBC 代码以及设置参数和获取结果集的工作。MyBatis 可以通过简单的 XML 或注解来配置和映射原始类型、接口为数据库中的记录。
通过对比我们很直观的能看出来使用Mybatis操作数据库的代码少了很多。


### 完整的流程 
表现层调用业务层，业务层调用持久层，然后由持久层将数据插入到数据库中。dao是持久层，操作数据库相关的。service是业务层，ui对应的就是我们的表现层（也叫Web层）。表现层依赖了业务层，业务层依赖了持久层。
#### 1）持久层：mapper层
作用：主要是做数据持久层的工作，负责与数据库进行联络的一些任务都封装在此。
Dao层首先设计的是接口，然后再Spring的配置文件中定义接口的实现类。
然后可以在模块中进行接口的调用来进行数据业务的处理。（不在关心接口的实现类是哪个类）
数据源的配置以及有关数据库连接的参数都在Spring的配置文件中进行配置。
Mapper实现了mysql的数据读取和写入，User_loginMapper实现在用户登录的时候将用户账户密码与MySQL中数据的查询和插入（用model方法将login.jsp传递过来的用户账户和密码）、PathMapper实现对hadoopIp的路径查询和插入、

#### 2）业务层：Service层
作用：Service层主要负责业务模块的逻辑应用设计。
先设计接口然后再设计实类，然后再在Spring的配置文件中配置其实现的关联。（业务逻辑层的实现具体要调用到自己已经定义好的mapper的接口上）这样就可以在应用中调用Service接口来进行业务处理。
建立好mapper之后再建立service层，service层又要在controller层之下，因为既要调用mapper层的接口又要提供接口给controller层。每个模型都有一个service接口，每个接口分别封装各自的业务处理的方法。
User_loginService会调用User_loginMapper接口，又要给User_loginConterller提供接口，最终实现用户注册与登录。PathService会调用PathMapper接口，同时给conterller的Ipconterller提供接口。
#### 3）表现层：Controller层
作用：负责具体的业务模块流程的控制。
配置也同样是在Spring的配置文件里面进行，
调用Service层提供的接口来控制业务流程。
业务流程的不同会有不同的控制器，在具体的开发中可以将我们的流程进行抽象的归纳，设计出可以重复利用的子单元流程模块。

## 实现过程
### 1、ssm框架搭建
####（1）数据库建立数据表，以便于后面的数据库连接和增删改查操作做准备
user_login表（用户表）

![图片](https://user-images.githubusercontent.com/59997978/222330470-0fe2ede8-52b2-4f39-b04a-b64614d86f83.png)


path表（IP地址）：

![图片](https://user-images.githubusercontent.com/59997978/222330496-33528f7b-35c7-4e38-80d3-cb2614b6c2ba.png)

 cityname表(注册时城市位置下拉框所用)：
 
 ![图片](https://user-images.githubusercontent.com/59997978/222330539-cca55cfd-b215-450e-ae94-6d8f2cce1c5d.png)

city表（全国各地2022年5月21是否消费的数据）：

![图片](https://user-images.githubusercontent.com/59997978/222330584-1b1c4cb2-4f46-4eef-9eec-72d7c17336f0.png)

ads_area_topics表（2022年5月20-6月2日的日订单量和销售量数据）:

![图片](https://user-images.githubusercontent.com/59997978/222330621-c1b9a7f8-08e4-4ab6-84a0-9ef59c15fa20.png)

####（2）在eclispe中创建maven web项目，这里我的项目名是day0915:

![图片](https://user-images.githubusercontent.com/59997978/222330652-16f0ea16-a759-42ab-a871-a972096b9ae7.png)


####（3）配置文件
Web.xml

![图片](https://user-images.githubusercontent.com/59997978/222330724-03fd03cb-a297-4e9e-b08e-8c79f80610f2.png)

在src/main/resources源文件夹下创建JDBC资源属性文件bd.properties,其中设置了Mysql数据库库名test和数据库登录名以及密码：

![图片](https://user-images.githubusercontent.com/59997978/222330767-fdd78fb1-86a5-4828-b3a5-2820ca598dab.png)

 在src/main/resources源文件夹下创建spring-mybatis.xml配置文件，以配置日志框架。

![图片](https://user-images.githubusercontent.com/59997978/222330799-42086b76-bb27-4c8c-ba21-140c4479659f.png)

资源属性文件Logj4.properties文件:

![图片](https://user-images.githubusercontent.com/59997978/222330822-0fbfd900-d570-4d32-8b62-c9ea79a06923.png)

SpringMVC.xml文件配置视图解析器：

![图片](https://user-images.githubusercontent.com/59997978/222330846-4a163803-c7ae-4943-9d9f-eb0d658a55ed.png)

####（4）用户注册 
在pojo包下创建实体类user_login.java，和数据库user_login表属性一致
```
public class User_login {
	//字段内容
	int id;//用户id
	String username;//用户名
	String password;//用户密码
	String address;//用户地址
	String phone;//用户电话号码
```
####（5）创建UserMapper接口
```
public interface User_loginMapper {
	//通过用户Id查询用户
    User_login selectUser_loginById(User_login user_login);
	//新增
	int insert(User_login user_login);
	List<User_login> selectUser_login();
```

####（6）创建User_loginMapper.xml配置文件
在src/main/resources源文件夹下创建User_loginMapper.xml配置文件,里面写了一些查询和插入数据库的具体实现方法，是最接近数据库的一层。
```
<mapper namespace="cn.yq.ssm.mapper.User_loginMapper">
	<!-- 查询语句 -->
	<select id="selectUser_loginById" parameterType="cn.yq.ssm.pojo.User_login" resultType="cn.yq.ssm.pojo.User_login">
		select * from user_login where username=#{username} and password=#{password}
	</select>
	
	<!-- 查询语句 -->
	<select id="selectUser_login"  resultType="cn.yq.ssm.pojo.User_login">
		select * from user_login
	</select>
	
	<!-- 新增语句 -->
	<insert id="insert" parameterType="cn.yq.ssm.pojo.User_login">
		insert into user_login(username,password,address,phone) values(#{username},#{password},#{address},#{phone})
	</insert>
```

####（7）创建service接口User_loginService.java和实现类User_loginServiceImpl.java
在src/main/java源文件夹下创建com.cn.yn.service包，并在该包下创建User_loginService.java接口
```
User_loginService.java

public interface User_loginService {
	//查询
    User_login selectUser_loginById(User_login user_login);
	//新增
	int insert(User_login user_login);
	List<User_login> selectUser_login();
}
User_loginServiceImpl.java
@Service
public class User_loginServiceImpl implements User_loginService{
	//注入标签
	@Autowired
	private User_loginMapper user_loginMapper;
	@Override
	public User_login selectUser_loginById(User_login user_login) {
		System.out.println("userLogin Info"+user_loginMapper);
		return user_loginMapper.selectUser_loginById(user_login);
	}
	@Override
	public int insert(User_login user_login) {
		System.out.println("userLogin Info"+user_loginMapper);
		return user_loginMapper.insert(user_login);
	}
	@Override
	public List<User_login> selectUser_login() {
		return user_loginMapper.selectUser_login();
	}
}
```
####（8）创建UserController.java控制器类
其中‘/select’等表示localhost：8080视图层访问相关jsp页面的访问路径
```
//注入数据
	@Autowired
    private User_loginService service;
	@Autowired
	private CityService cityService;
	@Autowired
	private CityNameService cityNameService;
	@Autowired
	private PathService pathService;
	@RequestMapping("/login")

	public String userLogin(){
		return "login";
	}	
	@RequestMapping("/select")
	public String select(Model m){
	
		//在该方法中执行查询
		List<User_login> userList = service.selectUser_login();
	
		//Model方法可以将数据传递到页面显示数据
		m.addAttribute("userList", userList);
		
		return "index";
	}
	//登录
	@RequestMapping("/loginByUser")
	public String loginByUser(String username,String password,Model m){
		System.out.println("----"+username+password);
		//进行登录操作
		User_login userlogin = new User_login();
		userlogin.setUsername(username);
		userlogin.setPassword(password);		
		User_login ul = service.selectUser_loginById(userlogin);		
		if(ul==null){
			System.out.println("登录失败");
			//设置登录状态
			m.addAttribute("bug","账户或密码错误");
			//将页面返回到登录界面
			return "login";
		}		
		//将地址信息给到读取数据内容的方法
		Path path = pathService.selectPathByState();	
		//读取城市数据
		List<City> citylist = cityService.selectCity();
		setValues setValues =new setValues(path);
		Type type = setValues.setValues(citylist);
		//将数据存储到界面显示
		m.addAttribute("Type",type);	
		return "index";
	}
	//注册页面跳转
	@RequestMapping("/zc")
	public String zc(Model m){
		//给注册页面提供需要的参数值，显示地址数据
		List<CityName> citynamelist = cityNameService.selectCityName();	
		//将数据打包放到注册界面 Model
		m.addAttribute("citynamelist",citynamelist);	
		return "zc";
	}
	//1、读取注册页面传递过来的参数 2、将数据存储到数据库 3、进入登录页面（数据填充到页面）
    @RequestMapping("/insertZC")
    public String insertZC(String username,String phone,String password,String address,Model e){   	
        //将数据存储到数据库
    	User_login user = new User_login();
    	user.setPassword(password);
    	user.setUsername(username);
    	user.setPhone(phone);
    	user.setAddress(address);
    	
    	int num = service.insert(user);
    	if(num>0){
    		//数据添加成功 去到登录页面
    		//给登录页面添加对应的数据
    		e.addAttribute("bug","用户注册成功");
    		e.addAttribute("username",username);
    		e.addAttribute("password",password);
    		return "login";
    	}else{
    		//数据添加失败 回到原来界面
    		return "zc";
    	}  	
    	//课堂问题：如何判断是否存在相同的用户名，如何避免重复用户名
    }
    @RequestMapping("/ipUpdate")
    public String ipUpdate(Model m){
    	
    	//读取数据 给到ip界面
        List<Path> pathlist = 	pathService.selectPath();
        m.addAttribute("pathlist",pathlist);
		return "ipUpdate";
    }
}
```
####（9）登录页面：login.jsp（代码太多就贴一下重点的）
主要是用的表单提交申请以后，将请求转发通过User_loginMapper.xml(配置文件)——> User_login.java(实体类)——>UserMapper.java(动态接口)——>UserServiceImpl(业务逻辑)——>UserService(接口)—>UserController——>login.jsp的逆向顺序调用方法和借口，顺向传递数据再显示在页面上。
```
<div class="formControls col-xs-8">
          <input id="" name="username" type="text" placeholder="账户" class="input-text size-L" value="${username}">
        </div>
      </div>
      <div class="row cl">
        <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60e;</i></label>
        <div class="formControls col-xs-8">
          <input id="" name="password" type="password" placeholder="密码" class="input-text size-L" value="${password}">
        </div>
      </div>
  <div class="formControls col-xs-8 col-xs-offset-3">
          <input name="" type="submit" class="btn btn-success radius size-L" value="&nbsp;登&nbsp;&nbsp;&nbsp;&nbsp;录&nbsp;">
          <input name="" type="reset" class="btn btn-default radius size-L" value="&nbsp;取&nbsp;&nbsp;&nbsp;&nbsp;消&nbsp;">
          <a href="/day0915/user/zc.do" class="btn btn-default radius size-L">&nbsp;注&nbsp;&nbsp;&nbsp;&nbsp;册&nbsp;</a>
       </div>
      </div>
  ```
####（10）实现登录注册
登录

![图片](https://user-images.githubusercontent.com/59997978/222331093-79dee9d8-34df-468e-8a33-b5ae5ebde2a8.png)

登录成功后进入到主页：

![图片](https://user-images.githubusercontent.com/59997978/222331175-999e4232-808f-422c-8908-b214de8e6dda.png)

注册：

![图片](https://user-images.githubusercontent.com/59997978/222331191-24a28fc9-6fed-470e-96b7-2b3ca5d60ea3.png)

注册成功以后弹窗提示：

![图片](https://user-images.githubusercontent.com/59997978/222331204-5105816e-3b0d-42da-904a-19b936dcd6ca.png)

注册成功后查看数据库user_login表：

![图片](https://user-images.githubusercontent.com/59997978/222331228-99af2892-d11c-4652-a6d1-93a0c3e02025.png)

我们可以看到用户信息已插入进去了，至此登录注册功能就已经完成了。

### 2、IP修改和添加
ip修改和用户注册登录功能和实现原理基本相同，首先是建立path表：

hadoopPath表示虚拟机ip地址;
hadoopPathFile表示需要合并的文件所在的hdfs文件目录;
hadoopLog表示合并文件所存储的位置;
mapValues1表示数据库中感染者信息存储的文件位置;
mapValues2表示hdfs感染者信息存储文件位置;
state表示是否应用，1表示应用，0表示不应用

ip修改和添加主要代码（以添加为例）：
```
@RequestMapping("/ipInsert")
    public String ipInsert(Model m){
		return "ipInsert";
}

<!-- 添加数据 -->
	<insert id="ipInsert" parameterType="cn.yq.ssm.pojo.Path">
			insert into Path(hadoopPath,hadoopPathFile,hadoopLog,mapValues1,mapValues2,state) values(#{hadoopPath},#{hadoopPathFile},#{hadoopLog},#{mapValues1},#{mapValues2},#{state})
	</insert>

 //将读取页面提交上来的属性
    @RequestMapping("ipInsertValue")
    public String ipInsertValue(Path path){
    	//对传递上来的Path实体类对象进行数据库添加数据
    	if(path.getState()==1){
    		//将原来数据库的其他地址状态都设置为0，然后再添加数据
    		pathService.ipUpdateState();
    		pathService.ipInsert(path);
    	}else{
    		//直接添加数据
    		pathService.ipInsert(path);
    	}
		return "redirect:/ip/ipUpdate.do";
    }
}
```
点击ip修改地址进去后就是ip注册页面，点击提交后可以看到页面和数据库表里都多了一条记录：

![图片](https://user-images.githubusercontent.com/59997978/222331339-0b511168-e4ef-49f9-be9a-de1aee74dfb0.png)

点击旁边的笔就可以进入ip修改页面，可以设置立即应用和不应用，通过设置不同的IP地址，可以访问不同虚拟主机的不同资源:

![图片](https://user-images.githubusercontent.com/59997978/222331343-2dd96bd0-31fb-4476-bce4-294ea13fa890.png)

点击旁边的删除按钮就可以对数据库里的ip地址进行删除；至此，ip地址的修改和删除就结束了。

![图片](https://user-images.githubusercontent.com/59997978/222331349-99961265-6465-486d-8467-6e164f787523.png)

### 3、地图模块
首先建立city表：


其中包含lnglat:城市经纬度、name：城市名称、state：城市是否消费 三个属性；
只要state不为0，地图上就会出现一个点；

其次是地图数据来源:
我们是从网上下载的全国消费数据分析项目实例2021年的数据包；
由于下载的数据比较杂乱且多，我们选了2021年5月20日的消费数据进行地图展示。

![图片](https://user-images.githubusercontent.com/59997978/222331412-6823afcc-6e8e-4d2c-ae6b-974fe311f6c4.png)

为了更好实现数据地图展示，我对数据进行了手动清洗，去除不必要的属性列，只留下了
city_name：城市名称，后改为了name
lnglat：城市经纬度
orderday_count：日订单量，改为了state，state只要不为0，就会在地图上显示一个点，表示该地区有人消费

![图片](https://user-images.githubusercontent.com/59997978/222331456-b63832c9-a5a1-47f2-a53b-27552ed2f93f.png)

我们处理好的数据分成两个txt文件，分别上传至hdfs
首先启动hadoop集群：
Hadoop集群所有进程都已经启动

主要代码：
```
getcontent类：
//读取类写法
public class getContent2 {
	Path intputPath = null;//要写入的文件路径
	Path outputPath = null;//写出的文件路径
	
	//写一个类构造器
	public getContent2(String input,String output){
		//存储
		this.intputPath  = new Path(input);
		this.outputPath  = new Path(output);
	}
	//读取操作
	public void doget(cn.yq.ssm.pojo.Path pathM){
		try{
			//创建配置
			Configuration conf = new Configuration();
			//给配置传入参数
			conf.set("fs.defaultFs",pathM.getHadoopPath() );
			//导入一个包
			conf.set("fs.defaultFs","org.apache.hadoop.hdfs.DistributedFileSystem");
			
			//创建文件系统，一个输入一个输出
			FileSystem fsSource = FileSystem.get(URI.create(intputPath.toString()),conf);//输入
			FileSystem fsDst = FileSystem.get(URI.create(outputPath.toString()),conf);//输出
			
			//写文件过滤参数1地址 参数2 过滤,可以读取多个文件
			FileStatus[] sourceStatus = fsSource.listStatus(intputPath,new MypathFilter2(".*\\.xml"));
			
			//fs输出
			FSDataOutputStream fsdos = fsDst.create(outputPath);
			
			//创建新文件 来 存储数据
			File file = new File(pathM.getMapValues2());
			if(!file.exists()){
				//文件不存在则创建新闻件
				file.createNewFile();
			}else{
				file.delete();
				file.createNewFile();
			}	
			//打印流
			PrintStream setTxt = new PrintStream(new BufferedOutputStream(new FileOutputStream(file)),true);
			setTxt.print("var citys = [");
			for(int i=0;i<sourceStatus.length;i++){
				FileStatus sta = sourceStatus[i];
				System.out.print("读取虚拟机192.168.10.128主机的HDFS,路径"+sta.getPath()+"  内容：");
				FSDataInputStream fsdis  = fsSource.open(sta.getPath());
				//数据存储的对象类型
				byte[] data = new byte[1024];
				int read = -1;
				while(((read = fsdis.read(data))>0)){
					//将数据写入文件中
					setTxt.write(data,0,read);
					//输出到文件
					fsdos.write(data,0,read);
				}
				fsdis.close();
				//两个之间的内容叠加是没有分隔开来的,当最后一个文件没有管理下一个文件
				if(!(i+1==sourceStatus.length)){
					setTxt.print(",");
				}		
			}
			setTxt.print("]");
			fsdos.close();
      ```
创建类getContent2，实现将/user/hadoop下文件的内容进行合并。将两个txt数据合并，并且需要在中间加上逗号，结果写入values2.js中。在读入第一个文件时，不需要在末尾添加逗号，之后，每读入一个文件，则都需要先添加一个逗号。合并以后的values2.js文件。
![图片](https://user-images.githubusercontent.com/59997978/222331596-491f1e27-3c67-4629-a54b-5723fe29e7f8.png)


```
<script type="text/javascript" src='../js/value1.js'></script>  
<script type="text/javascript" src='../js/value2.js'></script>
<script type="text/javascript"
        src="https://webapi.amap.com/maps?v=2.0&key=f202e1df650d318b4e1fc0a6018704ea&plugin=AMap.Adaptor"></script>
<script type="text/javascript">
```
最终jsp页面通过读取values2.js和values1.js文件里的内容对数据进行展示；
运行以后：

![图片](https://user-images.githubusercontent.com/59997978/222331621-d2a3ad8e-d62b-47aa-a69a-179c91146d02.png)

去web页面上看我们可以看到文件已经合并成功：

![图片](https://user-images.githubusercontent.com/59997978/222331661-24eff733-e771-4b8b-8715-f5ecc77d0d45.png)

我们再登录进入index主页，点击大标题，就可以跳转到地图页面了：

![图片](https://user-images.githubusercontent.com/59997978/222331692-ab4d92f1-5438-4d7f-b0c4-fc7b5d0e4fd6.png)

