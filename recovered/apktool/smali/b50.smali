.class public final Lb50;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lh40;


# instance fields
.field public final a:Lqh0;

.field public final b:Lzb0;

.field public final c:Ly10;

.field public final d:Lts0;

.field public final e:Lgl1;

.field public f:I

.field public g:Lig2;

.field public final h:Lgr0;

.field public final i:Lra2;

.field public final j:Lhk2;

.field public final k:Lhk2;

.field public final l:Lra2;


# direct methods
.method public constructor <init>(Lqh0;Ljava/util/List;Lzb0;Ly10;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lb50;->a:Lqh0;

    .line 8
    .line 9
    iput-object p3, p0, Lb50;->b:Lzb0;

    .line 10
    .line 11
    iput-object p4, p0, Lb50;->c:Ly10;

    .line 12
    .line 13
    new-instance p1, Lzs;

    .line 14
    .line 15
    const/4 p3, 0x0

    .line 16
    invoke-direct {p1, p0, p3}, Lzs;-><init>(Lb50;Lc10;)V

    .line 17
    .line 18
    .line 19
    new-instance v0, Lts0;

    .line 20
    .line 21
    invoke-direct {v0, p1}, Lts0;-><init>(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lb50;->d:Lts0;

    .line 25
    .line 26
    new-instance p1, Lgl1;

    .line 27
    .line 28
    invoke-direct {p1}, Lgl1;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lb50;->e:Lgl1;

    .line 32
    .line 33
    new-instance p1, Lgr0;

    .line 34
    .line 35
    const/16 v0, 0x13

    .line 36
    .line 37
    invoke-direct {p1, v0}, Lgr0;-><init>(I)V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Lb50;->h:Lgr0;

    .line 41
    .line 42
    new-instance p1, Lra2;

    .line 43
    .line 44
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    iput-object p0, p1, Lra2;->d:Ljava/lang/Object;

    .line 51
    .line 52
    new-instance v0, Lgl1;

    .line 53
    .line 54
    invoke-direct {v0}, Lgl1;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object v0, p1, Lra2;->a:Ljava/lang/Object;

    .line 58
    .line 59
    new-instance v0, Lkx;

    .line 60
    .line 61
    invoke-direct {v0}, Lkx;-><init>()V

    .line 62
    .line 63
    .line 64
    iput-object v0, p1, Lra2;->b:Ljava/lang/Object;

    .line 65
    .line 66
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->K(Ljava/lang/Iterable;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    iput-object p2, p1, Lra2;->c:Ljava/lang/Object;

    .line 71
    .line 72
    iput-object p1, p0, Lb50;->i:Lra2;

    .line 73
    .line 74
    new-instance p1, Lm40;

    .line 75
    .line 76
    const/4 p2, 0x1

    .line 77
    invoke-direct {p1, p0, p2}, Lm40;-><init>(Lb50;I)V

    .line 78
    .line 79
    .line 80
    invoke-static {p1}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    iput-object p1, p0, Lb50;->j:Lhk2;

    .line 85
    .line 86
    new-instance p1, Lm40;

    .line 87
    .line 88
    const/4 p2, 0x0

    .line 89
    invoke-direct {p1, p0, p2}, Lm40;-><init>(Lb50;I)V

    .line 90
    .line 91
    .line 92
    invoke-static {p1}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    iput-object p1, p0, Lb50;->k:Lhk2;

    .line 97
    .line 98
    new-instance p1, Lra2;

    .line 99
    .line 100
    new-instance p2, Lo;

    .line 101
    .line 102
    const/4 v0, 0x6

    .line 103
    invoke-direct {p2, p0, v0}, Lo;-><init>(Ljava/lang/Object;I)V

    .line 104
    .line 105
    .line 106
    new-instance v1, Ltm;

    .line 107
    .line 108
    const/4 v2, 0x5

    .line 109
    invoke-direct {v1, p0, p3, v2}, Ltm;-><init>(Ljava/lang/Object;Lc10;I)V

    .line 110
    .line 111
    .line 112
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 113
    .line 114
    .line 115
    iput-object p4, p1, Lra2;->a:Ljava/lang/Object;

    .line 116
    .line 117
    iput-object v1, p1, Lra2;->b:Ljava/lang/Object;

    .line 118
    .line 119
    const v1, 0x7fffffff

    .line 120
    .line 121
    .line 122
    invoke-static {v1, p3, v0}, Lhu0;->F(ILxk;I)Lzk;

    .line 123
    .line 124
    .line 125
    move-result-object p3

    .line 126
    iput-object p3, p1, Lra2;->c:Ljava/lang/Object;

    .line 127
    .line 128
    new-instance p3, Lqc3;

    .line 129
    .line 130
    const/16 v0, 0xa

    .line 131
    .line 132
    invoke-direct {p3, v0}, Lqc3;-><init>(I)V

    .line 133
    .line 134
    .line 135
    iput-object p3, p1, Lra2;->d:Ljava/lang/Object;

    .line 136
    .line 137
    invoke-interface {p4}, Ly10;->c()Lkotlin/coroutines/CoroutineContext;

    .line 138
    .line 139
    .line 140
    move-result-object p3

    .line 141
    sget-object p4, Lxt0;->w:Lxt0;

    .line 142
    .line 143
    invoke-interface {p3, p4}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/f;)Lkotlin/coroutines/CoroutineContext$Element;

    .line 144
    .line 145
    .line 146
    move-result-object p3

    .line 147
    check-cast p3, Lh01;

    .line 148
    .line 149
    if-eqz p3, :cond_0

    .line 150
    .line 151
    new-instance p4, Loc;

    .line 152
    .line 153
    const/16 v0, 0x8

    .line 154
    .line 155
    invoke-direct {p4, v0, p2, p1}, Loc;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    invoke-interface {p3, p4}, Lh01;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Le90;

    .line 159
    .line 160
    .line 161
    :cond_0
    iput-object p1, p0, Lb50;->l:Lra2;

    .line 162
    .line 163
    return-void
.end method

.method public static final b(Lb50;Ld10;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, Lq40;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lq40;

    .line 7
    .line 8
    iget v1, v0, Lq40;->e:I

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
    iput v1, v0, Lq40;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lq40;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lq40;-><init>(Lb50;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lq40;->c:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Lq40;->e:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    iget-object p0, v0, Lq40;->b:Lgl1;

    .line 38
    .line 39
    iget-object v0, v0, Lq40;->a:Lb50;

    .line 40
    .line 41
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    move-object p1, p0

    .line 45
    move-object p0, v0

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v4

    .line 53
    :cond_2
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Lb50;->e:Lgl1;

    .line 57
    .line 58
    iput-object p0, v0, Lq40;->a:Lb50;

    .line 59
    .line 60
    iput-object p1, v0, Lq40;->b:Lgl1;

    .line 61
    .line 62
    iput v3, v0, Lq40;->e:I

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Lgl1;->d(Ld10;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    if-ne v0, v1, :cond_3

    .line 69
    .line 70
    return-object v1

    .line 71
    :cond_3
    :goto_1
    :try_start_0
    iget v0, p0, Lb50;->f:I

    .line 72
    .line 73
    add-int/lit8 v0, v0, -0x1

    .line 74
    .line 75
    iput v0, p0, Lb50;->f:I

    .line 76
    .line 77
    if-nez v0, :cond_5

    .line 78
    .line 79
    iget-object v0, p0, Lb50;->g:Lig2;

    .line 80
    .line 81
    if-eqz v0, :cond_4

    .line 82
    .line 83
    invoke-virtual {v0, v4}, Lz01;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 84
    .line 85
    .line 86
    goto :goto_2

    .line 87
    :catchall_0
    move-exception p0

    .line 88
    goto :goto_3

    .line 89
    :cond_4
    :goto_2
    iput-object v4, p0, Lb50;->g:Lig2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    .line 91
    :cond_5
    invoke-virtual {p1, v4}, Lgl1;->g(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    return-object p0

    .line 97
    :goto_3
    invoke-virtual {p1, v4}, Lgl1;->g(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    throw p0
.end method

.method public static final c(Lb50;Lkh1;Ld10;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, Lr40;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lr40;

    .line 7
    .line 8
    iget v1, v0, Lr40;->f:I

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
    iput v1, v0, Lr40;->f:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lr40;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lr40;-><init>(Lb50;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lr40;->d:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Lr40;->f:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x3

    .line 33
    const/4 v5, 0x2

    .line 34
    const/4 v6, 0x1

    .line 35
    if-eqz v2, :cond_4

    .line 36
    .line 37
    if-eq v2, v6, :cond_1

    .line 38
    .line 39
    if-eq v2, v5, :cond_3

    .line 40
    .line 41
    if-ne v2, v4, :cond_2

    .line 42
    .line 43
    :cond_1
    iget-object p0, v0, Lr40;->a:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p0, Ljx;

    .line 46
    .line 47
    :try_start_0
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    goto/16 :goto_6

    .line 51
    .line 52
    :catchall_0
    move-exception p1

    .line 53
    goto/16 :goto_7

    .line 54
    .line 55
    :cond_2
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object v3

    .line 61
    :cond_3
    iget-object p0, v0, Lr40;->c:Lkx;

    .line 62
    .line 63
    iget-object p1, v0, Lr40;->b:Lb50;

    .line 64
    .line 65
    iget-object v2, v0, Lr40;->a:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v2, Lkh1;

    .line 68
    .line 69
    :try_start_1
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    .line 71
    .line 72
    move-object p2, p0

    .line 73
    move-object p0, p1

    .line 74
    move-object p1, v2

    .line 75
    goto :goto_4

    .line 76
    :cond_4
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    iget-object p2, p1, Lkh1;->b:Lkx;

    .line 80
    .line 81
    :try_start_2
    sget-object v2, Lo42;->b:Lm42;

    .line 82
    .line 83
    iget-object v2, p0, Lb50;->h:Lgr0;

    .line 84
    .line 85
    invoke-virtual {v2}, Lgr0;->r()Log2;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    instance-of v7, v2, Lx30;

    .line 90
    .line 91
    if-eqz v7, :cond_6

    .line 92
    .line 93
    iget-object v2, p1, Lkh1;->a:Lkotlin/jvm/functions/Function2;

    .line 94
    .line 95
    iget-object p1, p1, Lkh1;->d:Lkotlin/coroutines/CoroutineContext;

    .line 96
    .line 97
    iput-object p2, v0, Lr40;->a:Ljava/lang/Object;

    .line 98
    .line 99
    iput v6, v0, Lr40;->f:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 100
    .line 101
    :try_start_3
    invoke-virtual {p0}, Lb50;->g()Lqe2;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    new-instance v5, Ly40;

    .line 106
    .line 107
    invoke-direct {v5, p0, p1, v2, v3}, Ly40;-><init>(Lb50;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lc10;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v4, v5, v0}, Lqe2;->b(Lkotlin/jvm/functions/Function1;Ld10;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 114
    if-ne p0, v1, :cond_5

    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_5
    move-object v8, p2

    .line 118
    move-object p2, p0

    .line 119
    move-object p0, v8

    .line 120
    goto :goto_6

    .line 121
    :goto_1
    move-object p1, p0

    .line 122
    goto :goto_2

    .line 123
    :catchall_1
    move-exception p0

    .line 124
    goto :goto_1

    .line 125
    :goto_2
    move-object p0, p2

    .line 126
    goto :goto_7

    .line 127
    :catchall_2
    move-exception p1

    .line 128
    goto :goto_2

    .line 129
    :cond_6
    :try_start_4
    instance-of v7, v2, Lv02;

    .line 130
    .line 131
    if-eqz v7, :cond_7

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_7
    instance-of v6, v2, Lhx2;

    .line 135
    .line 136
    :goto_3
    if-eqz v6, :cond_a

    .line 137
    .line 138
    iget-object v6, p1, Lkh1;->c:Log2;

    .line 139
    .line 140
    if-ne v2, v6, :cond_9

    .line 141
    .line 142
    iput-object p1, v0, Lr40;->a:Ljava/lang/Object;

    .line 143
    .line 144
    iput-object p0, v0, Lr40;->b:Lb50;

    .line 145
    .line 146
    iput-object p2, v0, Lr40;->c:Lkx;

    .line 147
    .line 148
    iput v5, v0, Lr40;->f:I

    .line 149
    .line 150
    invoke-virtual {p0, v0}, Lb50;->h(Ld10;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    if-ne v2, v1, :cond_8

    .line 155
    .line 156
    goto :goto_5

    .line 157
    :cond_8
    :goto_4
    iget-object v2, p1, Lkh1;->a:Lkotlin/jvm/functions/Function2;

    .line 158
    .line 159
    iget-object p1, p1, Lkh1;->d:Lkotlin/coroutines/CoroutineContext;

    .line 160
    .line 161
    iput-object p2, v0, Lr40;->a:Ljava/lang/Object;

    .line 162
    .line 163
    iput-object v3, v0, Lr40;->b:Lb50;

    .line 164
    .line 165
    iput-object v3, v0, Lr40;->c:Lkx;

    .line 166
    .line 167
    iput v4, v0, Lr40;->f:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 168
    .line 169
    :try_start_5
    invoke-virtual {p0}, Lb50;->g()Lqe2;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    new-instance v5, Ly40;

    .line 174
    .line 175
    invoke-direct {v5, p0, p1, v2, v3}, Ly40;-><init>(Lb50;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lc10;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v4, v5, v0}, Lqe2;->b(Lkotlin/jvm/functions/Function1;Ld10;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 182
    if-ne p0, v1, :cond_5

    .line 183
    .line 184
    :goto_5
    return-object v1

    .line 185
    :goto_6
    :try_start_6
    sget-object p1, Lo42;->b:Lm42;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 186
    .line 187
    goto :goto_8

    .line 188
    :catchall_3
    move-exception p0

    .line 189
    goto :goto_1

    .line 190
    :cond_9
    :try_start_7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    check-cast v2, Lv02;

    .line 194
    .line 195
    iget-object p0, v2, Lv02;->b:Ljava/lang/Throwable;

    .line 196
    .line 197
    throw p0

    .line 198
    :cond_a
    instance-of p0, v2, Lmi0;

    .line 199
    .line 200
    if-eqz p0, :cond_b

    .line 201
    .line 202
    check-cast v2, Lmi0;

    .line 203
    .line 204
    iget-object p0, v2, Lmi0;->b:Ljava/lang/Throwable;

    .line 205
    .line 206
    throw p0

    .line 207
    :cond_b
    new-instance p0, Lpn1;

    .line 208
    .line 209
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 210
    .line 211
    .line 212
    throw p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 213
    :goto_7
    sget-object p2, Lo42;->b:Lm42;

    .line 214
    .line 215
    new-instance p2, Ln42;

    .line 216
    .line 217
    invoke-direct {p2, p1}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 218
    .line 219
    .line 220
    :goto_8
    invoke-static {p2}, Lo42;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    check-cast p0, Lkx;

    .line 225
    .line 226
    if-nez p1, :cond_c

    .line 227
    .line 228
    invoke-virtual {p0, p2}, Lz01;->D(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    goto :goto_9

    .line 232
    :cond_c
    invoke-virtual {p0, p1}, Lkx;->U(Ljava/lang/Throwable;)Z

    .line 233
    .line 234
    .line 235
    :goto_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 236
    .line 237
    return-object p0
.end method

.method public static final d(Lb50;Ld10;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, Ls40;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Ls40;

    .line 7
    .line 8
    iget v1, v0, Ls40;->e:I

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
    iput v1, v0, Ls40;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ls40;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Ls40;-><init>(Lb50;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Ls40;->c:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Ls40;->e:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    iget-object p0, v0, Ls40;->b:Lgl1;

    .line 38
    .line 39
    iget-object v0, v0, Ls40;->a:Lb50;

    .line 40
    .line 41
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    move-object p1, p0

    .line 45
    move-object p0, v0

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v4

    .line 53
    :cond_2
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Lb50;->e:Lgl1;

    .line 57
    .line 58
    iput-object p0, v0, Ls40;->a:Lb50;

    .line 59
    .line 60
    iput-object p1, v0, Ls40;->b:Lgl1;

    .line 61
    .line 62
    iput v3, v0, Ls40;->e:I

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Lgl1;->d(Ld10;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    if-ne v0, v1, :cond_3

    .line 69
    .line 70
    return-object v1

    .line 71
    :cond_3
    :goto_1
    :try_start_0
    iget v0, p0, Lb50;->f:I

    .line 72
    .line 73
    add-int/2addr v0, v3

    .line 74
    iput v0, p0, Lb50;->f:I

    .line 75
    .line 76
    if-ne v0, v3, :cond_4

    .line 77
    .line 78
    iget-object v0, p0, Lb50;->c:Ly10;

    .line 79
    .line 80
    new-instance v1, Ln40;

    .line 81
    .line 82
    invoke-direct {v1, p0, v4, v3}, Ln40;-><init>(Lb50;Lc10;I)V

    .line 83
    .line 84
    .line 85
    const/4 v2, 0x3

    .line 86
    invoke-static {v0, v4, v1, v2}, Li13;->w(Ly10;Lkt0;Lkotlin/jvm/functions/Function2;I)Lig2;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    iput-object v0, p0, Lb50;->g:Lig2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :catchall_0
    move-exception p0

    .line 94
    goto :goto_3

    .line 95
    :cond_4
    :goto_2
    invoke-virtual {p1, v4}, Lgl1;->g(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    return-object p0

    .line 101
    :goto_3
    invoke-virtual {p1, v4}, Lgl1;->g(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    throw p0
.end method

.method public static final e(Lb50;ZLc10;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, Lu40;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lu40;

    .line 7
    .line 8
    iget v1, v0, Lu40;->f:I

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
    iput v1, v0, Lu40;->f:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lu40;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lu40;-><init>(Lb50;Lc10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lu40;->d:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Lu40;->f:I

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
    iget-object p0, v0, Lu40;->a:Lb50;

    .line 44
    .line 45
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto/16 :goto_5

    .line 49
    .line 50
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object v6

    .line 56
    :cond_2
    iget-object p0, v0, Lu40;->a:Lb50;

    .line 57
    .line 58
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_3
    iget-boolean p1, v0, Lu40;->c:Z

    .line 63
    .line 64
    iget-object p0, v0, Lu40;->b:Log2;

    .line 65
    .line 66
    iget-object v2, v0, Lu40;->a:Lb50;

    .line 67
    .line 68
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_4
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iget-object p2, p0, Lb50;->h:Lgr0;

    .line 76
    .line 77
    invoke-virtual {p2}, Lgr0;->r()Log2;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    instance-of v2, p2, Lhx2;

    .line 82
    .line 83
    if-nez v2, :cond_c

    .line 84
    .line 85
    invoke-virtual {p0}, Lb50;->g()Lqe2;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    iput-object p0, v0, Lu40;->a:Lb50;

    .line 90
    .line 91
    iput-object p2, v0, Lu40;->b:Log2;

    .line 92
    .line 93
    iput-boolean p1, v0, Lu40;->c:Z

    .line 94
    .line 95
    iput v5, v0, Lu40;->f:I

    .line 96
    .line 97
    invoke-virtual {v2}, Lqe2;->a()Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    if-ne v2, v1, :cond_5

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_5
    move-object v8, v2

    .line 105
    move-object v2, p0

    .line 106
    move-object p0, p2

    .line 107
    move-object p2, v8

    .line 108
    :goto_1
    check-cast p2, Ljava/lang/Number;

    .line 109
    .line 110
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 111
    .line 112
    .line 113
    move-result p2

    .line 114
    instance-of v5, p0, Lx30;

    .line 115
    .line 116
    if-eqz v5, :cond_6

    .line 117
    .line 118
    iget v7, p0, Log2;->a:I

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_6
    const/4 v7, -0x1

    .line 122
    :goto_2
    if-eqz v5, :cond_7

    .line 123
    .line 124
    if-ne p2, v7, :cond_7

    .line 125
    .line 126
    return-object p0

    .line 127
    :cond_7
    if-eqz p1, :cond_9

    .line 128
    .line 129
    invoke-virtual {v2}, Lb50;->g()Lqe2;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    new-instance p1, Lv40;

    .line 134
    .line 135
    invoke-direct {p1, v2, v6}, Lv40;-><init>(Lb50;Lc10;)V

    .line 136
    .line 137
    .line 138
    iput-object v2, v0, Lu40;->a:Lb50;

    .line 139
    .line 140
    iput-object v6, v0, Lu40;->b:Log2;

    .line 141
    .line 142
    iput v4, v0, Lu40;->f:I

    .line 143
    .line 144
    invoke-virtual {p0, p1, v0}, Lqe2;->b(Lkotlin/jvm/functions/Function1;Ld10;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    if-ne p2, v1, :cond_8

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_8
    move-object p0, v2

    .line 152
    :goto_3
    check-cast p2, Lkotlin/Pair;

    .line 153
    .line 154
    goto :goto_6

    .line 155
    :cond_9
    invoke-virtual {v2}, Lb50;->g()Lqe2;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    new-instance p1, Lw40;

    .line 160
    .line 161
    const/4 p2, 0x0

    .line 162
    invoke-direct {p1, v2, v7, v6, p2}, Lw40;-><init>(Lb50;ILc10;I)V

    .line 163
    .line 164
    .line 165
    iput-object v2, v0, Lu40;->a:Lb50;

    .line 166
    .line 167
    iput-object v6, v0, Lu40;->b:Log2;

    .line 168
    .line 169
    iput v3, v0, Lu40;->f:I

    .line 170
    .line 171
    invoke-virtual {p0, p1, v0}, Lqe2;->c(Lkotlin/jvm/functions/Function2;Ld10;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p2

    .line 175
    if-ne p2, v1, :cond_a

    .line 176
    .line 177
    :goto_4
    return-object v1

    .line 178
    :cond_a
    move-object p0, v2

    .line 179
    :goto_5
    check-cast p2, Lkotlin/Pair;

    .line 180
    .line 181
    :goto_6
    iget-object p1, p2, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast p1, Log2;

    .line 184
    .line 185
    iget-object p2, p2, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast p2, Ljava/lang/Boolean;

    .line 188
    .line 189
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 190
    .line 191
    .line 192
    move-result p2

    .line 193
    if-eqz p2, :cond_b

    .line 194
    .line 195
    iget-object p0, p0, Lb50;->h:Lgr0;

    .line 196
    .line 197
    invoke-virtual {p0, p1}, Lgr0;->u(Log2;)V

    .line 198
    .line 199
    .line 200
    :cond_b
    return-object p1

    .line 201
    :cond_c
    const-string p0, "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"

    .line 202
    .line 203
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    return-object v6
.end method

.method public static final f(Lb50;ZLd10;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, Lx40;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lx40;

    .line 7
    .line 8
    iget v1, v0, Lx40;->w:I

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
    iput v1, v0, Lx40;->w:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lx40;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lx40;-><init>(Lb50;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lx40;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Lx40;->w:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x0

    .line 34
    packed-switch v2, :pswitch_data_0

    .line 35
    .line 36
    .line 37
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 38
    .line 39
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object v5

    .line 43
    :pswitch_0
    iget-object p0, v0, Lx40;->c:Ljava/io/Serializable;

    .line 44
    .line 45
    check-cast p0, Lf22;

    .line 46
    .line 47
    iget-object p1, v0, Lx40;->b:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Lh22;

    .line 50
    .line 51
    iget-object v0, v0, Lx40;->a:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Ld20;

    .line 54
    .line 55
    :try_start_0
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :catchall_0
    move-exception p0

    .line 60
    goto :goto_4

    .line 61
    :pswitch_1
    iget-boolean p0, v0, Lx40;->e:Z

    .line 62
    .line 63
    iget-object p1, v0, Lx40;->d:Lh22;

    .line 64
    .line 65
    iget-object v2, v0, Lx40;->c:Ljava/io/Serializable;

    .line 66
    .line 67
    check-cast v2, Lh22;

    .line 68
    .line 69
    iget-object v6, v0, Lx40;->b:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v6, Ld20;

    .line 72
    .line 73
    iget-object v7, v0, Lx40;->a:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v7, Lb50;

    .line 76
    .line 77
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    iput-object p2, p1, Lh22;->a:Ljava/lang/Object;

    .line 81
    .line 82
    new-instance p1, Lf22;

    .line 83
    .line 84
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 85
    .line 86
    .line 87
    :try_start_1
    new-instance p2, Ly40;

    .line 88
    .line 89
    invoke-direct {p2, v2, v7, p1, v5}, Ly40;-><init>(Lh22;Lb50;Lf22;Lc10;)V

    .line 90
    .line 91
    .line 92
    iput-object v6, v0, Lx40;->a:Ljava/lang/Object;

    .line 93
    .line 94
    iput-object v2, v0, Lx40;->b:Ljava/lang/Object;

    .line 95
    .line 96
    iput-object p1, v0, Lx40;->c:Ljava/io/Serializable;

    .line 97
    .line 98
    iput-object v5, v0, Lx40;->d:Lh22;

    .line 99
    .line 100
    const/4 v8, 0x6

    .line 101
    iput v8, v0, Lx40;->w:I

    .line 102
    .line 103
    if-eqz p0, :cond_1

    .line 104
    .line 105
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p2, v0}, Ly40;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    goto :goto_1

    .line 113
    :cond_1
    invoke-virtual {v7}, Lb50;->g()Lqe2;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    new-instance v7, Lu3;

    .line 118
    .line 119
    invoke-direct {v7, p2, v5, v3}, Lu3;-><init>(Ljava/lang/Object;Lc10;I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, v7, v0}, Lqe2;->b(Lkotlin/jvm/functions/Function1;Ld10;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 126
    :goto_1
    if-ne p0, v1, :cond_2

    .line 127
    .line 128
    goto/16 :goto_8

    .line 129
    .line 130
    :cond_2
    move-object p0, p1

    .line 131
    move-object p1, v2

    .line 132
    :goto_2
    new-instance p2, Lx30;

    .line 133
    .line 134
    iget-object p1, p1, Lh22;->a:Ljava/lang/Object;

    .line 135
    .line 136
    if-eqz p1, :cond_3

    .line 137
    .line 138
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    :cond_3
    iget p0, p0, Lf22;->a:I

    .line 143
    .line 144
    invoke-direct {p2, p1, v4, p0}, Lx30;-><init>(Ljava/lang/Object;II)V

    .line 145
    .line 146
    .line 147
    return-object p2

    .line 148
    :goto_3
    move-object v0, v6

    .line 149
    goto :goto_4

    .line 150
    :catchall_1
    move-exception p0

    .line 151
    goto :goto_3

    .line 152
    :goto_4
    invoke-static {v0, p0}, Ljf0;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 153
    .line 154
    .line 155
    throw v0

    .line 156
    :pswitch_2
    iget-boolean p1, v0, Lx40;->e:Z

    .line 157
    .line 158
    iget-object p0, v0, Lx40;->a:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast p0, Lb50;

    .line 161
    .line 162
    :try_start_2
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_2
    .catch Ld20; {:try_start_2 .. :try_end_2} :catch_0

    .line 163
    .line 164
    .line 165
    goto/16 :goto_9

    .line 166
    .line 167
    :catch_0
    move-exception p2

    .line 168
    goto/16 :goto_a

    .line 169
    .line 170
    :pswitch_3
    iget-boolean p1, v0, Lx40;->e:Z

    .line 171
    .line 172
    iget-object p0, v0, Lx40;->a:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast p0, Lb50;

    .line 175
    .line 176
    :try_start_3
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_3
    .catch Ld20; {:try_start_3 .. :try_end_3} :catch_0

    .line 177
    .line 178
    .line 179
    goto/16 :goto_7

    .line 180
    .line 181
    :pswitch_4
    iget p0, v0, Lx40;->f:I

    .line 182
    .line 183
    iget-boolean p1, v0, Lx40;->e:Z

    .line 184
    .line 185
    iget-object v1, v0, Lx40;->b:Ljava/lang/Object;

    .line 186
    .line 187
    iget-object v2, v0, Lx40;->a:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v2, Lb50;

    .line 190
    .line 191
    :try_start_4
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_4
    .catch Ld20; {:try_start_4 .. :try_end_4} :catch_1

    .line 192
    .line 193
    .line 194
    goto :goto_6

    .line 195
    :catch_1
    move-exception p2

    .line 196
    move-object p0, v2

    .line 197
    goto/16 :goto_a

    .line 198
    .line 199
    :pswitch_5
    iget-boolean p1, v0, Lx40;->e:Z

    .line 200
    .line 201
    iget-object p0, v0, Lx40;->a:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast p0, Lb50;

    .line 204
    .line 205
    :try_start_5
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_5
    .catch Ld20; {:try_start_5 .. :try_end_5} :catch_0

    .line 206
    .line 207
    .line 208
    goto :goto_5

    .line 209
    :pswitch_6
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    if-eqz p1, :cond_7

    .line 213
    .line 214
    :try_start_6
    iput-object p0, v0, Lx40;->a:Ljava/lang/Object;

    .line 215
    .line 216
    iput-boolean p1, v0, Lx40;->e:Z

    .line 217
    .line 218
    iput v3, v0, Lx40;->w:I

    .line 219
    .line 220
    invoke-virtual {p0, v0}, Lb50;->i(Ld10;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object p2

    .line 224
    if-ne p2, v1, :cond_4

    .line 225
    .line 226
    goto :goto_8

    .line 227
    :cond_4
    :goto_5
    if-eqz p2, :cond_5

    .line 228
    .line 229
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    .line 230
    .line 231
    .line 232
    move-result v4

    .line 233
    :cond_5
    invoke-virtual {p0}, Lb50;->g()Lqe2;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    iput-object p0, v0, Lx40;->a:Ljava/lang/Object;

    .line 238
    .line 239
    iput-object p2, v0, Lx40;->b:Ljava/lang/Object;

    .line 240
    .line 241
    iput-boolean p1, v0, Lx40;->e:Z

    .line 242
    .line 243
    iput v4, v0, Lx40;->f:I

    .line 244
    .line 245
    const/4 v3, 0x2

    .line 246
    iput v3, v0, Lx40;->w:I

    .line 247
    .line 248
    invoke-virtual {v2}, Lqe2;->a()Ljava/lang/Integer;

    .line 249
    .line 250
    .line 251
    move-result-object v2
    :try_end_6
    .catch Ld20; {:try_start_6 .. :try_end_6} :catch_0

    .line 252
    if-ne v2, v1, :cond_6

    .line 253
    .line 254
    goto :goto_8

    .line 255
    :cond_6
    move-object v1, p2

    .line 256
    move-object p2, v2

    .line 257
    move-object v2, p0

    .line 258
    move p0, v4

    .line 259
    :goto_6
    :try_start_7
    check-cast p2, Ljava/lang/Number;

    .line 260
    .line 261
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 262
    .line 263
    .line 264
    move-result p2

    .line 265
    new-instance v3, Lx30;

    .line 266
    .line 267
    invoke-direct {v3, v1, p0, p2}, Lx30;-><init>(Ljava/lang/Object;II)V
    :try_end_7
    .catch Ld20; {:try_start_7 .. :try_end_7} :catch_1

    .line 268
    .line 269
    .line 270
    return-object v3

    .line 271
    :cond_7
    :try_start_8
    invoke-virtual {p0}, Lb50;->g()Lqe2;

    .line 272
    .line 273
    .line 274
    move-result-object p2

    .line 275
    iput-object p0, v0, Lx40;->a:Ljava/lang/Object;

    .line 276
    .line 277
    iput-boolean p1, v0, Lx40;->e:Z

    .line 278
    .line 279
    const/4 v2, 0x3

    .line 280
    iput v2, v0, Lx40;->w:I

    .line 281
    .line 282
    invoke-virtual {p2}, Lqe2;->a()Ljava/lang/Integer;

    .line 283
    .line 284
    .line 285
    move-result-object p2

    .line 286
    if-ne p2, v1, :cond_8

    .line 287
    .line 288
    goto :goto_8

    .line 289
    :cond_8
    :goto_7
    check-cast p2, Ljava/lang/Number;

    .line 290
    .line 291
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 292
    .line 293
    .line 294
    move-result p2

    .line 295
    invoke-virtual {p0}, Lb50;->g()Lqe2;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    new-instance v4, Lw40;

    .line 300
    .line 301
    invoke-direct {v4, p0, p2, v5, v3}, Lw40;-><init>(Lb50;ILc10;I)V

    .line 302
    .line 303
    .line 304
    iput-object p0, v0, Lx40;->a:Ljava/lang/Object;

    .line 305
    .line 306
    iput-boolean p1, v0, Lx40;->e:Z

    .line 307
    .line 308
    const/4 p2, 0x4

    .line 309
    iput p2, v0, Lx40;->w:I

    .line 310
    .line 311
    invoke-virtual {v2, v4, v0}, Lqe2;->c(Lkotlin/jvm/functions/Function2;Ld10;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object p2

    .line 315
    if-ne p2, v1, :cond_9

    .line 316
    .line 317
    :goto_8
    return-object v1

    .line 318
    :cond_9
    :goto_9
    check-cast p2, Lx30;
    :try_end_8
    .catch Ld20; {:try_start_8 .. :try_end_8} :catch_0

    .line 319
    .line 320
    return-object p2

    .line 321
    :goto_a
    new-instance v1, Lh22;

    .line 322
    .line 323
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 324
    .line 325
    .line 326
    iget-object v2, p0, Lb50;->b:Lzb0;

    .line 327
    .line 328
    iput-object p0, v0, Lx40;->a:Ljava/lang/Object;

    .line 329
    .line 330
    iput-object p2, v0, Lx40;->b:Ljava/lang/Object;

    .line 331
    .line 332
    iput-object v1, v0, Lx40;->c:Ljava/io/Serializable;

    .line 333
    .line 334
    iput-object v1, v0, Lx40;->d:Lh22;

    .line 335
    .line 336
    iput-boolean p1, v0, Lx40;->e:Z

    .line 337
    .line 338
    const/4 p0, 0x5

    .line 339
    iput p0, v0, Lx40;->w:I

    .line 340
    .line 341
    throw p2

    .line 342
    nop

    .line 343
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a(Lkotlin/jvm/functions/Function2;Lc10;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-interface {p2}, Lc10;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lxt0;->V:Lxt0;

    .line 6
    .line 7
    invoke-interface {v0, v1}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/f;)Lkotlin/coroutines/CoroutineContext$Element;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lry2;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Lry2;->a(Lb50;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    new-instance v1, Lry2;

    .line 19
    .line 20
    invoke-direct {v1, v0, p0}, Lry2;-><init>(Lry2;Lb50;)V

    .line 21
    .line 22
    .line 23
    new-instance v0, Lzs;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    const/4 v3, 0x2

    .line 27
    invoke-direct {v0, p0, p1, v2, v3}, Lzs;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v0, p2}, Li13;->D(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lc10;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public final g()Lqe2;
    .locals 0

    .line 1
    iget-object p0, p0, Lb50;->k:Lhk2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lqe2;

    .line 8
    .line 9
    return-object p0
.end method

.method public final getData()Lfk0;
    .locals 0

    .line 1
    iget-object p0, p0, Lb50;->d:Lts0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h(Ld10;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, Lt40;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lt40;

    .line 7
    .line 8
    iget v1, v0, Lt40;->e:I

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
    iput v1, v0, Lt40;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lt40;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lt40;-><init>(Lb50;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lt40;->c:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Lt40;->e:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    if-eq v2, v4, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget p0, v0, Lt40;->b:I

    .line 40
    .line 41
    iget-object v0, v0, Lt40;->a:Lb50;

    .line 42
    .line 43
    :try_start_0
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    goto :goto_3

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    goto :goto_4

    .line 49
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 p0, 0x0

    .line 55
    return-object p0

    .line 56
    :cond_2
    iget-object p0, v0, Lt40;->a:Lb50;

    .line 57
    .line 58
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Lb50;->g()Lqe2;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iput-object p0, v0, Lt40;->a:Lb50;

    .line 70
    .line 71
    iput v4, v0, Lt40;->e:I

    .line 72
    .line 73
    invoke-virtual {p1}, Lqe2;->a()Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-ne p1, v1, :cond_4

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_4
    :goto_1
    check-cast p1, Ljava/lang/Number;

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    :try_start_1
    iget-object v2, p0, Lb50;->i:Lra2;

    .line 87
    .line 88
    iput-object p0, v0, Lt40;->a:Lb50;

    .line 89
    .line 90
    iput p1, v0, Lt40;->b:I

    .line 91
    .line 92
    iput v3, v0, Lt40;->e:I

    .line 93
    .line 94
    invoke-virtual {v2, v0}, Lra2;->s(Ld10;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 98
    if-ne p0, v1, :cond_5

    .line 99
    .line 100
    :goto_2
    return-object v1

    .line 101
    :cond_5
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    return-object p0

    .line 104
    :catchall_1
    move-exception v0

    .line 105
    move-object v5, v0

    .line 106
    move-object v0, p0

    .line 107
    move p0, p1

    .line 108
    move-object p1, v5

    .line 109
    :goto_4
    iget-object v0, v0, Lb50;->h:Lgr0;

    .line 110
    .line 111
    new-instance v1, Lv02;

    .line 112
    .line 113
    invoke-direct {v1, p0, p1}, Lv02;-><init>(ILjava/lang/Throwable;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v1}, Lgr0;->u(Log2;)V

    .line 117
    .line 118
    .line 119
    throw p1
.end method

.method public final i(Ld10;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object p0, p0, Lb50;->j:Lhk2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lth0;

    .line 8
    .line 9
    new-instance v0, Lo40;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x3

    .line 13
    invoke-direct {v0, v2, v1}, Lo40;-><init>(ILc10;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0, p1}, Lth0;->a(Lo40;Ld10;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public final j(Ljava/lang/Object;ZLd10;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p3, Lz40;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lz40;

    .line 7
    .line 8
    iget v1, v0, Lz40;->d:I

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
    iput v1, v0, Lz40;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lz40;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lz40;-><init>(Lb50;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lz40;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Lz40;->d:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, Lz40;->a:Lf22;

    .line 37
    .line 38
    invoke-static {p3}, Lpg3;->A(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p3}, Lpg3;->A(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    new-instance v5, Lf22;

    .line 53
    .line 54
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 55
    .line 56
    .line 57
    iget-object p3, p0, Lb50;->j:Lhk2;

    .line 58
    .line 59
    invoke-virtual {p3}, Lhk2;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p3

    .line 63
    check-cast p3, Lth0;

    .line 64
    .line 65
    new-instance v4, La50;

    .line 66
    .line 67
    const/4 v9, 0x0

    .line 68
    move-object v6, p0

    .line 69
    move-object v7, p1

    .line 70
    move v8, p2

    .line 71
    invoke-direct/range {v4 .. v9}, La50;-><init>(Lf22;Lb50;Ljava/lang/Object;ZLc10;)V

    .line 72
    .line 73
    .line 74
    iput-object v5, v0, Lz40;->a:Lf22;

    .line 75
    .line 76
    iput v3, v0, Lz40;->d:I

    .line 77
    .line 78
    invoke-virtual {p3, v4, v0}, Lth0;->b(La50;Ld10;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    if-ne p0, v1, :cond_3

    .line 83
    .line 84
    return-object v1

    .line 85
    :cond_3
    move-object p0, v5

    .line 86
    :goto_1
    iget p0, p0, Lf22;->a:I

    .line 87
    .line 88
    new-instance p1, Ljava/lang/Integer;

    .line 89
    .line 90
    invoke-direct {p1, p0}, Ljava/lang/Integer;-><init>(I)V

    .line 91
    .line 92
    .line 93
    return-object p1
.end method
