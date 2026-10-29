.class public final Lu42;
.super Lo01;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final v:Lp01;


# direct methods
.method public constructor <init>(Lp01;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ls91;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu42;->v:Lp01;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lo01;->o()Lz01;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lz01;->x()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    instance-of v0, p1, Lnx;

    .line 10
    .line 11
    iget-object p0, p0, Lu42;->v:Lp01;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    sget-object v0, Lo42;->b:Lm42;

    .line 16
    .line 17
    check-cast p1, Lnx;

    .line 18
    .line 19
    iget-object p1, p1, Lnx;->a:Ljava/lang/Throwable;

    .line 20
    .line 21
    invoke-static {p1}, Lpg3;->e(Ljava/lang/Throwable;)Ln42;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p0, p1}, Ler;->resumeWith(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    sget-object v0, Lo42;->b:Lm42;

    .line 30
    .line 31
    invoke-static {p1}, Lj13;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p0, p1}, Ler;->resumeWith(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method
