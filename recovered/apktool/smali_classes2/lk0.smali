.class public final Llk0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lfk0;


# instance fields
.field public final synthetic a:Ld52;

.field public final synthetic b:Lo40;


# direct methods
.method public constructor <init>(Ld52;Lo40;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Llk0;->a:Ld52;

    .line 5
    .line 6
    iput-object p2, p0, Llk0;->b:Lo40;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final collect(Lhk0;Lc10;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, Lkk0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lkk0;

    .line 7
    .line 8
    iget v1, v0, Lkk0;->b:I

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
    iput v1, v0, Lkk0;->b:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lkk0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lkk0;-><init>(Llk0;Lc10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lkk0;->a:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Lkk0;->b:I

    .line 30
    .line 31
    const/4 v3, 0x3

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    const/4 v6, 0x0

    .line 35
    if-eqz v2, :cond_4

    .line 36
    .line 37
    if-eq v2, v5, :cond_3

    .line 38
    .line 39
    if-eq v2, v4, :cond_2

    .line 40
    .line 41
    if-ne v2, v3, :cond_1

    .line 42
    .line 43
    iget-object p0, v0, Lkk0;->d:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p0, Lw52;

    .line 46
    .line 47
    :try_start_0
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    goto :goto_2

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    goto :goto_3

    .line 53
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object v6

    .line 59
    :cond_2
    iget-object p0, v0, Lkk0;->d:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p0, Ljava/lang/Throwable;

    .line 62
    .line 63
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto :goto_6

    .line 67
    :cond_3
    iget-object p1, v0, Lkk0;->e:Lhk0;

    .line 68
    .line 69
    iget-object p0, v0, Lkk0;->d:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p0, Llk0;

    .line 72
    .line 73
    :try_start_1
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :catchall_1
    move-exception p1

    .line 78
    move-object v7, p1

    .line 79
    move-object p1, p0

    .line 80
    move-object p0, v7

    .line 81
    goto :goto_4

    .line 82
    :cond_4
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :try_start_2
    iget-object p2, p0, Llk0;->a:Ld52;

    .line 86
    .line 87
    iput-object p0, v0, Lkk0;->d:Ljava/lang/Object;

    .line 88
    .line 89
    iput-object p1, v0, Lkk0;->e:Lhk0;

    .line 90
    .line 91
    iput v5, v0, Lkk0;->b:I

    .line 92
    .line 93
    invoke-virtual {p2, p1, v0}, Ld52;->collect(Lhk0;Lc10;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 97
    if-ne p2, v1, :cond_5

    .line 98
    .line 99
    goto :goto_5

    .line 100
    :cond_5
    :goto_1
    new-instance p2, Lw52;

    .line 101
    .line 102
    invoke-interface {v0}, Lc10;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-direct {p2, p1, v2}, Lw52;-><init>(Lhk0;Lkotlin/coroutines/CoroutineContext;)V

    .line 107
    .line 108
    .line 109
    :try_start_3
    iget-object p0, p0, Llk0;->b:Lo40;

    .line 110
    .line 111
    iput-object p2, v0, Lkk0;->d:Ljava/lang/Object;

    .line 112
    .line 113
    iput-object v6, v0, Lkk0;->e:Lhk0;

    .line 114
    .line 115
    iput v3, v0, Lkk0;->b:I

    .line 116
    .line 117
    invoke-virtual {p0, p2, v6, v0}, Lo40;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 121
    if-ne p0, v1, :cond_6

    .line 122
    .line 123
    goto :goto_5

    .line 124
    :cond_6
    move-object p0, p2

    .line 125
    :goto_2
    invoke-virtual {p0}, Ld10;->releaseIntercepted()V

    .line 126
    .line 127
    .line 128
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 129
    .line 130
    return-object p0

    .line 131
    :catchall_2
    move-exception p1

    .line 132
    move-object p0, p2

    .line 133
    :goto_3
    invoke-virtual {p0}, Ld10;->releaseIntercepted()V

    .line 134
    .line 135
    .line 136
    throw p1

    .line 137
    :goto_4
    new-instance p2, Lgo2;

    .line 138
    .line 139
    invoke-direct {p2, p0}, Lgo2;-><init>(Ljava/lang/Throwable;)V

    .line 140
    .line 141
    .line 142
    iget-object p1, p1, Llk0;->b:Lo40;

    .line 143
    .line 144
    iput-object p0, v0, Lkk0;->d:Ljava/lang/Object;

    .line 145
    .line 146
    iput-object v6, v0, Lkk0;->e:Lhk0;

    .line 147
    .line 148
    iput v4, v0, Lkk0;->b:I

    .line 149
    .line 150
    invoke-static {p2, p1, p0, v0}, Lw11;->a(Lgo2;Lo40;Ljava/lang/Throwable;Ld10;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    if-ne p1, v1, :cond_7

    .line 155
    .line 156
    :goto_5
    return-object v1

    .line 157
    :cond_7
    :goto_6
    throw p0
.end method
