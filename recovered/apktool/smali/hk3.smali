.class public abstract Lhk3;
.super Lsq3;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public b:Z


# direct methods
.method public constructor <init>(Lij3;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lsq3;-><init>(Lij3;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Lij3;

    .line 7
    .line 8
    iget p1, p0, Lij3;->l0:I

    .line 9
    .line 10
    add-int/lit8 p1, p1, 0x1

    .line 11
    .line 12
    iput p1, p0, Lij3;->l0:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public abstract A()Z
.end method

.method public final B()V
    .locals 0

    .line 1
    iget-boolean p0, p0, Lhk3;->b:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p0, "Not initialized"

    .line 7
    .line 8
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final C()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lhk3;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lhk3;->A()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lij3;

    .line 14
    .line 15
    iget-object v0, v0, Lij3;->n0:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    iput-boolean v0, p0, Lhk3;->b:Z

    .line 22
    .line 23
    :cond_0
    return-void

    .line 24
    :cond_1
    const-string p0, "Can\'t initialize twice"

    .line 25
    .line 26
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method
