.class public final Loy1;
.super Ltj2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:Ljava/lang/Exception;

.field public b:I

.field public c:I

.field public final synthetic d:I

.field public final synthetic e:J

.field public final synthetic f:J

.field public final synthetic i:J

.field public final synthetic v:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(IJJJLkotlin/jvm/functions/Function1;Lc10;)V
    .locals 0

    .line 1
    iput p1, p0, Loy1;->d:I

    .line 2
    .line 3
    iput-wide p2, p0, Loy1;->e:J

    .line 4
    .line 5
    iput-wide p4, p0, Loy1;->f:J

    .line 6
    .line 7
    iput-wide p6, p0, Loy1;->i:J

    .line 8
    .line 9
    iput-object p8, p0, Loy1;->v:Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p9}, Ltj2;-><init>(ILc10;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lc10;)Lc10;
    .locals 10

    .line 1
    new-instance v0, Loy1;

    .line 2
    .line 3
    iget-wide v6, p0, Loy1;->i:J

    .line 4
    .line 5
    iget-object v8, p0, Loy1;->v:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    iget v1, p0, Loy1;->d:I

    .line 8
    .line 9
    iget-wide v2, p0, Loy1;->e:J

    .line 10
    .line 11
    iget-wide v4, p0, Loy1;->f:J

    .line 12
    .line 13
    move-object v9, p2

    .line 14
    invoke-direct/range {v0 .. v9}, Loy1;-><init>(IJJJLkotlin/jvm/functions/Function1;Lc10;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ly10;

    .line 2
    .line 3
    check-cast p2, Lc10;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Loy1;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Loy1;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Loy1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    sget-object v0, Lz10;->a:Lz10;

    .line 2
    .line 3
    iget v1, p0, Loy1;->c:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    if-eq v1, v4, :cond_1

    .line 11
    .line 12
    if-ne v1, v3, :cond_0

    .line 13
    .line 14
    iget v1, p0, Loy1;->b:I

    .line 15
    .line 16
    :try_start_0
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    return-object p1

    .line 20
    :catch_0
    move-exception p1

    .line 21
    move-object v5, p1

    .line 22
    goto :goto_3

    .line 23
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-object v2

    .line 29
    :cond_1
    iget v1, p0, Loy1;->b:I

    .line 30
    .line 31
    iget-object v5, p0, Loy1;->a:Ljava/lang/Exception;

    .line 32
    .line 33
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    const/4 p1, 0x0

    .line 41
    move v1, p1

    .line 42
    move-object v5, v2

    .line 43
    :goto_0
    iget p1, p0, Loy1;->d:I

    .line 44
    .line 45
    if-ge v1, p1, :cond_7

    .line 46
    .line 47
    if-lez v1, :cond_3

    .line 48
    .line 49
    int-to-long v6, v1

    .line 50
    iget-wide v8, p0, Loy1;->e:J

    .line 51
    .line 52
    mul-long/2addr v8, v6

    .line 53
    mul-long/2addr v8, v6

    .line 54
    iget-wide v6, p0, Loy1;->f:J

    .line 55
    .line 56
    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 57
    .line 58
    .line 59
    move-result-wide v6

    .line 60
    iget-wide v8, p0, Loy1;->i:J

    .line 61
    .line 62
    long-to-double v8, v8

    .line 63
    invoke-static {}, Ljava/lang/Math;->random()D

    .line 64
    .line 65
    .line 66
    move-result-wide v10

    .line 67
    mul-double/2addr v10, v8

    .line 68
    double-to-long v8, v10

    .line 69
    add-long/2addr v6, v8

    .line 70
    iput-object v5, p0, Loy1;->a:Ljava/lang/Exception;

    .line 71
    .line 72
    iput v1, p0, Loy1;->b:I

    .line 73
    .line 74
    iput v4, p0, Loy1;->c:I

    .line 75
    .line 76
    invoke-static {v6, v7, p0}, Lw11;->h(JLd10;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    if-ne p1, v0, :cond_3

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_3
    :goto_1
    iget-object p1, p0, Loy1;->v:Lkotlin/jvm/functions/Function1;

    .line 84
    .line 85
    invoke-interface {p1, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    check-cast p1, Le70;

    .line 90
    .line 91
    if-eqz p1, :cond_5

    .line 92
    .line 93
    :try_start_1
    iput-object v2, p0, Loy1;->a:Ljava/lang/Exception;

    .line 94
    .line 95
    iput v1, p0, Loy1;->b:I

    .line 96
    .line 97
    iput v3, p0, Loy1;->c:I

    .line 98
    .line 99
    invoke-interface {p1, p0}, Le70;->await(Lc10;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 103
    if-ne p0, v0, :cond_4

    .line 104
    .line 105
    :goto_2
    return-object v0

    .line 106
    :cond_4
    return-object p0

    .line 107
    :goto_3
    add-int/2addr v1, v4

    .line 108
    goto :goto_0

    .line 109
    :cond_5
    if-eqz v5, :cond_6

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_6
    new-instance v5, Ljava/lang/Exception;

    .line 113
    .line 114
    const-string p0, "attempt returned null"

    .line 115
    .line 116
    invoke-direct {v5, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    :goto_4
    throw v5

    .line 120
    :cond_7
    if-eqz v5, :cond_8

    .line 121
    .line 122
    goto :goto_5

    .line 123
    :cond_8
    new-instance v5, Ljava/lang/Exception;

    .line 124
    .line 125
    const-string p0, "max retries"

    .line 126
    .line 127
    invoke-direct {v5, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    :goto_5
    throw v5
.end method
