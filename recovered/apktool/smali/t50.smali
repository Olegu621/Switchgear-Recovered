.class public final Lt50;
.super Ls50;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lc10;


# instance fields
.field public a:Li21;

.field public b:Lkotlin/Unit;

.field public c:Lc10;

.field public d:Ljava/lang/Object;


# virtual methods
.method public final getContext()Lkotlin/coroutines/CoroutineContext;
    .locals 0

    .line 1
    sget-object p0, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 2
    .line 3
    return-object p0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lt50;->c:Lc10;

    .line 3
    .line 4
    iput-object p1, p0, Lt50;->d:Ljava/lang/Object;

    .line 5
    .line 6
    return-void
.end method
