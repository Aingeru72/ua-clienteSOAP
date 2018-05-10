<%@include file="/templates/head.jsp"%>
<%@include file="/templates/navbar.jsp"%>

<h1>UNIVERSIDAD DE ALICANTE</h1>

<div class="row">

	<div class="col-sm-8">
		<h2>Noticias</h2>

		<c:forEach items="${noticias}" var="noticia" begin="0" end="9">
			<h3>
				<a href="${noticia.url}" target="_blanck" style>${noticia.titulo}</a>
			</h3>
			<p>${noticia.contenido}</p>
			<%-- 			<c:if test="${noticia.fechapublicacion != null}"> --%>
			<%-- 				<p>${noticia.fechapublicacion}</p> --%>
			<%-- 			</c:if> --%>
			<%-- 			<img src="${noticia.imagen}" alt="${noticia.titulo}"> --%>
			<hr>
		</c:forEach>
	</div>

	<div class="col-sm-4">
		<h2>Calendario</h2>
		${festivos}
<!-- 		<ul> -->
<%-- 			<c:forEach items="${festivos}" var="festivo" begin="0" end="9"> --%>
<%-- 				<li>${festivo.nomtipo}</li> --%>
<%-- 			</c:forEach> --%>
<!-- 		</ul> -->

	</div>

</div>



<jsp:include page="templates/footer.jsp"></jsp:include>