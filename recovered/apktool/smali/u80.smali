.class public final Lu80;
.super Ltj2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/io/Serializable;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/Object;Lc10;I)V
    .locals 0

    .line 1
    iput p5, p0, Lu80;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lu80;->d:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lu80;->e:Ljava/io/Serializable;

    .line 6
    .line 7
    iput-object p3, p0, Lu80;->f:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p4}, Ltj2;-><init>(ILc10;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lc10;)Lc10;
    .locals 10

    .line 1
    iget v0, p0, Lu80;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lu80;->f:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lu80;->e:Ljava/io/Serializable;

    .line 6
    .line 7
    iget-object p0, p0, Lu80;->d:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v3, Lu80;

    .line 13
    .line 14
    move-object v4, p0

    .line 15
    check-cast v4, Lxu0;

    .line 16
    .line 17
    move-object v5, v2

    .line 18
    check-cast v5, Ljava/lang/String;

    .line 19
    .line 20
    move-object v6, v1

    .line 21
    check-cast v6, Ljava/util/Map;

    .line 22
    .line 23
    const/4 v8, 0x1

    .line 24
    move-object v7, p2

    .line 25
    invoke-direct/range {v3 .. v8}, Lu80;-><init>(Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/Object;Lc10;I)V

    .line 26
    .line 27
    .line 28
    return-object v3

    .line 29
    :pswitch_0
    move-object v7, p2

    .line 30
    new-instance v4, Lu80;

    .line 31
    .line 32
    move-object v5, p0

    .line 33
    check-cast v5, Lx80;

    .line 34
    .line 35
    move-object v6, v2

    .line 36
    check-cast v6, Ltm;

    .line 37
    .line 38
    check-cast v1, Lec;

    .line 39
    .line 40
    const/4 v9, 0x0

    .line 41
    move-object v8, v7

    .line 42
    move-object v7, v1

    .line 43
    invoke-direct/range {v4 .. v9}, Lu80;-><init>(Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/Object;Lc10;I)V

    .line 44
    .line 45
    .line 46
    iput-object p1, v4, Lu80;->c:Ljava/lang/Object;

    .line 47
    .line 48
    return-object v4

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lu80;->a:I

    .line 2
    .line 3
    check-cast p1, Ly10;

    .line 4
    .line 5
    check-cast p2, Lc10;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lu80;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lu80;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lu80;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lu80;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lu80;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lu80;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lu80;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lu80;->f:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lu80;->e:Ljava/io/Serializable;

    .line 6
    .line 7
    iget-object v3, p0, Lu80;->d:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    sget-object v0, Lz10;->a:Lz10;

    .line 17
    .line 18
    iget v7, p0, Lu80;->b:I

    .line 19
    .line 20
    if-eqz v7, :cond_1

    .line 21
    .line 22
    if-ne v7, v6, :cond_0

    .line 23
    .line 24
    iget-object p0, p0, Lu80;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Ljava/util/Map;

    .line 27
    .line 28
    check-cast p0, Ljava/util/Map;

    .line 29
    .line 30
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-static {v5}, Lf42;->l(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    move-object p1, v4

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    check-cast v3, Lxu0;

    .line 43
    .line 44
    check-cast v2, Ljava/lang/String;

    .line 45
    .line 46
    check-cast v1, Ljava/util/Map;

    .line 47
    .line 48
    move-object p1, v1

    .line 49
    check-cast p1, Ljava/util/Map;

    .line 50
    .line 51
    iput-object p1, p0, Lu80;->c:Ljava/lang/Object;

    .line 52
    .line 53
    iput v6, p0, Lu80;->b:I

    .line 54
    .line 55
    new-instance p1, Ler;

    .line 56
    .line 57
    invoke-static {p0}, Lmz0;->b(Lc10;)Lc10;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-direct {p1, v6, p0}, Ler;-><init>(ILc10;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, Ler;->u()V

    .line 65
    .line 66
    .line 67
    new-instance v8, Lwu0;

    .line 68
    .line 69
    invoke-direct {v8, p1, v6}, Lwu0;-><init>(Ler;I)V

    .line 70
    .line 71
    .line 72
    new-instance p0, Lwu0;

    .line 73
    .line 74
    const/4 v4, 0x0

    .line 75
    invoke-direct {p0, p1, v4}, Lwu0;-><init>(Ler;I)V

    .line 76
    .line 77
    .line 78
    iget-object v9, v3, Lxu0;->a:Lg8;

    .line 79
    .line 80
    invoke-virtual {v3, v1}, Lxu0;->a(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v9, v2, v1}, Lg8;->a(Ljava/lang/String;Ljava/util/LinkedHashMap;)Ljava/net/HttpURLConnection;

    .line 88
    .line 89
    .line 90
    move-result-object v10

    .line 91
    const-string v1, "GET"

    .line 92
    .line 93
    invoke-virtual {v10, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    iget-object v1, v9, Lg8;->b:Lx80;

    .line 97
    .line 98
    new-instance v7, Le8;

    .line 99
    .line 100
    const/4 v11, 0x0

    .line 101
    const/4 v12, 0x0

    .line 102
    invoke-direct/range {v7 .. v12}, Le8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, v7}, Lx80;->b(Lkotlin/jvm/functions/Function2;)Lec;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    new-instance v2, Lo;

    .line 110
    .line 111
    const/4 v3, 0x2

    .line 112
    invoke-direct {v2, p0, v3}, Lo;-><init>(Ljava/lang/Object;I)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, v2}, Lec;->G(Lkotlin/jvm/functions/Function1;)V

    .line 116
    .line 117
    .line 118
    new-instance p0, Ler0;

    .line 119
    .line 120
    new-instance v1, Lf8;

    .line 121
    .line 122
    invoke-direct {v1, v10, v4}, Lf8;-><init>(Ljava/lang/Object;I)V

    .line 123
    .line 124
    .line 125
    invoke-direct {p0, v1, v3}, Ler0;-><init>(Ljava/lang/Object;I)V

    .line 126
    .line 127
    .line 128
    new-instance v1, Loc;

    .line 129
    .line 130
    const/4 v2, 0x6

    .line 131
    invoke-direct {v1, v2, p0, p1}, Loc;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1, v1}, Ler;->w(Lkotlin/jvm/functions/Function1;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p1}, Ler;->s()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    if-ne p1, v0, :cond_2

    .line 142
    .line 143
    move-object p1, v0

    .line 144
    :cond_2
    :goto_0
    return-object p1

    .line 145
    :pswitch_0
    sget-object v0, Lz10;->a:Lz10;

    .line 146
    .line 147
    iget v7, p0, Lu80;->b:I

    .line 148
    .line 149
    if-eqz v7, :cond_4

    .line 150
    .line 151
    if-ne v7, v6, :cond_3

    .line 152
    .line 153
    iget-object p0, p0, Lu80;->c:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast p0, Ly10;

    .line 156
    .line 157
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_3
    invoke-static {v5}, Lf42;->l(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    move-object p1, v4

    .line 165
    goto :goto_1

    .line 166
    :cond_4
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    iget-object p1, p0, Lu80;->c:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast p1, Ly10;

    .line 172
    .line 173
    move-object v8, v3

    .line 174
    check-cast v8, Lx80;

    .line 175
    .line 176
    move-object v9, v2

    .line 177
    check-cast v9, Ltm;

    .line 178
    .line 179
    move-object v10, v1

    .line 180
    check-cast v10, Lec;

    .line 181
    .line 182
    iput-object p1, p0, Lu80;->c:Ljava/lang/Object;

    .line 183
    .line 184
    iput v6, p0, Lu80;->b:I

    .line 185
    .line 186
    new-instance v1, Ler;

    .line 187
    .line 188
    invoke-static {p0}, Lmz0;->b(Lc10;)Lc10;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    invoke-direct {v1, v6, p0}, Ler;-><init>(ILc10;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v1}, Ler;->u()V

    .line 196
    .line 197
    .line 198
    new-instance v7, Lzs;

    .line 199
    .line 200
    const/4 v12, 0x4

    .line 201
    const/4 v11, 0x0

    .line 202
    invoke-direct/range {v7 .. v12}, Lzs;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 203
    .line 204
    .line 205
    const/4 p0, 0x3

    .line 206
    invoke-static {p1, v11, v7, p0}, Li13;->w(Ly10;Lkt0;Lkotlin/jvm/functions/Function2;I)Lig2;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    new-instance p1, Lo;

    .line 211
    .line 212
    const/16 v2, 0x8

    .line 213
    .line 214
    invoke-direct {p1, p0, v2}, Lo;-><init>(Ljava/lang/Object;I)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v1, p1}, Ler;->w(Lkotlin/jvm/functions/Function1;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1}, Ler;->s()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    if-ne p1, v0, :cond_5

    .line 225
    .line 226
    move-object p1, v0

    .line 227
    :cond_5
    :goto_1
    return-object p1

    .line 228
    nop

    .line 229
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
