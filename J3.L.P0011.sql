create database DB_P0011
use DB_P0011
create table tbl_Entry(
	entryID nvarchar(3) primary key,
	entryName nvarchar(100) not null,
	entryContent nvarchar(MAX) not null,
	publishedDate date not null  default getdate(),
	entryType int not null,
)
create table tbl_Image(
	imageID nvarchar(3),
	entryID nvarchar(3),
	descriptionPic nvarchar(1000),
	primary key (imageID,entryID)
)
alter table tbl_Image
add constraint FK_Image_Entry foreign key (entryID) references tbl_Entry(entryID)

create table tbl_Info(
	seq int identity(1,1),
	name nvarchar(50) not null,
	description nvarchar(MAX),
)


insert into tbl_Entry values('E1','Essential skills for a happy life!' ,'Lorem ipsum dolor sit amet consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip exea commodo consequat.<p></p>
At eam doctus oportere, eam feugait delectus ne. Quo cu vulputate persecuti. Eum ut natum possim comprehensam, habeo dicta scaevola eu nec. Ea adhuc reformidans eam. Pri dolore epicuri eu, ne cum tantas fierent instructior. Proridens intellegam ut, sea at graecis scriptorem eloquentiam.<p></p>
Per an labitur lucilius ullamcorper, esse erat ponderum ad vim. Possim laoreet suscipit ex pri, vix numquam eruditi feugait in. Nec maluisset complectitur te, at sea decore semper. Falli numquamperpetua sea et, tibique repudiandae an pro. Ut his solum persius postulant. Soluta nemore debitis ne eos, cum an scripta pericula partiendo.
',
'2015-11-16',1)

insert into tbl_Entry values('E2','You'+char(39)+'ve gotta dance','"“You'+char(39)+'ve gotta dance like there'+char(39)+'s nobody watching,<br/>
Love like you'+char(39)+'ll never be hurt,<br/>
Sing like there'+char(39)+'s nobody listening,<br/>
And live like it'+char(39)+'s heaven on earth.”<br/>
William W. Purkey','2015-11-16',2)

insert into tbl_Entry values('E3','Photo','','2015-11-16',3)

insert into tbl_Entry values('E4','Photo','','2018-11-16',3)

insert into tbl_Info values('Vivianne Russell','Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquipex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augueduis dolore te feugait nulla facilisi. Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. 
</span></p><p><span>
Typi non habent claritatem insitam; est usus legentis in iis qui facit eorumclaritatem. Investigationes demonstraverunt lectores legere me lius quod ii legunt saepius. Claritas est etiam processus dynamicus, qui sequitur mutationem consuetudium lectorum. Mirum est notare quam littera gothica, quam nunc putamus parum claram, anteposueritlitterarum formas humanitatis per seacula quarta decima et quinta decima. Eodem modo typi, qui nunc nobis videntur parum clari, fiant sollemnes in futurum.')

insert into tbl_Image values('I1','E1','./img/i283445314544979646._szw480h1280_.jpg')
insert into tbl_Image values('I3','E1','./img/i283445314544979644._szw1280h1280_.jpg')
insert into tbl_Image values('I2','E3','./img/i283445314544979644._szw1280h1280_.jpg')
insert into tbl_Image values('I1','E3','./img/i283445314544979646._szw480h1280_.jpg')
insert into tbl_Image values('I1','E4','./img/i283445314544979646._szw480h1280_.jpg')

select * from tbl_Entry
delete from tbl_Entry

select * from tbl_Info

select imageID,descriptionPic from tbl_Image where entryID = 'E1'