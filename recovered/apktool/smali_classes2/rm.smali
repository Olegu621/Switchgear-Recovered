.class public final Lrm;
.super Lat;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final d:Lzs;

.field public final e:Lzs;


# direct methods
.method public constructor <init>(Lzs;Lkotlin/coroutines/CoroutineContext;ILxk;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p3, p4}, Lat;-><init>(Lkotlin/coroutines/CoroutineContext;ILxk;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lrm;->d:Lzs;

    .line 5
    .line 6
    iput-object p1, p0, Lrm;->e:Lzs;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lxx1;Lc10;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lqm;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lqm;

    .line 7
    .line 8
    iget v1, v0, Lqm;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lqm;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lqm;

    .line 21
    .line 22
    check-cast p2, Ld10;

    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lqm;-><init>(Lrm;Ld10;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p2, v0, Lqm;->b:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v1, Lz10;->a:Lz10;

    .line 30
    .line 31
    iget v2, v0, Lqm;->d:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v4, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, Lqm;->a:Lxx1;

    .line 40
    .line 41
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v3

    .line 51
    :cond_2
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iput-object p1, v0, Lqm;->a:Lxx1;

    .line 55
    .line 56
    iput v4, v0, Lqm;->d:I

    .line 57
    .line 58
    iget-object p0, p0, Lrm;->d:Lzs;

    .line 59
    .line 60
    invoke-virtual {p0, p1, v0}, Lzs;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    if-ne p0, v1, :cond_3

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    :goto_1
    if-ne p0, v1, :cond_4

    .line 70
    .line 71
    return-object v1

    .line 72
    :cond_4
    :goto_2
    iget-object p0, p1, Lxx1;->f:Lzk;

    .line 73
    .line 74
    invoke-virtual {p0}, Lzk;->w()Z

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    if-eqz p0, :cond_5

    .line 79
    .line 80
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    return-object p0

    .line 83
    :cond_5
    const-string p0, "\'awaitClose { yourCallbackOrListener.cancel() }\' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."

    .line 84
    .line 85
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    return-object v3
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "block["

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lrm;->d:Lzs;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "] -> "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-super {p0}, Lat;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method
