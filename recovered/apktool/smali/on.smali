.class public final synthetic Lon;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p7, p0, Lon;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lon;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lon;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lon;->d:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Lon;->e:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p5, p0, Lon;->f:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p6, p0, Lon;->i:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget v0, p0, Lon;->a:I

    .line 2
    .line 3
    const-string v1, "Use case "

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lon;->b:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v1, v0

    .line 11
    check-cast v1, Lb5;

    .line 12
    .line 13
    iget-object v0, p0, Lon;->c:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v2, v0

    .line 16
    check-cast v2, Lzp;

    .line 17
    .line 18
    iget-object v0, p0, Lon;->d:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v3, v0

    .line 21
    check-cast v3, Lzp;

    .line 22
    .line 23
    iget-object v0, p0, Lon;->e:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v4, v0

    .line 26
    check-cast v4, Llj2;

    .line 27
    .line 28
    iget-object v0, p0, Lon;->f:Ljava/lang/Object;

    .line 29
    .line 30
    move-object v5, v0

    .line 31
    check-cast v5, Llj2;

    .line 32
    .line 33
    iget-object p0, p0, Lon;->i:Ljava/lang/Object;

    .line 34
    .line 35
    move-object v6, p0

    .line 36
    check-cast v6, Ljava/util/Map$Entry;

    .line 37
    .line 38
    invoke-virtual/range {v1 .. v6}, Lb5;->l(Lzp;Lzp;Llj2;Llj2;Ljava/util/Map$Entry;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_0
    iget-object v0, p0, Lon;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Lxn;

    .line 45
    .line 46
    iget-object v2, p0, Lon;->c:Ljava/lang/Object;

    .line 47
    .line 48
    move-object v4, v2

    .line 49
    check-cast v4, Ljava/lang/String;

    .line 50
    .line 51
    iget-object v2, p0, Lon;->d:Ljava/lang/Object;

    .line 52
    .line 53
    move-object v5, v2

    .line 54
    check-cast v5, Lfb2;

    .line 55
    .line 56
    iget-object v2, p0, Lon;->e:Ljava/lang/Object;

    .line 57
    .line 58
    move-object v6, v2

    .line 59
    check-cast v6, Lzy2;

    .line 60
    .line 61
    iget-object v2, p0, Lon;->f:Ljava/lang/Object;

    .line 62
    .line 63
    move-object v7, v2

    .line 64
    check-cast v7, Lpg;

    .line 65
    .line 66
    iget-object p0, p0, Lon;->i:Ljava/lang/Object;

    .line 67
    .line 68
    move-object v8, p0

    .line 69
    check-cast v8, Ljava/util/List;

    .line 70
    .line 71
    new-instance p0, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v1, " ACTIVE"

    .line 80
    .line 81
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-virtual {v0, p0}, Lxn;->s(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    iget-object p0, v0, Lxn;->a:Lfs0;

    .line 92
    .line 93
    iget-object p0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast p0, Ljava/util/LinkedHashMap;

    .line 96
    .line 97
    invoke-virtual {p0, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    check-cast v1, Lxy2;

    .line 102
    .line 103
    if-nez v1, :cond_0

    .line 104
    .line 105
    new-instance v1, Lxy2;

    .line 106
    .line 107
    invoke-direct {v1, v5, v6, v7, v8}, Lxy2;-><init>(Lfb2;Lzy2;Lpg;Ljava/util/List;)V

    .line 108
    .line 109
    .line 110
    invoke-interface {p0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    :cond_0
    const/4 p0, 0x1

    .line 114
    iput-boolean p0, v1, Lxy2;->f:Z

    .line 115
    .line 116
    iget-object v3, v0, Lxn;->a:Lfs0;

    .line 117
    .line 118
    invoke-virtual/range {v3 .. v8}, Lfs0;->x(Ljava/lang/String;Lfb2;Lzy2;Lpg;Ljava/util/List;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Lxn;->J()V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :pswitch_1
    iget-object v0, p0, Lon;->b:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v0, Lxn;

    .line 128
    .line 129
    iget-object v2, p0, Lon;->c:Ljava/lang/Object;

    .line 130
    .line 131
    move-object v4, v2

    .line 132
    check-cast v4, Ljava/lang/String;

    .line 133
    .line 134
    iget-object v2, p0, Lon;->d:Ljava/lang/Object;

    .line 135
    .line 136
    move-object v5, v2

    .line 137
    check-cast v5, Lfb2;

    .line 138
    .line 139
    iget-object v2, p0, Lon;->e:Ljava/lang/Object;

    .line 140
    .line 141
    move-object v6, v2

    .line 142
    check-cast v6, Lzy2;

    .line 143
    .line 144
    iget-object v2, p0, Lon;->f:Ljava/lang/Object;

    .line 145
    .line 146
    move-object v7, v2

    .line 147
    check-cast v7, Lpg;

    .line 148
    .line 149
    iget-object p0, p0, Lon;->i:Ljava/lang/Object;

    .line 150
    .line 151
    move-object v8, p0

    .line 152
    check-cast v8, Ljava/util/List;

    .line 153
    .line 154
    new-instance p0, Ljava/lang/StringBuilder;

    .line 155
    .line 156
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    const-string v1, " UPDATED"

    .line 163
    .line 164
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    invoke-virtual {v0, p0}, Lxn;->s(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    iget-object v3, v0, Lxn;->a:Lfs0;

    .line 175
    .line 176
    invoke-virtual/range {v3 .. v8}, Lfs0;->x(Ljava/lang/String;Lfb2;Lzy2;Lpg;Ljava/util/List;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0}, Lxn;->J()V

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :pswitch_2
    iget-object v0, p0, Lon;->b:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v0, Lxn;

    .line 186
    .line 187
    iget-object v2, p0, Lon;->c:Ljava/lang/Object;

    .line 188
    .line 189
    move-object v4, v2

    .line 190
    check-cast v4, Ljava/lang/String;

    .line 191
    .line 192
    iget-object v2, p0, Lon;->d:Ljava/lang/Object;

    .line 193
    .line 194
    move-object v5, v2

    .line 195
    check-cast v5, Lfb2;

    .line 196
    .line 197
    iget-object v2, p0, Lon;->e:Ljava/lang/Object;

    .line 198
    .line 199
    move-object v6, v2

    .line 200
    check-cast v6, Lzy2;

    .line 201
    .line 202
    iget-object v2, p0, Lon;->f:Ljava/lang/Object;

    .line 203
    .line 204
    move-object v7, v2

    .line 205
    check-cast v7, Lpg;

    .line 206
    .line 207
    iget-object p0, p0, Lon;->i:Ljava/lang/Object;

    .line 208
    .line 209
    move-object v8, p0

    .line 210
    check-cast v8, Ljava/util/List;

    .line 211
    .line 212
    new-instance p0, Ljava/lang/StringBuilder;

    .line 213
    .line 214
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    const-string v1, " RESET"

    .line 221
    .line 222
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    invoke-virtual {v0, p0}, Lxn;->s(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    iget-object v3, v0, Lxn;->a:Lfs0;

    .line 233
    .line 234
    invoke-virtual/range {v3 .. v8}, Lfs0;->x(Ljava/lang/String;Lfb2;Lzy2;Lpg;Ljava/util/List;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v0}, Lxn;->o()V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v0}, Lxn;->C()V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0}, Lxn;->J()V

    .line 244
    .line 245
    .line 246
    iget p0, v0, Lxn;->s0:I

    .line 247
    .line 248
    const/16 v1, 0x9

    .line 249
    .line 250
    if-ne p0, v1, :cond_1

    .line 251
    .line 252
    invoke-virtual {v0}, Lxn;->A()V

    .line 253
    .line 254
    .line 255
    :cond_1
    return-void

    .line 256
    nop

    .line 257
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
