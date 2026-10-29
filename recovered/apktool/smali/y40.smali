.class public final Ly40;
.super Ltj2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public final synthetic c:Lb50;

.field public d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lb50;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lc10;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ly40;->a:I

    .line 15
    iput-object p1, p0, Ly40;->c:Lb50;

    iput-object p2, p0, Ly40;->e:Ljava/lang/Object;

    iput-object p3, p0, Ly40;->f:Ljava/lang/Object;

    invoke-direct {p0, v0, p4}, Ltj2;-><init>(ILc10;)V

    return-void
.end method

.method public constructor <init>(Lh22;Lb50;Lf22;Lc10;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ly40;->a:I

    .line 3
    .line 4
    iput-object p1, p0, Ly40;->e:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Ly40;->c:Lb50;

    .line 7
    .line 8
    iput-object p3, p0, Ly40;->f:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    invoke-direct {p0, p1, p4}, Ltj2;-><init>(ILc10;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final create(Lc10;)Lc10;
    .locals 3

    .line 1
    iget v0, p0, Ly40;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Ly40;->f:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Ly40;->e:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object p0, p0, Ly40;->c:Lb50;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v0, Ly40;

    .line 13
    .line 14
    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    .line 15
    .line 16
    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 17
    .line 18
    invoke-direct {v0, p0, v2, v1, p1}, Ly40;-><init>(Lb50;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lc10;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    new-instance v0, Ly40;

    .line 23
    .line 24
    check-cast v2, Lh22;

    .line 25
    .line 26
    check-cast v1, Lf22;

    .line 27
    .line 28
    invoke-direct {v0, v2, p0, v1, p1}, Ly40;-><init>(Lh22;Lb50;Lf22;Lc10;)V

    .line 29
    .line 30
    .line 31
    return-object v0

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Ly40;->a:I

    .line 2
    .line 3
    check-cast p1, Lc10;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Ly40;->create(Lc10;)Lc10;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ly40;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ly40;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, Ly40;->create(Lc10;)Lc10;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Ly40;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Ly40;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Ly40;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Ly40;->f:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Ly40;->e:Ljava/lang/Object;

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x3

    .line 12
    iget-object v7, p0, Ly40;->c:Lb50;

    .line 13
    .line 14
    const/4 v8, 0x0

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    sget-object v0, Lz10;->a:Lz10;

    .line 19
    .line 20
    iget v9, p0, Ly40;->b:I

    .line 21
    .line 22
    if-eqz v9, :cond_3

    .line 23
    .line 24
    if-eq v9, v4, :cond_2

    .line 25
    .line 26
    if-eq v9, v5, :cond_1

    .line 27
    .line 28
    if-ne v9, v6, :cond_0

    .line 29
    .line 30
    iget-object v8, p0, Ly40;->d:Ljava/lang/Object;

    .line 31
    .line 32
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto/16 :goto_4

    .line 36
    .line 37
    :cond_0
    invoke-static {v3}, Lf42;->l(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    goto :goto_4

    .line 41
    :cond_1
    iget-object v1, p0, Ly40;->d:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Lx30;

    .line 44
    .line 45
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iput v4, p0, Ly40;->b:I

    .line 57
    .line 58
    invoke-static {v7, v4, p0}, Lb50;->f(Lb50;ZLd10;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-ne p1, v0, :cond_4

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_4
    :goto_0
    check-cast p1, Lx30;

    .line 66
    .line 67
    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    .line 68
    .line 69
    new-instance v3, Ltm;

    .line 70
    .line 71
    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 72
    .line 73
    const/4 v9, 0x4

    .line 74
    invoke-direct {v3, v1, p1, v8, v9}, Ltm;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 75
    .line 76
    .line 77
    iput-object p1, p0, Ly40;->d:Ljava/lang/Object;

    .line 78
    .line 79
    iput v5, p0, Ly40;->b:I

    .line 80
    .line 81
    invoke-static {v2, v3, p0}, Li13;->D(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lc10;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    if-ne v1, v0, :cond_5

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_5
    move-object v10, v1

    .line 89
    move-object v1, p1

    .line 90
    move-object p1, v10

    .line 91
    :goto_1
    iget-object v2, v1, Lx30;->b:Ljava/lang/Object;

    .line 92
    .line 93
    if-eqz v2, :cond_6

    .line 94
    .line 95
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    goto :goto_2

    .line 100
    :cond_6
    const/4 v2, 0x0

    .line 101
    :goto_2
    iget v3, v1, Lx30;->c:I

    .line 102
    .line 103
    if-ne v2, v3, :cond_8

    .line 104
    .line 105
    iget-object v1, v1, Lx30;->b:Ljava/lang/Object;

    .line 106
    .line 107
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-nez v1, :cond_7

    .line 112
    .line 113
    iput-object p1, p0, Ly40;->d:Ljava/lang/Object;

    .line 114
    .line 115
    iput v6, p0, Ly40;->b:I

    .line 116
    .line 117
    invoke-virtual {v7, p1, v4, p0}, Lb50;->j(Ljava/lang/Object;ZLd10;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    if-ne p0, v0, :cond_7

    .line 122
    .line 123
    :goto_3
    move-object v8, v0

    .line 124
    goto :goto_4

    .line 125
    :cond_7
    move-object v8, p1

    .line 126
    goto :goto_4

    .line 127
    :cond_8
    const-string p0, "Data in DataStore was mutated but DataStore is only compatible with Immutable types."

    .line 128
    .line 129
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    :goto_4
    return-object v8

    .line 133
    :pswitch_0
    check-cast v1, Lf22;

    .line 134
    .line 135
    check-cast v2, Lh22;

    .line 136
    .line 137
    sget-object v0, Lz10;->a:Lz10;

    .line 138
    .line 139
    iget v9, p0, Ly40;->b:I

    .line 140
    .line 141
    if-eqz v9, :cond_c

    .line 142
    .line 143
    if-eq v9, v4, :cond_b

    .line 144
    .line 145
    if-eq v9, v5, :cond_a

    .line 146
    .line 147
    if-ne v9, v6, :cond_9

    .line 148
    .line 149
    iget-object p0, p0, Ly40;->d:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast p0, Ljava/io/Serializable;

    .line 152
    .line 153
    move-object v1, p0

    .line 154
    check-cast v1, Lf22;

    .line 155
    .line 156
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    goto :goto_8

    .line 160
    :cond_9
    invoke-static {v3}, Lf42;->l(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    goto :goto_a

    .line 164
    :cond_a
    iget-object v3, p0, Ly40;->d:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v3, Ljava/io/Serializable;

    .line 167
    .line 168
    check-cast v3, Lf22;

    .line 169
    .line 170
    :try_start_0
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catch Ld20; {:try_start_0 .. :try_end_0} :catch_0

    .line 171
    .line 172
    .line 173
    goto :goto_6

    .line 174
    :cond_b
    iget-object v3, p0, Ly40;->d:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v3, Ljava/io/Serializable;

    .line 177
    .line 178
    check-cast v3, Lh22;

    .line 179
    .line 180
    :try_start_1
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_1
    .catch Ld20; {:try_start_1 .. :try_end_1} :catch_0

    .line 181
    .line 182
    .line 183
    goto :goto_5

    .line 184
    :cond_c
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    :try_start_2
    iput-object v2, p0, Ly40;->d:Ljava/lang/Object;

    .line 188
    .line 189
    iput v4, p0, Ly40;->b:I

    .line 190
    .line 191
    invoke-virtual {v7, p0}, Lb50;->i(Ld10;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    if-ne p1, v0, :cond_d

    .line 196
    .line 197
    goto :goto_7

    .line 198
    :cond_d
    move-object v3, v2

    .line 199
    :goto_5
    iput-object p1, v3, Lh22;->a:Ljava/lang/Object;

    .line 200
    .line 201
    invoke-virtual {v7}, Lb50;->g()Lqe2;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    iput-object v1, p0, Ly40;->d:Ljava/lang/Object;

    .line 206
    .line 207
    iput v5, p0, Ly40;->b:I

    .line 208
    .line 209
    invoke-virtual {p1}, Lqe2;->a()Ljava/lang/Integer;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    if-ne p1, v0, :cond_e

    .line 214
    .line 215
    goto :goto_7

    .line 216
    :cond_e
    move-object v3, v1

    .line 217
    :goto_6
    check-cast p1, Ljava/lang/Number;

    .line 218
    .line 219
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 220
    .line 221
    .line 222
    move-result p1

    .line 223
    iput p1, v3, Lf22;->a:I
    :try_end_2
    .catch Ld20; {:try_start_2 .. :try_end_2} :catch_0

    .line 224
    .line 225
    goto :goto_9

    .line 226
    :catch_0
    iget-object p1, v2, Lh22;->a:Ljava/lang/Object;

    .line 227
    .line 228
    iput-object v1, p0, Ly40;->d:Ljava/lang/Object;

    .line 229
    .line 230
    iput v6, p0, Ly40;->b:I

    .line 231
    .line 232
    invoke-virtual {v7, p1, v4, p0}, Lb50;->j(Ljava/lang/Object;ZLd10;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    if-ne p1, v0, :cond_f

    .line 237
    .line 238
    :goto_7
    move-object v8, v0

    .line 239
    goto :goto_a

    .line 240
    :cond_f
    :goto_8
    check-cast p1, Ljava/lang/Number;

    .line 241
    .line 242
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 243
    .line 244
    .line 245
    move-result p0

    .line 246
    iput p0, v1, Lf22;->a:I

    .line 247
    .line 248
    :goto_9
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 249
    .line 250
    :goto_a
    return-object v8

    .line 251
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
