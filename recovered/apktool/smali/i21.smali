.class public final Li21;
.super Lj42;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Llo0;


# instance fields
.field public a:I

.field public synthetic b:Ls50;

.field public final synthetic c:Ln7;


# direct methods
.method public constructor <init>(Ln7;Lc10;)V
    .locals 0

    .line 1
    iput-object p1, p0, Li21;->c:Ln7;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p1, p2}, Lj42;-><init>(ILc10;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ls50;

    .line 2
    .line 3
    check-cast p2, Lkotlin/Unit;

    .line 4
    .line 5
    check-cast p3, Lc10;

    .line 6
    .line 7
    new-instance p2, Li21;

    .line 8
    .line 9
    iget-object p0, p0, Li21;->c:Ln7;

    .line 10
    .line 11
    invoke-direct {p2, p0, p3}, Li21;-><init>(Ln7;Lc10;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p2, Li21;->b:Ls50;

    .line 15
    .line 16
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p2, p0}, Li21;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Li21;->c:Ln7;

    .line 2
    .line 3
    iget-object v1, v0, Ln7;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lkn;

    .line 6
    .line 7
    sget-object v2, Lz10;->a:Lz10;

    .line 8
    .line 9
    iget v3, p0, Li21;->a:I

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x1

    .line 13
    if-eqz v3, :cond_1

    .line 14
    .line 15
    if-ne v3, v5, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object v4

    .line 27
    :cond_1
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Li21;->b:Ls50;

    .line 31
    .line 32
    invoke-virtual {v1}, Lkn;->q()B

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-ne v3, v5, :cond_2

    .line 37
    .line 38
    invoke-virtual {v0, v5}, Ln7;->g(Z)Lkotlinx/serialization/json/d;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :cond_2
    const/4 v6, 0x0

    .line 44
    if-nez v3, :cond_3

    .line 45
    .line 46
    invoke-virtual {v0, v6}, Ln7;->g(Z)Lkotlinx/serialization/json/d;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :cond_3
    const/4 v7, 0x6

    .line 52
    if-ne v3, v7, :cond_5

    .line 53
    .line 54
    iput v5, p0, Li21;->a:I

    .line 55
    .line 56
    invoke-static {v0, p1, p0}, Ln7;->a(Ln7;Ls50;Lbi;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-ne p1, v2, :cond_4

    .line 61
    .line 62
    return-object v2

    .line 63
    :cond_4
    :goto_0
    check-cast p1, Lkotlinx/serialization/json/b;

    .line 64
    .line 65
    return-object p1

    .line 66
    :cond_5
    const/16 p0, 0x8

    .line 67
    .line 68
    if-ne v3, p0, :cond_6

    .line 69
    .line 70
    invoke-virtual {v0}, Ln7;->f()Lkotlinx/serialization/json/a;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :cond_6
    const-string p0, "Can\'t begin reading element, unexpected token"

    .line 76
    .line 77
    invoke-static {v1, p0, v6, v7}, Lkn;->m(Lkn;Ljava/lang/String;II)V

    .line 78
    .line 79
    .line 80
    throw v4
.end method
