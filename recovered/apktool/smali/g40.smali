.class public final Lg40;
.super Ltj2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Le70;Ljava/lang/ref/WeakReference;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lc10;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lg40;->a:I

    .line 3
    .line 4
    iput-object p1, p0, Lg40;->c:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lg40;->d:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lg40;->e:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p4, p0, Lg40;->f:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p5, p0, Lg40;->i:Ljava/lang/Object;

    .line 13
    .line 14
    invoke-direct {p0, v0, p6}, Ltj2;-><init>(ILc10;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/ArrayList;Lc10;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lg40;->a:I

    .line 18
    iput-object p1, p0, Lg40;->f:Ljava/lang/Object;

    iput-object p2, p0, Lg40;->i:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ltj2;-><init>(ILc10;)V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function1;Le70;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lc10;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lg40;->a:I

    .line 19
    iput-object p1, p0, Lg40;->d:Ljava/lang/Object;

    iput-object p2, p0, Lg40;->e:Ljava/lang/Object;

    iput-object p3, p0, Lg40;->f:Ljava/lang/Object;

    iput-object p4, p0, Lg40;->i:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ltj2;-><init>(ILc10;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lc10;)Lc10;
    .locals 10

    .line 1
    iget v0, p0, Lg40;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lg40;->i:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lg40;->f:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v3, Lg40;

    .line 11
    .line 12
    iget-object p1, p0, Lg40;->c:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v4, p1

    .line 15
    check-cast v4, Le70;

    .line 16
    .line 17
    iget-object p1, p0, Lg40;->d:Ljava/lang/Object;

    .line 18
    .line 19
    move-object v5, p1

    .line 20
    check-cast v5, Ljava/lang/ref/WeakReference;

    .line 21
    .line 22
    iget-object p0, p0, Lg40;->e:Ljava/lang/Object;

    .line 23
    .line 24
    move-object v6, p0

    .line 25
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 26
    .line 27
    move-object v7, v2

    .line 28
    check-cast v7, Lkotlin/jvm/functions/Function2;

    .line 29
    .line 30
    move-object v8, v1

    .line 31
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 32
    .line 33
    move-object v9, p2

    .line 34
    invoke-direct/range {v3 .. v9}, Lg40;-><init>(Le70;Ljava/lang/ref/WeakReference;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lc10;)V

    .line 35
    .line 36
    .line 37
    return-object v3

    .line 38
    :pswitch_0
    move-object v9, p2

    .line 39
    new-instance v4, Lg40;

    .line 40
    .line 41
    iget-object p1, p0, Lg40;->d:Ljava/lang/Object;

    .line 42
    .line 43
    move-object v5, p1

    .line 44
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 45
    .line 46
    iget-object p0, p0, Lg40;->e:Ljava/lang/Object;

    .line 47
    .line 48
    move-object v6, p0

    .line 49
    check-cast v6, Le70;

    .line 50
    .line 51
    move-object v7, v2

    .line 52
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 53
    .line 54
    move-object v8, v1

    .line 55
    check-cast v8, Lkotlin/jvm/functions/Function0;

    .line 56
    .line 57
    invoke-direct/range {v4 .. v9}, Lg40;-><init>(Lkotlin/jvm/functions/Function1;Le70;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lc10;)V

    .line 58
    .line 59
    .line 60
    return-object v4

    .line 61
    :pswitch_1
    move-object v9, p2

    .line 62
    new-instance p0, Lg40;

    .line 63
    .line 64
    check-cast v2, Ljava/util/List;

    .line 65
    .line 66
    check-cast v1, Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-direct {p0, v2, v1, v9}, Lg40;-><init>(Ljava/util/List;Ljava/util/ArrayList;Lc10;)V

    .line 69
    .line 70
    .line 71
    iput-object p1, p0, Lg40;->e:Ljava/lang/Object;

    .line 72
    .line 73
    return-object p0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lg40;->a:I

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
    invoke-virtual {p0, p1, p2}, Lg40;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lg40;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lg40;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lg40;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Lg40;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Lg40;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p2, Lc10;

    .line 41
    .line 42
    invoke-virtual {p0, p1, p2}, Lg40;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, Lg40;

    .line 47
    .line 48
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    invoke-virtual {p0, p1}, Lg40;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lg40;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lg40;->f:Ljava/lang/Object;

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    iget-object v3, p0, Lg40;->i:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 15
    .line 16
    iget-object v0, p0, Lg40;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 19
    .line 20
    sget-object v6, Lz10;->a:Lz10;

    .line 21
    .line 22
    iget v7, p0, Lg40;->b:I

    .line 23
    .line 24
    if-eqz v7, :cond_1

    .line 25
    .line 26
    if-ne v7, v4, :cond_0

    .line 27
    .line 28
    :try_start_0
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    goto :goto_5

    .line 34
    :catch_0
    move-exception p0

    .line 35
    goto :goto_2

    .line 36
    :cond_0
    invoke-static {v2}, Lf42;->l(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    goto :goto_4

    .line 40
    :cond_1
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    :try_start_1
    iget-object p1, p0, Lg40;->c:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Le70;

    .line 46
    .line 47
    iput v4, p0, Lg40;->b:I

    .line 48
    .line 49
    invoke-interface {p1, p0}, Le70;->await(Lc10;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-ne p1, v6, :cond_2

    .line 54
    .line 55
    move-object v5, v6

    .line 56
    goto :goto_4

    .line 57
    :cond_2
    :goto_0
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    if-eqz v2, :cond_3

    .line 62
    .line 63
    iget-object p0, p0, Lg40;->e:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p0, Lkotlin/jvm/functions/Function2;

    .line 66
    .line 67
    if-eqz p0, :cond_3

    .line 68
    .line 69
    invoke-interface {p0, v2, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    .line 71
    .line 72
    :cond_3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    if-eqz p0, :cond_5

    .line 77
    .line 78
    if-eqz v3, :cond_5

    .line 79
    .line 80
    :goto_1
    invoke-interface {v3, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    goto :goto_3

    .line 84
    :goto_2
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    if-eqz p1, :cond_4

    .line 89
    .line 90
    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 91
    .line 92
    if-eqz v1, :cond_4

    .line 93
    .line 94
    invoke-interface {v1, p1, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 95
    .line 96
    .line 97
    :cond_4
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    if-eqz p0, :cond_5

    .line 102
    .line 103
    if-eqz v3, :cond_5

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_5
    :goto_3
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    :goto_4
    return-object v5

    .line 109
    :goto_5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    if-eqz p1, :cond_6

    .line 114
    .line 115
    if-eqz v3, :cond_6

    .line 116
    .line 117
    invoke-interface {v3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    :cond_6
    throw p0

    .line 121
    :pswitch_0
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 122
    .line 123
    sget-object v0, Lz10;->a:Lz10;

    .line 124
    .line 125
    iget v6, p0, Lg40;->b:I

    .line 126
    .line 127
    if-eqz v6, :cond_8

    .line 128
    .line 129
    if-ne v6, v4, :cond_7

    .line 130
    .line 131
    iget-object p0, p0, Lg40;->c:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 134
    .line 135
    :try_start_3
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 136
    .line 137
    .line 138
    goto :goto_6

    .line 139
    :catchall_1
    move-exception p0

    .line 140
    goto :goto_b

    .line 141
    :catch_1
    move-exception p0

    .line 142
    goto :goto_8

    .line 143
    :cond_7
    invoke-static {v2}, Lf42;->l(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    goto :goto_a

    .line 147
    :cond_8
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    :try_start_4
    iget-object p1, p0, Lg40;->d:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast p1, Lkotlin/jvm/functions/Function1;

    .line 153
    .line 154
    iget-object v2, p0, Lg40;->e:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v2, Le70;

    .line 157
    .line 158
    iput-object p1, p0, Lg40;->c:Ljava/lang/Object;

    .line 159
    .line 160
    iput v4, p0, Lg40;->b:I

    .line 161
    .line 162
    invoke-interface {v2, p0}, Le70;->await(Lc10;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    if-ne p0, v0, :cond_9

    .line 167
    .line 168
    move-object v5, v0

    .line 169
    goto :goto_a

    .line 170
    :cond_9
    move-object v8, p1

    .line 171
    move-object p1, p0

    .line 172
    move-object p0, v8

    .line 173
    :goto_6
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 174
    .line 175
    .line 176
    if-eqz v3, :cond_a

    .line 177
    .line 178
    :goto_7
    invoke-interface {v3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    goto :goto_9

    .line 182
    :goto_8
    :try_start_5
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 183
    .line 184
    invoke-interface {v1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 185
    .line 186
    .line 187
    if-eqz v3, :cond_a

    .line 188
    .line 189
    goto :goto_7

    .line 190
    :cond_a
    :goto_9
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 191
    .line 192
    :goto_a
    return-object v5

    .line 193
    :goto_b
    if-eqz v3, :cond_b

    .line 194
    .line 195
    invoke-interface {v3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    :cond_b
    throw p0

    .line 199
    :pswitch_1
    sget-object v0, Lz10;->a:Lz10;

    .line 200
    .line 201
    iget v0, p0, Lg40;->b:I

    .line 202
    .line 203
    if-eqz v0, :cond_f

    .line 204
    .line 205
    const/4 v1, 0x2

    .line 206
    if-eq v0, v4, :cond_d

    .line 207
    .line 208
    if-ne v0, v1, :cond_c

    .line 209
    .line 210
    iget-object v0, p0, Lg40;->c:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v0, Ljava/util/Iterator;

    .line 213
    .line 214
    iget-object v1, p0, Lg40;->e:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v1, Ljava/util/List;

    .line 217
    .line 218
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    goto :goto_c

    .line 222
    :cond_c
    invoke-static {v2}, Lf42;->l(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    goto :goto_d

    .line 226
    :cond_d
    iget-object v0, p0, Lg40;->d:Ljava/lang/Object;

    .line 227
    .line 228
    iget-object v2, p0, Lg40;->c:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v2, Ljava/util/Iterator;

    .line 231
    .line 232
    iget-object v3, p0, Lg40;->e:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v3, Ljava/util/List;

    .line 235
    .line 236
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    check-cast p1, Ljava/lang/Boolean;

    .line 240
    .line 241
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 242
    .line 243
    .line 244
    move-result p1

    .line 245
    if-nez p1, :cond_e

    .line 246
    .line 247
    move-object p1, v0

    .line 248
    move-object v0, v2

    .line 249
    move-object v1, v3

    .line 250
    goto :goto_c

    .line 251
    :cond_e
    new-instance p1, Lf40;

    .line 252
    .line 253
    invoke-direct {p1, v4, v5}, Ltj2;-><init>(ILc10;)V

    .line 254
    .line 255
    .line 256
    invoke-interface {v3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    iput-object v3, p0, Lg40;->e:Ljava/lang/Object;

    .line 260
    .line 261
    iput-object v2, p0, Lg40;->c:Ljava/lang/Object;

    .line 262
    .line 263
    iput-object v5, p0, Lg40;->d:Ljava/lang/Object;

    .line 264
    .line 265
    iput v1, p0, Lg40;->b:I

    .line 266
    .line 267
    throw v5

    .line 268
    :cond_f
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    iget-object p1, p0, Lg40;->e:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v1, Ljava/util/List;

    .line 274
    .line 275
    move-object v0, v3

    .line 276
    check-cast v0, Ljava/util/ArrayList;

    .line 277
    .line 278
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    move-object v8, v1

    .line 283
    move-object v1, v0

    .line 284
    move-object v0, v8

    .line 285
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    if-nez v2, :cond_10

    .line 290
    .line 291
    move-object v5, p1

    .line 292
    goto :goto_d

    .line 293
    :cond_10
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    if-eqz v2, :cond_11

    .line 298
    .line 299
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 300
    .line 301
    .line 302
    :goto_d
    return-object v5

    .line 303
    :cond_11
    iput-object v1, p0, Lg40;->e:Ljava/lang/Object;

    .line 304
    .line 305
    iput-object v0, p0, Lg40;->c:Ljava/lang/Object;

    .line 306
    .line 307
    iput-object p1, p0, Lg40;->d:Ljava/lang/Object;

    .line 308
    .line 309
    iput v4, p0, Lg40;->b:I

    .line 310
    .line 311
    throw v5

    .line 312
    nop

    .line 313
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
