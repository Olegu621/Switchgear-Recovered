.class public abstract Lwo3;
.super Lqo3;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public c:Z


# direct methods
.method public constructor <init>(Lmp3;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lqo3;-><init>(Lmp3;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lqo3;->b:Lmp3;

    .line 5
    .line 6
    iget p1, p0, Lmp3;->c0:I

    .line 7
    .line 8
    add-int/lit8 p1, p1, 0x1

    .line 9
    .line 10
    iput p1, p0, Lmp3;->c0:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final A()V
    .locals 0

    .line 1
    iget-boolean p0, p0, Lwo3;->c:Z

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

.method public final B()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lwo3;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lwo3;->C()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lqo3;->b:Lmp3;

    .line 9
    .line 10
    iget v1, v0, Lmp3;->d0:I

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    add-int/2addr v1, v2

    .line 14
    iput v1, v0, Lmp3;->d0:I

    .line 15
    .line 16
    iput-boolean v2, p0, Lwo3;->c:Z

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const-string p0, "Can\'t initialize twice"

    .line 20
    .line 21
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public abstract C()V
.end method
