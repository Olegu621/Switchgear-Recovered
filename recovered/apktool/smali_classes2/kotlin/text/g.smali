.class public final synthetic Lkotlin/text/g;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkotlin/text/g;->a:Ljava/util/List;

    .line 5
    .line 6
    iput-boolean p2, p0, Lkotlin/text/g;->b:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object v2, p1

    .line 2
    check-cast v2, Ljava/lang/CharSequence;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object p2, p0, Lkotlin/text/g;->a:Ljava/util/List;

    .line 14
    .line 15
    iget-boolean v5, p0, Lkotlin/text/g;->b:Z

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    const/4 v0, 0x1

    .line 19
    const/4 v9, 0x0

    .line 20
    if-nez v5, :cond_4

    .line 21
    .line 22
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-ne v1, v0, :cond_4

    .line 27
    .line 28
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    if-ne v1, v0, :cond_2

    .line 35
    .line 36
    invoke-interface {p2, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    check-cast p2, Ljava/lang/String;

    .line 41
    .line 42
    const/4 v0, 0x4

    .line 43
    invoke-static {v2, p2, p1, p0, v0}, Lkotlin/text/StringsKt;->C(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-gez p0, :cond_1

    .line 48
    .line 49
    :cond_0
    move-object p1, v9

    .line 50
    goto/16 :goto_6

    .line 51
    .line 52
    :cond_1
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    new-instance p1, Lkotlin/Pair;

    .line 57
    .line 58
    invoke-direct {p1, p0, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto/16 :goto_6

    .line 62
    .line 63
    :cond_2
    const-string p0, "List has more than one element."

    .line 64
    .line 65
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-object v9

    .line 69
    :cond_3
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 70
    .line 71
    const-string p1, "List is empty."

    .line 72
    .line 73
    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw p0

    .line 77
    :cond_4
    new-instance v1, Lkotlin/ranges/IntRange;

    .line 78
    .line 79
    if-gez p1, :cond_5

    .line 80
    .line 81
    move p1, p0

    .line 82
    :cond_5
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    invoke-direct {v1, p1, p0, v0}, Lkotlin/ranges/a;-><init>(III)V

    .line 87
    .line 88
    .line 89
    instance-of p0, v2, Ljava/lang/String;

    .line 90
    .line 91
    iget v10, v1, Lkotlin/ranges/a;->c:I

    .line 92
    .line 93
    iget v11, v1, Lkotlin/ranges/a;->b:I

    .line 94
    .line 95
    if-eqz p0, :cond_b

    .line 96
    .line 97
    if-lez v10, :cond_6

    .line 98
    .line 99
    if-le p1, v11, :cond_7

    .line 100
    .line 101
    :cond_6
    if-gez v10, :cond_0

    .line 102
    .line 103
    if-gt v11, p1, :cond_0

    .line 104
    .line 105
    :cond_7
    move v4, p1

    .line 106
    :goto_0
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    if-eqz p1, :cond_9

    .line 115
    .line 116
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    move-object v6, p1

    .line 121
    check-cast v6, Ljava/lang/String;

    .line 122
    .line 123
    move-object v7, v2

    .line 124
    check-cast v7, Ljava/lang/String;

    .line 125
    .line 126
    move v8, v5

    .line 127
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    const/4 v3, 0x0

    .line 132
    invoke-static/range {v3 .. v8}, Lkotlin/text/e;->i(IIILjava/lang/String;Ljava/lang/String;Z)Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-eqz v0, :cond_8

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_8
    move v5, v8

    .line 140
    goto :goto_1

    .line 141
    :cond_9
    move v8, v5

    .line 142
    move-object p1, v9

    .line 143
    :goto_2
    check-cast p1, Ljava/lang/String;

    .line 144
    .line 145
    if-eqz p1, :cond_a

    .line 146
    .line 147
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    new-instance p2, Lkotlin/Pair;

    .line 152
    .line 153
    invoke-direct {p2, p0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    :goto_3
    move-object p1, p2

    .line 157
    goto :goto_6

    .line 158
    :cond_a
    if-eq v4, v11, :cond_0

    .line 159
    .line 160
    add-int/2addr v4, v10

    .line 161
    move v5, v8

    .line 162
    goto :goto_0

    .line 163
    :cond_b
    move v8, v5

    .line 164
    if-lez v10, :cond_c

    .line 165
    .line 166
    if-le p1, v11, :cond_d

    .line 167
    .line 168
    :cond_c
    if-gez v10, :cond_0

    .line 169
    .line 170
    if-gt v11, p1, :cond_0

    .line 171
    .line 172
    :cond_d
    move v3, p1

    .line 173
    :goto_4
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    :cond_e
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    if-eqz p1, :cond_f

    .line 182
    .line 183
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    move-object v0, p1

    .line 188
    check-cast v0, Ljava/lang/String;

    .line 189
    .line 190
    const/4 v1, 0x0

    .line 191
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 192
    .line 193
    .line 194
    move-result v4

    .line 195
    move v5, v8

    .line 196
    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt__StringsKt;->s(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    if-eqz v0, :cond_e

    .line 201
    .line 202
    goto :goto_5

    .line 203
    :cond_f
    move-object p1, v9

    .line 204
    :goto_5
    check-cast p1, Ljava/lang/String;

    .line 205
    .line 206
    if-eqz p1, :cond_10

    .line 207
    .line 208
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    new-instance p2, Lkotlin/Pair;

    .line 213
    .line 214
    invoke-direct {p2, p0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    goto :goto_3

    .line 218
    :cond_10
    if-eq v3, v11, :cond_0

    .line 219
    .line 220
    add-int/2addr v3, v10

    .line 221
    goto :goto_4

    .line 222
    :goto_6
    if-eqz p1, :cond_11

    .line 223
    .line 224
    iget-object p0, p1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 225
    .line 226
    iget-object p1, p1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast p1, Ljava/lang/String;

    .line 229
    .line 230
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 231
    .line 232
    .line 233
    move-result p1

    .line 234
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    new-instance p2, Lkotlin/Pair;

    .line 239
    .line 240
    invoke-direct {p2, p0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    return-object p2

    .line 244
    :cond_11
    return-object v9
.end method
