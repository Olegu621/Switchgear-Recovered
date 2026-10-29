.class public Lcom/supercell/titan/NativeHTTPConnection;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/supercell/titan/NativeHTTPConnection$Status;,
        Lcom/supercell/titan/NativeHTTPConnection$Method;
    }
.end annotation


# instance fields
.field public final U:Ljava/lang/String;

.field public V:I

.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public d:Lcom/supercell/titan/NativeHTTPConnection$Method;

.field public final e:Landroid/os/Handler;

.field public f:[B

.field public i:Lcom/supercell/titan/NativeHTTPConnection$Status;

.field public tag:I

.field public v:[B

.field public w:Ljava/util/Map;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 24
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    const-string v1, ""

    invoke-direct {p0, v0, v1, v1}, Lcom/supercell/titan/NativeHTTPConnection;-><init>(Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lcom/supercell/titan/NativeHTTPConnection;->a:Ljava/lang/String;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/supercell/titan/NativeHTTPConnection;->b:Ljava/lang/String;

    .line 9
    .line 10
    sget-object v0, Lcom/supercell/titan/NativeHTTPConnection$Status;->IDLE:Lcom/supercell/titan/NativeHTTPConnection$Status;

    .line 11
    .line 12
    iput-object v0, p0, Lcom/supercell/titan/NativeHTTPConnection;->i:Lcom/supercell/titan/NativeHTTPConnection$Status;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lcom/supercell/titan/NativeHTTPConnection;->w:Ljava/util/Map;

    .line 16
    .line 17
    iput-object p1, p0, Lcom/supercell/titan/NativeHTTPConnection;->e:Landroid/os/Handler;

    .line 18
    .line 19
    iput-object p2, p0, Lcom/supercell/titan/NativeHTTPConnection;->c:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p3, p0, Lcom/supercell/titan/NativeHTTPConnection;->U:Ljava/lang/String;

    .line 22
    .line 23
    return-void
.end method

.method public static a(Ljava/io/File;Ljava/io/File;)Z
    .locals 5

    .line 1
    const/4 v1, 0x0

    .line 2
    :try_start_0
    new-instance v2, Ljava/io/FileInputStream;

    .line 3
    .line 4
    invoke-direct {v2, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, v2}, Lio/sentry/config/a;->b(Ljava/io/File;Ljava/io/FileInputStream;)Ljava/io/FileInputStream;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    new-instance v2, Ljava/io/FileOutputStream;

    .line 12
    .line 13
    invoke-direct {v2, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v2, p1}, Lio/sentry/config/a;->e(Ljava/io/FileOutputStream;Ljava/io/File;)Ljava/io/FileOutputStream;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const/16 v3, 0x400

    .line 21
    .line 22
    new-array v3, v3, [B

    .line 23
    .line 24
    :goto_0
    invoke-virtual {p0, v3}, Ljava/io/FileInputStream;->read([B)I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-lez v4, :cond_0

    .line 29
    .line 30
    invoke-virtual {v2, v3, v1, v4}, Ljava/io/FileOutputStream;->write([BII)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catch_0
    move-exception p0

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    invoke-virtual {p0}, Ljava/io/FileInputStream;->close()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    const/4 p0, 0x1

    .line 43
    return p0

    .line 44
    :goto_1
    const v0, 0xc1

    const-string v2, "NativeHTTPConnection"

    .line 45
    .line 46
    const v0, 0xc2

    const-string v3, "NativeHTTPConnection.copyFile"

    .line 47
    .line 48
    invoke-static {v2, v3, p0}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 52
    .line 53
    .line 54
    return v1
.end method

.method public static b(Ljava/lang/String;)Ljava/net/HttpURLConnection;
    .locals 2

    .line 1
    new-instance v0, Ljava/net/URL;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Ljava/net/HttpURLConnection;

    .line 11
    .line 12
    const/16 v0, 0x3a98

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 15
    .line 16
    .line 17
    const v0, 0xc3

    const-string v0, "charset"

    .line 18
    .line 19
    const v1, 0xc4

    const-string v1, "utf-8"

    .line 20
    .line 21
    invoke-virtual {p0, v0, v1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const v0, 0xc5

    const-string v0, "Connection"

    .line 25
    .line 26
    const v1, 0xc6

    const-string v1, "close"

    .line 27
    .line 28
    invoke-virtual {p0, v0, v1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object p0
.end method

.method public static createConnectionForPost(Ljava/lang/String;)Ljava/net/HttpURLConnection;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/supercell/titan/NativeHTTPConnection;->b(Ljava/lang/String;)Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-virtual {p0, v0}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 10
    .line 11
    .line 12
    const v0, 0xc7

    const-string v0, "POST"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const v0, 0xc8

    const-string v0, "Content-Type"

    .line 18
    .line 19
    const v1, 0xc9

    const-string v1, "application/x-www-form-urlencoded"

    .line 20
    .line 21
    invoke-virtual {p0, v0, v1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object p0
.end method

.method public static e(Ljava/io/BufferedInputStream;)[B
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 3
    .line 4
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 5
    .line 6
    .line 7
    const/16 v2, 0x400

    .line 8
    .line 9
    new-array v3, v2, [B

    .line 10
    .line 11
    :goto_0
    invoke-virtual {p0, v3, v0, v2}, Ljava/io/InputStream;->read([BII)I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    const/4 v5, -0x1

    .line 16
    if-eq v4, v5, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1, v3, v0, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method


# virtual methods
.method public final c()Z
    .locals 13

    .line 1
    iget-object v1, p0, Lcom/supercell/titan/NativeHTTPConnection;->c:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v2, p0, Lcom/supercell/titan/NativeHTTPConnection;->U:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v3, p0, Lcom/supercell/titan/NativeHTTPConnection;->a:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v3}, Lcom/supercell/titan/NativeHTTPConnection;->b(Ljava/lang/String;)Ljava/net/HttpURLConnection;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    :try_start_0
    const v0, 0xca

    const-string v4, "GET"

    .line 12
    .line 13
    invoke-virtual {v3, v4}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v4, 0x1

    .line 17
    invoke-virtual {v3, v4}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 18
    .line 19
    .line 20
    new-instance v5, Ljava/io/BufferedInputStream;

    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    invoke-direct {v5, v6}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    iput v6, p0, Lcom/supercell/titan/NativeHTTPConnection;->V:I

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-eqz v6, :cond_0

    .line 40
    .line 41
    invoke-static {v5}, Lcom/supercell/titan/NativeHTTPConnection;->e(Ljava/io/BufferedInputStream;)[B

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iput-object v1, p0, Lcom/supercell/titan/NativeHTTPConnection;->v:[B

    .line 46
    .line 47
    goto/16 :goto_8

    .line 48
    .line 49
    :catchall_0
    move-exception p0

    .line 50
    goto/16 :goto_a

    .line 51
    .line 52
    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    const/4 v6, 0x0

    .line 57
    if-nez p0, :cond_1

    .line 58
    .line 59
    :try_start_1
    const v0, 0xcb

    const-string p0, "SHA-1"

    .line 60
    .line 61
    invoke-static {p0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 62
    .line 63
    .line 64
    move-result-object p0
    :try_end_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    goto :goto_0

    .line 66
    :catch_0
    move-exception p0

    .line 67
    :try_start_2
    invoke-static {p0}, Lcom/supercell/titan/GameApp;->debuggerException(Ljava/lang/Exception;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    move-object p0, v6

    .line 71
    :goto_0
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    const v0, 0xcc

    const-string v8, "download"

    .line 76
    .line 77
    const v0, 0xcd

    const-string v9, ".tmp"

    .line 78
    .line 79
    invoke-virtual {v7}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    invoke-static {v8, v9, v7}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 84
    .line 85
    .line 86
    move-result-object v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 87
    :try_start_3
    new-instance v8, Ljava/io/FileOutputStream;

    .line 88
    .line 89
    invoke-direct {v8, v7}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 90
    .line 91
    .line 92
    invoke-static {v8, v7}, Lio/sentry/config/a;->e(Ljava/io/FileOutputStream;Ljava/io/File;)Ljava/io/FileOutputStream;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    const/16 v8, 0x400

    .line 97
    .line 98
    new-array v9, v8, [B

    .line 99
    .line 100
    :cond_2
    :goto_1
    const/4 v10, 0x0

    .line 101
    invoke-virtual {v5, v9, v10, v8}, Ljava/io/InputStream;->read([BII)I

    .line 102
    .line 103
    .line 104
    move-result v11

    .line 105
    const/4 v12, -0x1

    .line 106
    if-eq v11, v12, :cond_3

    .line 107
    .line 108
    invoke-virtual {v6, v9, v10, v11}, Ljava/io/FileOutputStream;->write([BII)V

    .line 109
    .line 110
    .line 111
    if-eqz p0, :cond_2

    .line 112
    .line 113
    invoke-virtual {p0, v9, v10, v11}, Ljava/security/MessageDigest;->update([BII)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :catchall_1
    move-exception p0

    .line 118
    goto/16 :goto_9

    .line 119
    .line 120
    :cond_3
    :try_start_4
    invoke-virtual {v6}, Ljava/io/FileOutputStream;->close()V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 124
    .line 125
    .line 126
    move-result v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 127
    const v0, 0xce

    const-string v6, "NativeHTTPConnection"

    .line 128
    .line 129
    if-nez v5, :cond_7

    .line 130
    .line 131
    if-eqz p0, :cond_7

    .line 132
    .line 133
    :try_start_5
    invoke-virtual {p0}, Ljava/security/MessageDigest;->digest()[B

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    if-nez p0, :cond_4

    .line 138
    .line 139
    const v0, 0xcf

    const-string p0, "NativeHTTPConnection.doGet error creating SHA1"

    .line 140
    .line 141
    invoke-static {v6, p0}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 142
    .line 143
    .line 144
    goto :goto_4

    .line 145
    :catch_1
    move-exception p0

    .line 146
    goto :goto_3

    .line 147
    :cond_4
    new-instance v5, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    const/16 v8, 0x28

    .line 150
    .line 151
    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 152
    .line 153
    .line 154
    array-length v8, p0

    .line 155
    move v9, v10

    .line 156
    :goto_2
    if-ge v9, v8, :cond_5

    .line 157
    .line 158
    aget-byte v11, p0, v9

    .line 159
    .line 160
    const v0, 0xd0

    const-string v12, "%02x"

    .line 161
    .line 162
    and-int/lit16 v11, v11, 0xff

    .line 163
    .line 164
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 165
    .line 166
    .line 167
    move-result-object v11

    .line 168
    filled-new-array {v11}, [Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v11

    .line 172
    invoke-static {v12, v11}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v11

    .line 176
    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    add-int/lit8 v9, v9, 0x1

    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_5
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    invoke-virtual {p0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 187
    .line 188
    .line 189
    move-result p0

    .line 190
    if-eqz p0, :cond_6

    .line 191
    .line 192
    goto :goto_4

    .line 193
    :cond_6
    const v0, 0xd1

    const-string p0, "NativeHTTPConnection.doGet sha1 hashes of file don\'t match:"

    .line 194
    .line 195
    invoke-static {v6, p0}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 196
    .line 197
    .line 198
    invoke-static {v6, v2}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 199
    .line 200
    .line 201
    move p0, v10

    .line 202
    goto :goto_5

    .line 203
    :goto_3
    :try_start_6
    const v0, 0xd2

    const-string v1, "NativeHTTPConnection.doGet Problem getting file hash"

    .line 204
    .line 205
    invoke-static {v6, v1, p0}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 206
    .line 207
    .line 208
    invoke-static {p0}, Lcom/supercell/titan/GameApp;->debuggerException(Ljava/lang/Exception;)V

    .line 209
    .line 210
    .line 211
    :cond_7
    :goto_4
    move p0, v4

    .line 212
    :goto_5
    if-eqz p0, :cond_a

    .line 213
    .line 214
    new-instance v1, Ljava/io/File;

    .line 215
    .line 216
    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v7, v1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    if-nez v2, :cond_9

    .line 224
    .line 225
    const v0, 0xd3

    const-string v2, "NativeHTTPConnection.doGet Couldn\'t rename temp file"

    .line 226
    .line 227
    invoke-static {v6, v2}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 228
    .line 229
    .line 230
    invoke-static {v7, v1}, Lcom/supercell/titan/NativeHTTPConnection;->a(Ljava/io/File;Ljava/io/File;)Z

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    if-eqz v1, :cond_8

    .line 235
    .line 236
    :goto_6
    move v10, p0

    .line 237
    goto :goto_7

    .line 238
    :cond_8
    const v0, 0xd4

    const-string p0, "NativeHTTPConnection.doGet Couldn\'t \'rename\' the file by copying it either"

    .line 239
    .line 240
    invoke-static {v6, p0}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 241
    .line 242
    .line 243
    goto :goto_7

    .line 244
    :cond_9
    move v4, v10

    .line 245
    goto :goto_6

    .line 246
    :goto_7
    move p0, v10

    .line 247
    :cond_a
    if-eqz v4, :cond_b

    .line 248
    .line 249
    invoke-virtual {v7}, Ljava/io/File;->delete()Z

    .line 250
    .line 251
    .line 252
    move-result v1

    .line 253
    if-nez v1, :cond_b

    .line 254
    .line 255
    const v0, 0xd5

    const-string v1, "NativeHTTPConnection.doGet Was unable to delete temp file"

    .line 256
    .line 257
    invoke-static {v6, v1}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 258
    .line 259
    .line 260
    :cond_b
    move v4, p0

    .line 261
    :goto_8
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 262
    .line 263
    .line 264
    return v4

    .line 265
    :goto_9
    if-eqz v6, :cond_c

    .line 266
    .line 267
    :try_start_7
    invoke-virtual {v6}, Ljava/io/FileOutputStream;->close()V

    .line 268
    .line 269
    .line 270
    :cond_c
    throw p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 271
    :goto_a
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 272
    .line 273
    .line 274
    throw p0
.end method

.method public final d()V
    .locals 5

    .line 1
    iget-object v1, p0, Lcom/supercell/titan/NativeHTTPConnection;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v1}, Lcom/supercell/titan/NativeHTTPConnection;->createConnectionForPost(Ljava/lang/String;)Ljava/net/HttpURLConnection;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    :try_start_0
    const v0, 0xd6

    const-string v2, "X-timestamp"

    .line 8
    .line 9
    iget-object v3, p0, Lcom/supercell/titan/NativeHTTPConnection;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v1, v2, v3}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, Lcom/supercell/titan/NativeHTTPConnection;->f:[B

    .line 15
    .line 16
    array-length v2, v2

    .line 17
    invoke-virtual {v1, v2}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    .line 18
    .line 19
    .line 20
    iget-object v2, p0, Lcom/supercell/titan/NativeHTTPConnection;->w:Ljava/util/Map;

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_0

    .line 29
    .line 30
    iget-object v2, p0, Lcom/supercell/titan/NativeHTTPConnection;->w:Ljava/util/Map;

    .line 31
    .line 32
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_0

    .line 45
    .line 46
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, Ljava/lang/String;

    .line 51
    .line 52
    iget-object v4, p0, Lcom/supercell/titan/NativeHTTPConnection;->w:Ljava/util/Map;

    .line 53
    .line 54
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    check-cast v4, Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v1, v3, v4}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catchall_0
    move-exception p0

    .line 65
    goto :goto_1

    .line 66
    :cond_0
    new-instance v2, Ljava/io/BufferedOutputStream;

    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-direct {v2, v3}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 73
    .line 74
    .line 75
    iget-object v3, p0, Lcom/supercell/titan/NativeHTTPConnection;->f:[B

    .line 76
    .line 77
    invoke-virtual {v2, v3}, Ljava/io/OutputStream;->write([B)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V

    .line 81
    .line 82
    .line 83
    new-instance v2, Ljava/io/BufferedInputStream;

    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-direct {v2, v3}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 90
    .line 91
    .line 92
    invoke-static {v2}, Lcom/supercell/titan/NativeHTTPConnection;->e(Ljava/io/BufferedInputStream;)[B

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    iput-object v3, p0, Lcom/supercell/titan/NativeHTTPConnection;->v:[B

    .line 97
    .line 98
    invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    iput v2, p0, Lcom/supercell/titan/NativeHTTPConnection;->V:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :goto_1
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 112
    .line 113
    .line 114
    throw p0
.end method

.method public getExpectedSha1()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/supercell/titan/NativeHTTPConnection;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMethod()Lcom/supercell/titan/NativeHTTPConnection$Method;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/supercell/titan/NativeHTTPConnection;->d:Lcom/supercell/titan/NativeHTTPConnection$Method;

    .line 2
    .line 3
    return-object p0
.end method

.method public getReceivedData()[B
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/supercell/titan/NativeHTTPConnection;->v:[B

    .line 2
    .line 3
    return-object p0
.end method

.method public getResponseCode()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/supercell/titan/NativeHTTPConnection;->V:I

    .line 2
    .line 3
    return p0
.end method

.method public getStatus()Lcom/supercell/titan/NativeHTTPConnection$Status;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/supercell/titan/NativeHTTPConnection;->i:Lcom/supercell/titan/NativeHTTPConnection$Status;

    .line 2
    .line 3
    return-object p0
.end method

.method public prepareGet(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/supercell/titan/NativeHTTPConnection$Method;->GET:Lcom/supercell/titan/NativeHTTPConnection$Method;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/supercell/titan/NativeHTTPConnection;->d:Lcom/supercell/titan/NativeHTTPConnection$Method;

    .line 4
    .line 5
    iput-object p1, p0, Lcom/supercell/titan/NativeHTTPConnection;->a:Ljava/lang/String;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iput-object p1, p0, Lcom/supercell/titan/NativeHTTPConnection;->f:[B

    .line 9
    .line 10
    iput-object p2, p0, Lcom/supercell/titan/NativeHTTPConnection;->b:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method

.method public preparePost(Ljava/lang/String;[BLjava/lang/String;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[B",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/supercell/titan/NativeHTTPConnection$Method;->POST:Lcom/supercell/titan/NativeHTTPConnection$Method;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/supercell/titan/NativeHTTPConnection;->d:Lcom/supercell/titan/NativeHTTPConnection$Method;

    .line 4
    .line 5
    iput-object p1, p0, Lcom/supercell/titan/NativeHTTPConnection;->a:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/supercell/titan/NativeHTTPConnection;->f:[B

    .line 8
    .line 9
    iput-object p3, p0, Lcom/supercell/titan/NativeHTTPConnection;->b:Ljava/lang/String;

    .line 10
    .line 11
    if-eqz p4, :cond_0

    .line 12
    .line 13
    invoke-interface {p4}, Ljava/util/Map;->size()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-lez p1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p4, 0x0

    .line 21
    :goto_0
    iput-object p4, p0, Lcom/supercell/titan/NativeHTTPConnection;->w:Ljava/util/Map;

    .line 22
    .line 23
    return-void
.end method

.method public run()V
    .locals 4

    .line 1
    sget-object v1, Lcom/supercell/titan/NativeHTTPConnection$Status;->ACTIVE:Lcom/supercell/titan/NativeHTTPConnection$Status;

    .line 2
    .line 3
    iput-object v1, p0, Lcom/supercell/titan/NativeHTTPConnection;->i:Lcom/supercell/titan/NativeHTTPConnection$Status;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/supercell/titan/NativeHTTPConnection;->d:Lcom/supercell/titan/NativeHTTPConnection$Method;

    .line 6
    .line 7
    sget-object v2, Lcom/supercell/titan/NativeHTTPConnection$Method;->GET:Lcom/supercell/titan/NativeHTTPConnection$Method;

    .line 8
    .line 9
    const v0, 0xd7

    const-string v3, "NativeHTTPConnection"

    .line 10
    .line 11
    if-ne v1, v2, :cond_1

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p0}, Lcom/supercell/titan/NativeHTTPConnection;->c()Z

    .line 14
    .line 15
    .line 16
    move-result v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    goto :goto_0

    .line 18
    :catch_0
    move-exception v1

    .line 19
    invoke-static {v1}, Lcom/supercell/titan/GameApp;->debuggerException(Ljava/lang/Exception;)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    :goto_0
    if-eqz v1, :cond_0

    .line 24
    .line 25
    sget-object v1, Lcom/supercell/titan/NativeHTTPConnection$Status;->OK:Lcom/supercell/titan/NativeHTTPConnection$Status;

    .line 26
    .line 27
    iput-object v1, p0, Lcom/supercell/titan/NativeHTTPConnection;->i:Lcom/supercell/titan/NativeHTTPConnection$Status;

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    sget-object v1, Lcom/supercell/titan/NativeHTTPConnection$Status;->FAILED:Lcom/supercell/titan/NativeHTTPConnection$Status;

    .line 31
    .line 32
    iput-object v1, p0, Lcom/supercell/titan/NativeHTTPConnection;->i:Lcom/supercell/titan/NativeHTTPConnection$Status;

    .line 33
    .line 34
    const v0, 0xd8

    const-string v1, "NativeHTTPConnection.run get/download FAIL"

    .line 35
    .line 36
    invoke-static {v3, v1}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    sget-object v2, Lcom/supercell/titan/NativeHTTPConnection$Method;->POST:Lcom/supercell/titan/NativeHTTPConnection$Method;

    .line 41
    .line 42
    if-ne v1, v2, :cond_2

    .line 43
    .line 44
    :try_start_1
    invoke-virtual {p0}, Lcom/supercell/titan/NativeHTTPConnection;->d()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 45
    .line 46
    .line 47
    sget-object v1, Lcom/supercell/titan/NativeHTTPConnection$Status;->OK:Lcom/supercell/titan/NativeHTTPConnection$Status;

    .line 48
    .line 49
    iput-object v1, p0, Lcom/supercell/titan/NativeHTTPConnection;->i:Lcom/supercell/titan/NativeHTTPConnection$Status;

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :catch_1
    move-exception v1

    .line 53
    const v0, 0xd9

    const-string v2, "NativeHTTPConnection.run POST IOException"

    .line 54
    .line 55
    invoke-static {v3, v2, v1}, Lio/sentry/android/core/n0;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    sget-object v1, Lcom/supercell/titan/NativeHTTPConnection$Status;->FAILED:Lcom/supercell/titan/NativeHTTPConnection$Status;

    .line 59
    .line 60
    iput-object v1, p0, Lcom/supercell/titan/NativeHTTPConnection;->i:Lcom/supercell/titan/NativeHTTPConnection$Status;

    .line 61
    .line 62
    const v0, 0xda

    const-string v1, "NativeHTTPConnection.run POST FAIL"

    .line 63
    .line 64
    invoke-static {v3, v1}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    sget-object v1, Lcom/supercell/titan/NativeHTTPConnection$Status;->FAILED:Lcom/supercell/titan/NativeHTTPConnection$Status;

    .line 69
    .line 70
    iput-object v1, p0, Lcom/supercell/titan/NativeHTTPConnection;->i:Lcom/supercell/titan/NativeHTTPConnection$Status;

    .line 71
    .line 72
    :goto_1
    new-instance v1, Landroid/os/Message;

    .line 73
    .line 74
    invoke-direct {v1}, Landroid/os/Message;-><init>()V

    .line 75
    .line 76
    .line 77
    iput-object p0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 78
    .line 79
    iget-object p0, p0, Lcom/supercell/titan/NativeHTTPConnection;->e:Landroid/os/Handler;

    .line 80
    .line 81
    invoke-virtual {p0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 82
    .line 83
    .line 84
    return-void
.end method
