.class public final Lv01;
.super Lj42;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:Lqn1;

.field public b:Lau;

.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lz01;


# direct methods
.method public constructor <init>(Lc10;Lz01;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lv01;->e:Lz01;

    .line 2
    .line 3
    const/4 p2, 0x2

    .line 4
    invoke-direct {p0, p2, p1}, Lj42;-><init>(ILc10;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lc10;)Lc10;
    .locals 1

    .line 1
    new-instance v0, Lv01;

    .line 2
    .line 3
    iget-object p0, p0, Lv01;->e:Lz01;

    .line 4
    .line 5
    invoke-direct {v0, p2, p0}, Lv01;-><init>(Lc10;Lz01;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lv01;->d:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lr92;

    .line 2
    .line 3
    check-cast p2, Lc10;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lv01;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lv01;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lv01;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, Lz10;->a:Lz10;

    .line 2
    .line 3
    iget v1, p0, Lv01;->c:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    if-eq v1, v3, :cond_1

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lv01;->b:Lau;

    .line 14
    .line 15
    iget-object v3, p0, Lv01;->a:Lqn1;

    .line 16
    .line 17
    iget-object v4, p0, Lv01;->d:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v4, Lr92;

    .line 20
    .line 21
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    return-object p0

    .line 32
    :cond_1
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lv01;->d:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Lr92;

    .line 42
    .line 43
    iget-object v1, p0, Lv01;->e:Lz01;

    .line 44
    .line 45
    invoke-virtual {v1}, Lz01;->x()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    instance-of v4, v1, Lau;

    .line 50
    .line 51
    if-eqz v4, :cond_3

    .line 52
    .line 53
    check-cast v1, Lau;

    .line 54
    .line 55
    iget-object v1, v1, Lau;->v:Lcu;

    .line 56
    .line 57
    iput v3, p0, Lv01;->c:I

    .line 58
    .line 59
    invoke-virtual {p1, v1, p0}, Lr92;->a(Ljava/lang/Object;Lbi;)V

    .line 60
    .line 61
    .line 62
    return-object v0

    .line 63
    :cond_3
    instance-of v3, v1, Lix0;

    .line 64
    .line 65
    if-eqz v3, :cond_5

    .line 66
    .line 67
    check-cast v1, Lix0;

    .line 68
    .line 69
    invoke-interface {v1}, Lix0;->c()Lqn1;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    if-eqz v1, :cond_5

    .line 74
    .line 75
    invoke-virtual {v1}, Ls91;->h()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    check-cast v3, Ls91;

    .line 83
    .line 84
    move-object v4, v3

    .line 85
    move-object v3, v1

    .line 86
    move-object v1, v4

    .line 87
    move-object v4, p1

    .line 88
    :goto_0
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-nez p1, :cond_5

    .line 93
    .line 94
    instance-of p1, v1, Lau;

    .line 95
    .line 96
    if-eqz p1, :cond_4

    .line 97
    .line 98
    check-cast v1, Lau;

    .line 99
    .line 100
    iget-object p1, v1, Lau;->v:Lcu;

    .line 101
    .line 102
    iput-object v4, p0, Lv01;->d:Ljava/lang/Object;

    .line 103
    .line 104
    iput-object v3, p0, Lv01;->a:Lqn1;

    .line 105
    .line 106
    iput-object v1, p0, Lv01;->b:Lau;

    .line 107
    .line 108
    iput v2, p0, Lv01;->c:I

    .line 109
    .line 110
    invoke-virtual {v4, p1, p0}, Lr92;->a(Ljava/lang/Object;Lbi;)V

    .line 111
    .line 112
    .line 113
    sget-object p0, Lz10;->a:Lz10;

    .line 114
    .line 115
    return-object v0

    .line 116
    :cond_4
    :goto_1
    invoke-virtual {v1}, Ls91;->i()Ls91;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    goto :goto_0

    .line 121
    :cond_5
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 122
    .line 123
    return-object p0
.end method
