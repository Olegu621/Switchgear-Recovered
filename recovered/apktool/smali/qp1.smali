.class public final Lqp1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ld71;
.implements Lcr;


# instance fields
.field public final a:Lv61;

.field public final b:Lkp1;

.field public c:Lrp1;

.field public final synthetic d:Lsp1;


# direct methods
.method public constructor <init>(Lsp1;Lv61;Lkp1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lqp1;->d:Lsp1;

    .line 8
    .line 9
    iput-object p2, p0, Lqp1;->a:Lv61;

    .line 10
    .line 11
    iput-object p3, p0, Lqp1;->b:Lkp1;

    .line 12
    .line 13
    invoke-virtual {p2, p0}, Lv61;->a(Lf71;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, Lqp1;->a:Lv61;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lv61;->b(Lf71;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lqp1;->b:Lkp1;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Lkp1;->removeCancellable(Lcr;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lqp1;->c:Lrp1;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lrp1;->cancel()V

    .line 16
    .line 17
    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    iput-object v0, p0, Lqp1;->c:Lrp1;

    .line 20
    .line 21
    return-void
.end method

.method public final onStateChanged(Lg71;Lt61;)V
    .locals 8

    .line 1
    sget-object p1, Lt61;->ON_START:Lt61;

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    iget-object v2, p0, Lqp1;->d:Lsp1;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lqp1;->b:Lkp1;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object p2, v2, Lsp1;->b:Ldd;

    .line 16
    .line 17
    invoke-virtual {p2, p1}, Ldd;->addLast(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    new-instance p2, Lrp1;

    .line 21
    .line 22
    invoke-direct {p2, v2, p1}, Lrp1;-><init>(Lsp1;Lkp1;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p2}, Lkp1;->addCancellable(Lcr;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Lsp1;->d()V

    .line 29
    .line 30
    .line 31
    new-instance v0, Lv11;

    .line 32
    .line 33
    const/4 v6, 0x0

    .line 34
    const/4 v7, 0x3

    .line 35
    const/4 v1, 0x0

    .line 36
    const-class v3, Lsp1;

    .line 37
    .line 38
    const-string v4, "updateEnabledCallbacks"

    .line 39
    .line 40
    const-string v5, "updateEnabledCallbacks()V"

    .line 41
    .line 42
    invoke-direct/range {v0 .. v7}, Lv11;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v0}, Lkp1;->setEnabledChangedCallback$activity_release(Lkotlin/jvm/functions/Function0;)V

    .line 46
    .line 47
    .line 48
    iput-object p2, p0, Lqp1;->c:Lrp1;

    .line 49
    .line 50
    return-void

    .line 51
    :cond_0
    sget-object p1, Lt61;->ON_STOP:Lt61;

    .line 52
    .line 53
    if-ne p2, p1, :cond_1

    .line 54
    .line 55
    iget-object p0, p0, Lqp1;->c:Lrp1;

    .line 56
    .line 57
    if-eqz p0, :cond_2

    .line 58
    .line 59
    invoke-virtual {p0}, Lrp1;->cancel()V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_1
    sget-object p1, Lt61;->ON_DESTROY:Lt61;

    .line 64
    .line 65
    if-ne p2, p1, :cond_2

    .line 66
    .line 67
    invoke-virtual {p0}, Lqp1;->cancel()V

    .line 68
    .line 69
    .line 70
    :cond_2
    return-void
.end method
