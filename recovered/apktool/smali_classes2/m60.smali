.class public final Lm60;
.super Lnf0;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final d:Lm60;


# instance fields
.field public c:Lx10;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lm60;

    .line 2
    .line 3
    sget v3, Lym2;->c:I

    .line 4
    .line 5
    sget v4, Lym2;->d:I

    .line 6
    .line 7
    sget-wide v5, Lym2;->e:J

    .line 8
    .line 9
    sget-object v2, Lym2;->a:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {v0}, Ls10;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v1, Lx10;

    .line 15
    .line 16
    invoke-direct/range {v1 .. v6}, Lx10;-><init>(Ljava/lang/String;IIJ)V

    .line 17
    .line 18
    .line 19
    iput-object v1, v0, Lm60;->c:Lx10;

    .line 20
    .line 21
    sput-object v0, Lm60;->d:Lm60;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Dispatchers.Default cannot be closed"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final g(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lm60;->c:Lx10;

    .line 2
    .line 3
    const/4 p1, 0x6

    .line 4
    invoke-static {p0, p2, p1}, Lx10;->g(Lx10;Ljava/lang/Runnable;I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final h(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lm60;->c:Lx10;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-static {p0, p2, p1}, Lx10;->g(Lx10;Ljava/lang/Runnable;I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final k(I)Ls10;
    .locals 1

    .line 1
    const/4 p1, 0x1

    .line 2
    invoke-static {p1}, Lj13;->c(I)V

    .line 3
    .line 4
    .line 5
    sget v0, Lym2;->c:I

    .line 6
    .line 7
    if-lt p1, v0, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-super {p0, p1}, Ls10;->k(I)Ls10;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "Dispatchers.Default"

    .line 2
    .line 3
    return-object p0
.end method
