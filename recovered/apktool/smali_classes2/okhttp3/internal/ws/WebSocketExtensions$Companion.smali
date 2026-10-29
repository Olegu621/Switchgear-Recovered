.class public final Lokhttp3/internal/ws/WebSocketExtensions$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/ws/WebSocketExtensions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "Lokhttp3/internal/ws/WebSocketExtensions$Companion;",
        "",
        "()V",
        "HEADER_WEB_SOCKET_EXTENSION",
        "",
        "parse",
        "Lokhttp3/internal/ws/WebSocketExtensions;",
        "responseHeaders",
        "Lokhttp3/Headers;",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lokhttp3/internal/ws/WebSocketExtensions$Companion;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final parse(Lokhttp3/Headers;)Lokhttp3/internal/ws/WebSocketExtensions;
    .locals 19
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lokhttp3/Headers;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v3, 0x0

    .line 11
    move-object v7, v3

    .line 12
    move-object v9, v7

    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v8, 0x0

    .line 16
    const/4 v10, 0x0

    .line 17
    const/4 v11, 0x0

    .line 18
    :goto_0
    if-ge v4, v1, :cond_13

    .line 19
    .line 20
    add-int/lit8 v5, v4, 0x1

    .line 21
    .line 22
    invoke-virtual {v0, v4}, Lokhttp3/Headers;->name(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v12

    .line 26
    const-string v13, "Sec-WebSocket-Extensions"

    .line 27
    .line 28
    invoke-static {v12, v13}, Lkotlin/text/e;->h(Ljava/lang/String;Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v12

    .line 32
    if-nez v12, :cond_1

    .line 33
    .line 34
    :cond_0
    move v4, v5

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {v0, v4}, Lokhttp3/Headers;->value(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v13

    .line 40
    const/4 v15, 0x0

    .line 41
    :goto_1
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-ge v15, v4, :cond_0

    .line 46
    .line 47
    const/16 v17, 0x4

    .line 48
    .line 49
    const/16 v18, 0x0

    .line 50
    .line 51
    const/16 v14, 0x2c

    .line 52
    .line 53
    const/16 v16, 0x0

    .line 54
    .line 55
    invoke-static/range {v13 .. v18}, Lokhttp3/internal/Util;->delimiterOffset$default(Ljava/lang/String;CIIILjava/lang/Object;)I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    const/16 v12, 0x3b

    .line 60
    .line 61
    invoke-static {v13, v12, v15, v4}, Lokhttp3/internal/Util;->delimiterOffset(Ljava/lang/String;CII)I

    .line 62
    .line 63
    .line 64
    move-result v14

    .line 65
    invoke-static {v13, v15, v14}, Lokhttp3/internal/Util;->trimSubstring(Ljava/lang/String;II)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v15

    .line 69
    const/16 v16, 0x1

    .line 70
    .line 71
    add-int/lit8 v14, v14, 0x1

    .line 72
    .line 73
    const-string v2, "permessage-deflate"

    .line 74
    .line 75
    invoke-static {v15, v2}, Lkotlin/text/e;->h(Ljava/lang/String;Ljava/lang/String;)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_12

    .line 80
    .line 81
    if-eqz v6, :cond_2

    .line 82
    .line 83
    move/from16 v11, v16

    .line 84
    .line 85
    :cond_2
    move v15, v14

    .line 86
    :cond_3
    :goto_2
    if-ge v15, v4, :cond_11

    .line 87
    .line 88
    invoke-static {v13, v12, v15, v4}, Lokhttp3/internal/Util;->delimiterOffset(Ljava/lang/String;CII)I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    const/16 v6, 0x3d

    .line 93
    .line 94
    invoke-static {v13, v6, v15, v2}, Lokhttp3/internal/Util;->delimiterOffset(Ljava/lang/String;CII)I

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    invoke-static {v13, v15, v6}, Lokhttp3/internal/Util;->trimSubstring(Ljava/lang/String;II)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v14

    .line 102
    if-ge v6, v2, :cond_4

    .line 103
    .line 104
    add-int/lit8 v6, v6, 0x1

    .line 105
    .line 106
    invoke-static {v13, v6, v2}, Lokhttp3/internal/Util;->trimSubstring(Ljava/lang/String;II)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    invoke-static {v6}, Lkotlin/text/StringsKt;->J(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    goto :goto_3

    .line 115
    :cond_4
    move-object v6, v3

    .line 116
    :goto_3
    add-int/lit8 v15, v2, 0x1

    .line 117
    .line 118
    const-string v2, "client_max_window_bits"

    .line 119
    .line 120
    invoke-static {v14, v2}, Lkotlin/text/e;->h(Ljava/lang/String;Ljava/lang/String;)Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-eqz v2, :cond_8

    .line 125
    .line 126
    if-eqz v7, :cond_5

    .line 127
    .line 128
    move/from16 v11, v16

    .line 129
    .line 130
    :cond_5
    if-nez v6, :cond_6

    .line 131
    .line 132
    move-object v7, v3

    .line 133
    goto :goto_4

    .line 134
    :cond_6
    invoke-static {v6}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    move-object v7, v2

    .line 139
    :goto_4
    if-nez v7, :cond_3

    .line 140
    .line 141
    :cond_7
    :goto_5
    move/from16 v11, v16

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_8
    const-string v2, "client_no_context_takeover"

    .line 145
    .line 146
    invoke-static {v14, v2}, Lkotlin/text/e;->h(Ljava/lang/String;Ljava/lang/String;)Z

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    if-eqz v2, :cond_b

    .line 151
    .line 152
    if-eqz v8, :cond_9

    .line 153
    .line 154
    move/from16 v11, v16

    .line 155
    .line 156
    :cond_9
    if-eqz v6, :cond_a

    .line 157
    .line 158
    move/from16 v11, v16

    .line 159
    .line 160
    :cond_a
    move/from16 v8, v16

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_b
    const-string v2, "server_max_window_bits"

    .line 164
    .line 165
    invoke-static {v14, v2}, Lkotlin/text/e;->h(Ljava/lang/String;Ljava/lang/String;)Z

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    if-eqz v2, :cond_e

    .line 170
    .line 171
    if-eqz v9, :cond_c

    .line 172
    .line 173
    move/from16 v11, v16

    .line 174
    .line 175
    :cond_c
    if-nez v6, :cond_d

    .line 176
    .line 177
    move-object v9, v3

    .line 178
    goto :goto_6

    .line 179
    :cond_d
    invoke-static {v6}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    move-object v9, v2

    .line 184
    :goto_6
    if-nez v9, :cond_3

    .line 185
    .line 186
    goto :goto_5

    .line 187
    :cond_e
    const-string v2, "server_no_context_takeover"

    .line 188
    .line 189
    invoke-static {v14, v2}, Lkotlin/text/e;->h(Ljava/lang/String;Ljava/lang/String;)Z

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    if-eqz v2, :cond_7

    .line 194
    .line 195
    if-eqz v10, :cond_f

    .line 196
    .line 197
    move/from16 v11, v16

    .line 198
    .line 199
    :cond_f
    if-eqz v6, :cond_10

    .line 200
    .line 201
    move/from16 v11, v16

    .line 202
    .line 203
    :cond_10
    move/from16 v10, v16

    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_11
    move/from16 v6, v16

    .line 207
    .line 208
    goto/16 :goto_1

    .line 209
    .line 210
    :cond_12
    move v15, v14

    .line 211
    move/from16 v11, v16

    .line 212
    .line 213
    goto/16 :goto_1

    .line 214
    .line 215
    :cond_13
    new-instance v5, Lokhttp3/internal/ws/WebSocketExtensions;

    .line 216
    .line 217
    invoke-direct/range {v5 .. v11}, Lokhttp3/internal/ws/WebSocketExtensions;-><init>(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)V

    .line 218
    .line 219
    .line 220
    return-object v5
.end method
