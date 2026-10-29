.class public final Lw03;
.super Ltj2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La13;


# direct methods
.method public synthetic constructor <init>(La13;Lc10;I)V
    .locals 0

    .line 1
    iput p3, p0, Lw03;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lw03;->b:La13;

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
    iget p1, p0, Lw03;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lw03;->b:La13;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, Lw03;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, Lw03;-><init>(La13;Lc10;I)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, Lw03;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, Lw03;-><init>(La13;Lc10;I)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lw03;->a:I

    .line 2
    .line 3
    check-cast p1, Ly80;

    .line 4
    .line 5
    check-cast p2, Lc10;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lw03;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lw03;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lw03;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lw03;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lw03;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lw03;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 8

    .line 1
    iget v0, p0, Lw03;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lw03;->b:La13;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, Lz10;->a:Lz10;

    .line 9
    .line 10
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, La13;->m()Lil2;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Lqk2;

    .line 18
    .line 19
    invoke-virtual {p0}, Lqk2;->i()Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :pswitch_0
    sget-object v0, Lz10;->a:Lz10;

    .line 25
    .line 26
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-static {}, Ljb1;->h()V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, La13;->a:Lfb1;

    .line 33
    .line 34
    invoke-virtual {p1}, Lfb1;->e()Li03;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v1, "Clearing User Session"

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-interface {v0, v1, v2}, Li03;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 42
    .line 43
    .line 44
    const-string v0, ""

    .line 45
    .line 46
    iput-object v0, p0, La13;->c:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v1, p1, Lfb1;->z:Lhk2;

    .line 49
    .line 50
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, Lg80;

    .line 55
    .line 56
    check-cast v1, Lpz2;

    .line 57
    .line 58
    invoke-virtual {v1}, Lpz2;->a()V

    .line 59
    .line 60
    .line 61
    iget-object v1, p1, Lfb1;->F:Lhk2;

    .line 62
    .line 63
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    check-cast v3, Lac2;

    .line 68
    .line 69
    iget-object v4, v3, Lac2;->c:Lk61;

    .line 70
    .line 71
    iget-object v3, v3, Lac2;->b:Lvq0;

    .line 72
    .line 73
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-static {v3}, Lvq0;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    iput-object v3, v4, Lk61;->e:Ljava/lang/String;

    .line 95
    .line 96
    iget-object v3, v4, Lk61;->b:Ljava/util/List;

    .line 97
    .line 98
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    const/4 v5, 0x0

    .line 107
    if-eqz v4, :cond_0

    .line 108
    .line 109
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    check-cast v4, Lm61;

    .line 114
    .line 115
    new-instance v6, Li61;

    .line 116
    .line 117
    sget-object v7, Lnd0;->a:Lnd0;

    .line 118
    .line 119
    invoke-direct {v6, v7, v5}, Li61;-><init>(Ljava/util/List;Z)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    iput-object v6, v4, Lm61;->p:Li61;

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_0
    invoke-virtual {p0}, La13;->o()Z

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-eqz v3, :cond_3

    .line 133
    .line 134
    iget-object v3, p1, Lfb1;->K:Lhk2;

    .line 135
    .line 136
    invoke-virtual {v3}, Lhk2;->getValue()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    check-cast v3, Lil2;

    .line 141
    .line 142
    check-cast v3, Lqk2;

    .line 143
    .line 144
    invoke-virtual {v3}, Lqk2;->s()V

    .line 145
    .line 146
    .line 147
    iget-object v4, v3, Lqk2;->o:Ljava/util/LinkedHashMap;

    .line 148
    .line 149
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->clear()V

    .line 150
    .line 151
    .line 152
    iget-object v3, v3, Lqk2;->m:Lql2;

    .line 153
    .line 154
    if-eqz v3, :cond_1

    .line 155
    .line 156
    iget-object v4, v3, Lql2;->r:Lu13;

    .line 157
    .line 158
    invoke-virtual {v4}, Lu13;->clear()V

    .line 159
    .line 160
    .line 161
    iget-object v4, v3, Lql2;->s:Lu13;

    .line 162
    .line 163
    invoke-virtual {v4}, Lu13;->clear()V

    .line 164
    .line 165
    .line 166
    iget-object v4, v3, Lql2;->y:Lu13;

    .line 167
    .line 168
    invoke-virtual {v4}, Lu13;->clear()V

    .line 169
    .line 170
    .line 171
    iget-object v4, v3, Lql2;->z:Lu13;

    .line 172
    .line 173
    invoke-virtual {v4}, Lu13;->clear()V

    .line 174
    .line 175
    .line 176
    iget-object v3, v3, Lql2;->q:Lu13;

    .line 177
    .line 178
    invoke-virtual {v3}, Lu13;->clear()V

    .line 179
    .line 180
    .line 181
    :cond_1
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    check-cast v1, Lac2;

    .line 186
    .line 187
    invoke-virtual {v1}, Lac2;->b()Z

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    if-eqz v1, :cond_3

    .line 192
    .line 193
    iget-object v1, p1, Lfb1;->X:Lhk2;

    .line 194
    .line 195
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    check-cast v1, Ly3;

    .line 200
    .line 201
    iget-object v3, v1, Ly3;->d:Ljava/util/List;

    .line 202
    .line 203
    if-eqz v3, :cond_2

    .line 204
    .line 205
    new-instance v2, Ljava/util/ArrayList;

    .line 206
    .line 207
    const/16 v4, 0xa

    .line 208
    .line 209
    invoke-static {v3, v4}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 210
    .line 211
    .line 212
    move-result v4

    .line 213
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 214
    .line 215
    .line 216
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 217
    .line 218
    .line 219
    move-result-object v3

    .line 220
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 221
    .line 222
    .line 223
    move-result v4

    .line 224
    if-eqz v4, :cond_2

    .line 225
    .line 226
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    check-cast v4, Lcom/usercentrics/sdk/AdTechProvider;

    .line 231
    .line 232
    invoke-static {v4, v5}, Lcom/usercentrics/sdk/AdTechProvider;->a(Lcom/usercentrics/sdk/AdTechProvider;Z)Lcom/usercentrics/sdk/AdTechProvider;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    goto :goto_1

    .line 240
    :cond_2
    iput-object v2, v1, Ly3;->d:Ljava/util/List;

    .line 241
    .line 242
    invoke-virtual {v1}, Ly3;->c()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    iput-object v2, v1, Ly3;->e:Ljava/lang/String;

    .line 247
    .line 248
    :cond_3
    iget-object p1, p1, Lfb1;->t:Lhk2;

    .line 249
    .line 250
    invoke-virtual {p1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    check-cast p1, Lsx0;

    .line 255
    .line 256
    const/4 v1, 0x1

    .line 257
    invoke-virtual {p1, v0, v1}, Lsx0;->c(Ljava/lang/String;Z)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {p0}, La13;->l()Ljava/util/ArrayList;

    .line 261
    .line 262
    .line 263
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 264
    .line 265
    return-object p0

    .line 266
    nop

    .line 267
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
