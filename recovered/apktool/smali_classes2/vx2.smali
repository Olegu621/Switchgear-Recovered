.class public final Lvx2;
.super Ls10;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final c:Lvx2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lvx2;

    .line 2
    .line 3
    invoke-direct {v0}, Ls10;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lvx2;->c:Lvx2;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final g(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    sget-object p0, Lm60;->d:Lm60;

    .line 2
    .line 3
    sget-object p1, Lym2;->h:Lvm2;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iget-object p0, p0, Lm60;->c:Lx10;

    .line 7
    .line 8
    invoke-virtual {p0, p2, p1, v0}, Lx10;->f(Ljava/lang/Runnable;Lvm2;Z)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final h(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    sget-object p0, Lm60;->d:Lm60;

    .line 2
    .line 3
    sget-object p1, Lym2;->h:Lvm2;

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iget-object p0, p0, Lm60;->c:Lx10;

    .line 7
    .line 8
    invoke-virtual {p0, p2, p1, v0}, Lx10;->f(Ljava/lang/Runnable;Lvm2;Z)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final k(I)Ls10;
    .locals 1

    .line 1
    invoke-static {p1}, Lj13;->c(I)V

    .line 2
    .line 3
    .line 4
    sget v0, Lym2;->d:I

    .line 5
    .line 6
    if-lt p1, v0, :cond_0

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-super {p0, p1}, Ls10;->k(I)Ls10;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method
