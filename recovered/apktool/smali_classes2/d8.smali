.class public final Ld8;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lev0;


# instance fields
.field public final a:Lhk2;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Lc8;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p1, v1}, Lc8;-><init>(Ljava/io/File;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Ld8;->a:Lhk2;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    .line 1
    new-instance v1, Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {p0}, Ld8;->b()Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-direct {v1, v0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_7

    .line 15
    .line 16
    new-instance p1, Ljava/io/File;

    .line 17
    .line 18
    invoke-virtual {p0}, Ld8;->b()Ljava/io/File;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-direct {p1, p0, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    sget-object p2, Lii0;->a:Lii0;

    .line 30
    .line 31
    if-nez p0, :cond_0

    .line 32
    .line 33
    new-instance v0, Lon1;

    .line 34
    .line 35
    const/4 v4, 0x2

    .line 36
    const/4 v5, 0x0

    .line 37
    const/4 v2, 0x0

    .line 38
    const-string v3, "The source file doesn\'t exist."

    .line 39
    .line 40
    invoke-direct/range {v0 .. v5}, Lon1;-><init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2, v1, v0}, Lii0;->b(Ljava/io/File;Ljava/io/IOException;)Ljava/lang/Void;

    .line 44
    .line 45
    .line 46
    sget-object p0, Lyp1;->a:Lyp1;

    .line 47
    .line 48
    return-void

    .line 49
    :cond_0
    :try_start_0
    sget-object v2, Lkotlin/io/FileWalkDirection;->a:Lkotlin/io/FileWalkDirection;

    .line 50
    .line 51
    new-instance v0, Lbi0;

    .line 52
    .line 53
    const/16 v7, 0x20

    .line 54
    .line 55
    const/4 v8, 0x0

    .line 56
    const/4 v3, 0x0

    .line 57
    const/4 v4, 0x0

    .line 58
    const/4 v5, 0x0

    .line 59
    const/4 v6, 0x0

    .line 60
    invoke-direct/range {v0 .. v8}, Lbi0;-><init>(Ljava/io/File;Lkotlin/io/FileWalkDirection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 61
    .line 62
    .line 63
    new-instance v7, Lrs1;

    .line 64
    .line 65
    const/4 p0, 0x6

    .line 66
    invoke-direct {v7, p2, p0}, Lrs1;-><init>(Ljava/lang/Object;I)V

    .line 67
    .line 68
    .line 69
    new-instance v2, Lbi0;

    .line 70
    .line 71
    iget-object v3, v0, Lbi0;->a:Ljava/io/File;

    .line 72
    .line 73
    iget-object v4, v0, Lbi0;->b:Lkotlin/io/FileWalkDirection;

    .line 74
    .line 75
    iget-object v5, v0, Lbi0;->c:Lkotlin/jvm/functions/Function1;

    .line 76
    .line 77
    iget-object v6, v0, Lbi0;->d:Lkotlin/jvm/functions/Function1;

    .line 78
    .line 79
    iget v8, v0, Lbi0;->f:I

    .line 80
    .line 81
    invoke-direct/range {v2 .. v8}, Lbi0;-><init>(Ljava/io/File;Lkotlin/io/FileWalkDirection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)V

    .line 82
    .line 83
    .line 84
    new-instance p0, Lzh0;

    .line 85
    .line 86
    invoke-direct {p0, v2}, Lzh0;-><init>(Lbi0;)V

    .line 87
    .line 88
    .line 89
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lm;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_7

    .line 94
    .line 95
    invoke-virtual {p0}, Lm;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    move-object v3, v0

    .line 100
    check-cast v3, Ljava/io/File;

    .line 101
    .line 102
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-nez v0, :cond_2

    .line 107
    .line 108
    new-instance v2, Lon1;

    .line 109
    .line 110
    const-string v5, "The source file doesn\'t exist."

    .line 111
    .line 112
    const/4 v6, 0x2

    .line 113
    const/4 v7, 0x0

    .line 114
    const/4 v4, 0x0

    .line 115
    invoke-direct/range {v2 .. v7}, Lon1;-><init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p2, v3, v2}, Lii0;->b(Ljava/io/File;Ljava/io/IOException;)Ljava/lang/Void;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    sget-object v2, Lyp1;->a:Lyp1;

    .line 123
    .line 124
    if-ne v0, v2, :cond_1

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_2
    invoke-static {v3, v1}, Lji0;->h(Ljava/io/File;Ljava/io/File;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    new-instance v2, Ljava/io/File;

    .line 132
    .line 133
    invoke-direct {v2, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-eqz v0, :cond_5

    .line 141
    .line 142
    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-eqz v0, :cond_3

    .line 147
    .line 148
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-nez v0, :cond_5

    .line 153
    .line 154
    :cond_3
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-eqz v0, :cond_4

    .line 159
    .line 160
    invoke-static {v2}, Lji0;->f(Ljava/io/File;)Z

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    if-nez v0, :cond_5

    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_4
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    if-nez v0, :cond_5

    .line 172
    .line 173
    :goto_1
    new-instance v0, Ljh0;

    .line 174
    .line 175
    const-string v4, "The destination file already exists."

    .line 176
    .line 177
    invoke-direct {v0, v3, v2, v4}, Luh0;-><init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p2, v2, v0}, Lii0;->b(Ljava/io/File;Ljava/io/IOException;)Ljava/lang/Void;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    sget-object v2, Lyp1;->a:Lyp1;

    .line 185
    .line 186
    if-ne v0, v2, :cond_1

    .line 187
    .line 188
    goto :goto_2

    .line 189
    :cond_5
    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    if-eqz v0, :cond_6

    .line 194
    .line 195
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 196
    .line 197
    .line 198
    goto :goto_0

    .line 199
    :cond_6
    invoke-static {v3, v2}, Lji0;->e(Ljava/io/File;Ljava/io/File;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2}, Ljava/io/File;->length()J

    .line 203
    .line 204
    .line 205
    move-result-wide v4

    .line 206
    invoke-virtual {v3}, Ljava/io/File;->length()J

    .line 207
    .line 208
    .line 209
    move-result-wide v6

    .line 210
    cmp-long v0, v4, v6

    .line 211
    .line 212
    if-eqz v0, :cond_1

    .line 213
    .line 214
    new-instance v0, Ljava/io/IOException;

    .line 215
    .line 216
    const-string v2, "Source file wasn\'t copied completely, length of destination file differs."

    .line 217
    .line 218
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {p2, v3, v0}, Lii0;->b(Ljava/io/File;Ljava/io/IOException;)Ljava/lang/Void;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    sget-object v2, Lyp1;->a:Lyp1;
    :try_end_0
    .catch Lan2; {:try_start_0 .. :try_end_0} :catch_0

    .line 226
    .line 227
    if-ne v0, v2, :cond_1

    .line 228
    .line 229
    :catch_0
    :cond_7
    :goto_2
    return-void
.end method

.method public final b()Ljava/io/File;
    .locals 0

    .line 1
    iget-object p0, p0, Ld8;->a:Lhk2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/io/File;

    .line 8
    .line 9
    return-object p0
.end method

.method public final c(Ljava/lang/String;)Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/io/File;

    .line 5
    .line 6
    invoke-virtual {p0}, Ld8;->b()Ljava/io/File;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/io/File;->list()[Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-eqz p0, :cond_1

    .line 18
    .line 19
    invoke-static {p0}, Lqd;->n([Ljava/lang/Object;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    if-nez p0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-object p0

    .line 27
    :cond_1
    :goto_0
    sget-object p0, Lnd0;->a:Lnd0;

    .line 28
    .line 29
    return-object p0
.end method

.method public final d(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/io/File;

    .line 5
    .line 6
    invoke-virtual {p0}, Ld8;->b()Ljava/io/File;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lji0;->f(Ljava/io/File;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method
