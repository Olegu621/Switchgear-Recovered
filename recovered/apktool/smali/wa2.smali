.class public final Lwa2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public a:Landroid/webkit/ServiceWorkerWebSettings;


# virtual methods
.method public final a()Landroid/webkit/ServiceWorkerWebSettings;
    .locals 2

    .line 1
    iget-object v0, p0, Lwa2;->a:Landroid/webkit/ServiceWorkerWebSettings;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lc73;->a:Ler0;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-static {v1}, Ljava/lang/reflect/Proxy;->getInvocationHandler(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v0, v0, Ler0;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;

    .line 15
    .line 16
    invoke-interface {v0, v1}, Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;->convertServiceWorkerSettings(Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Landroid/webkit/ServiceWorkerWebSettings;

    .line 21
    .line 22
    iput-object v0, p0, Lwa2;->a:Landroid/webkit/ServiceWorkerWebSettings;

    .line 23
    .line 24
    :cond_0
    iget-object p0, p0, Lwa2;->a:Landroid/webkit/ServiceWorkerWebSettings;

    .line 25
    .line 26
    return-object p0
.end method
