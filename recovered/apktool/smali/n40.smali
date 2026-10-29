.class public final Ln40;
.super Ltj2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public final synthetic c:Lb50;


# direct methods
.method public synthetic constructor <init>(Lb50;Lc10;I)V
    .locals 0

    .line 1
    iput p3, p0, Ln40;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ln40;->c:Lb50;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p2}, Ltj2;-><init>(ILc10;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lc10;)Lc10;
    .locals 1

    .line 1
    iget p1, p0, Ln40;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Ln40;->c:Lb50;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, Ln40;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, Ln40;-><init>(Lb50;Lc10;I)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, Ln40;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, Ln40;-><init>(Lb50;Lc10;I)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, Ln40;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-direct {p1, p0, p2, v0}, Ln40;-><init>(Lb50;Lc10;I)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Ln40;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ly10;

    .line 7
    .line 8
    check-cast p2, Lc10;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Ln40;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Ln40;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Ln40;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ly10;

    .line 24
    .line 25
    check-cast p2, Lc10;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, Ln40;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Ln40;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Ln40;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Lhk0;

    .line 41
    .line 42
    check-cast p2, Lc10;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, Ln40;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, Ln40;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, Ln40;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Ln40;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    iget-object v3, p0, Ln40;->c:Lb50;

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x2

    .line 10
    const/4 v6, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v0, v3, Lb50;->h:Lgr0;

    .line 15
    .line 16
    sget-object v7, Lz10;->a:Lz10;

    .line 17
    .line 18
    iget v8, p0, Ln40;->b:I

    .line 19
    .line 20
    if-eqz v8, :cond_2

    .line 21
    .line 22
    if-eq v8, v4, :cond_1

    .line 23
    .line 24
    if-ne v8, v5, :cond_0

    .line 25
    .line 26
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_0
    invoke-static {v2}, Lf42;->l(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_3

    .line 34
    :cond_1
    :try_start_0
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lgr0;->r()Log2;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    instance-of p1, p1, Lmi0;

    .line 46
    .line 47
    if-eqz p1, :cond_3

    .line 48
    .line 49
    invoke-virtual {v0}, Lgr0;->r()Log2;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    goto :goto_3

    .line 54
    :cond_3
    :try_start_1
    iput v4, p0, Ln40;->b:I

    .line 55
    .line 56
    invoke-virtual {v3, p0}, Lb50;->h(Ld10;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 60
    if-ne p1, v7, :cond_4

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_4
    :goto_0
    iput v5, p0, Ln40;->b:I

    .line 64
    .line 65
    invoke-static {v3, v1, p0}, Lb50;->e(Lb50;ZLc10;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-ne p1, v7, :cond_5

    .line 70
    .line 71
    :goto_1
    move-object v6, v7

    .line 72
    goto :goto_3

    .line 73
    :cond_5
    :goto_2
    move-object v6, p1

    .line 74
    check-cast v6, Log2;

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :catchall_0
    move-exception p0

    .line 78
    new-instance v6, Lv02;

    .line 79
    .line 80
    const/4 p1, -0x1

    .line 81
    invoke-direct {v6, p1, p0}, Lv02;-><init>(ILjava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    :goto_3
    return-object v6

    .line 85
    :pswitch_0
    sget-object v0, Lz10;->a:Lz10;

    .line 86
    .line 87
    iget v7, p0, Ln40;->b:I

    .line 88
    .line 89
    if-eqz v7, :cond_8

    .line 90
    .line 91
    if-eq v7, v4, :cond_7

    .line 92
    .line 93
    if-ne v7, v5, :cond_6

    .line 94
    .line 95
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    goto :goto_8

    .line 99
    :cond_6
    invoke-static {v2}, Lf42;->l(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    goto :goto_9

    .line 103
    :cond_7
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    goto :goto_5

    .line 107
    :cond_8
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    iget-object p1, v3, Lb50;->i:Lra2;

    .line 111
    .line 112
    iput v4, p0, Ln40;->b:I

    .line 113
    .line 114
    iget-object p1, p1, Lra2;->b:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast p1, Lkx;

    .line 117
    .line 118
    invoke-virtual {p1, p0}, Lz01;->i(Lc10;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    if-ne p1, v0, :cond_9

    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 126
    .line 127
    :goto_4
    if-ne p1, v0, :cond_a

    .line 128
    .line 129
    goto :goto_7

    .line 130
    :cond_a
    :goto_5
    invoke-virtual {v3}, Lb50;->g()Lqe2;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    iget-object p1, p1, Lqe2;->c:Lts0;

    .line 135
    .line 136
    sget-object v2, Lxk;->b:Lxk;

    .line 137
    .line 138
    instance-of v7, p1, Lwo0;

    .line 139
    .line 140
    if-eqz v7, :cond_b

    .line 141
    .line 142
    check-cast p1, Lwo0;

    .line 143
    .line 144
    check-cast p1, Lrm;

    .line 145
    .line 146
    invoke-static {p1, v6, v1, v2, v4}, Lb40;->l(Lrm;Lkt0;ILxk;I)Lfk0;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    goto :goto_6

    .line 151
    :cond_b
    new-instance v4, Lbt;

    .line 152
    .line 153
    sget-object v6, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 154
    .line 155
    invoke-direct {v4, p1, v6, v1, v2}, Lbt;-><init>(Lfk0;Lkotlin/coroutines/CoroutineContext;ILxk;)V

    .line 156
    .line 157
    .line 158
    move-object p1, v4

    .line 159
    :goto_6
    new-instance v1, Lsm;

    .line 160
    .line 161
    invoke-direct {v1, v3, v5}, Lsm;-><init>(Ljava/lang/Object;I)V

    .line 162
    .line 163
    .line 164
    iput v5, p0, Ln40;->b:I

    .line 165
    .line 166
    invoke-interface {p1, v1, p0}, Lfk0;->collect(Lhk0;Lc10;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    if-ne p0, v0, :cond_c

    .line 171
    .line 172
    :goto_7
    move-object v6, v0

    .line 173
    goto :goto_9

    .line 174
    :cond_c
    :goto_8
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 175
    .line 176
    :goto_9
    return-object v6

    .line 177
    :pswitch_1
    sget-object v0, Lz10;->a:Lz10;

    .line 178
    .line 179
    iget v1, p0, Ln40;->b:I

    .line 180
    .line 181
    if-eqz v1, :cond_e

    .line 182
    .line 183
    if-ne v1, v4, :cond_d

    .line 184
    .line 185
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    goto :goto_a

    .line 189
    :cond_d
    invoke-static {v2}, Lf42;->l(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    goto :goto_b

    .line 193
    :cond_e
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    iput v4, p0, Ln40;->b:I

    .line 197
    .line 198
    invoke-static {v3, p0}, Lb50;->d(Lb50;Ld10;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    if-ne p0, v0, :cond_f

    .line 203
    .line 204
    move-object v6, v0

    .line 205
    goto :goto_b

    .line 206
    :cond_f
    :goto_a
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 207
    .line 208
    :goto_b
    return-object v6

    .line 209
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
