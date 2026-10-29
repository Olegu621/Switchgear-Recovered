.class public final Lo62;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ld71;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ln62;

.field public c:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ln62;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo62;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lo62;->b:Ln62;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lv61;Lx62;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-boolean v0, p0, Lo62;->c:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lo62;->c:Z

    .line 13
    .line 14
    invoke-virtual {p1, p0}, Lv61;->a(Lf71;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lo62;->b:Ln62;

    .line 18
    .line 19
    iget-object p1, p1, Ln62;->e:Lw62;

    .line 20
    .line 21
    iget-object p0, p0, Lo62;->a:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p2, p0, p1}, Lx62;->c(Ljava/lang/String;Lw62;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    const-string p0, "Already attached to lifecycleOwner"

    .line 28
    .line 29
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final onStateChanged(Lg71;Lt61;)V
    .locals 1

    .line 1
    sget-object v0, Lt61;->ON_DESTROY:Lt61;

    .line 2
    .line 3
    if-ne p2, v0, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    iput-boolean p2, p0, Lo62;->c:Z

    .line 7
    .line 8
    invoke-interface {p1}, Lg71;->getLifecycle()Lv61;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1, p0}, Lv61;->b(Lf71;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method
