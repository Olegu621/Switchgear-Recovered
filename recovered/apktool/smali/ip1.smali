.class public final Lip1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lum1;


# static fields
.field public static final i:Ljava/lang/String;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lokhttp3/MediaType;

.field public final c:I

.field public final d:I

.field public e:Z

.field public final f:Ljava/util/Map;

.field public final g:Lokhttp3/OkHttpClient;

.field public final h:Landroid/net/Uri$Builder;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "andr-6.0.6"

    .line 2
    .line 3
    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x2

    .line 10
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "snowplow/%s android/%s"

    .line 15
    .line 16
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sput-object v0, Lip1;->i:Ljava/lang/String;

    .line 21
    .line 22
    return-void
.end method

.method public constructor <init>(Lhp1;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, Lip1;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lip1;->a:Ljava/lang/String;

    .line 11
    .line 12
    sget-object v0, Lokhttp3/MediaType;->Companion:Lokhttp3/MediaType$Companion;

    .line 13
    .line 14
    const-string v1, "application/json; charset=utf-8"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lokhttp3/MediaType$Companion;->parse(Ljava/lang/String;)Lokhttp3/MediaType;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lip1;->b:Lokhttp3/MediaType;

    .line 21
    .line 22
    iget-object v0, p1, Lhp1;->a:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    const-string v3, "https://"

    .line 33
    .line 34
    if-nez v2, :cond_1

    .line 35
    .line 36
    :cond_0
    :goto_0
    invoke-static {v3, v0}, Len;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    goto :goto_2

    .line 41
    :cond_1
    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    const v4, 0x310888    # 4.503E-39f

    .line 52
    .line 53
    .line 54
    if-eq v2, v4, :cond_3

    .line 55
    .line 56
    const v4, 0x5f008eb

    .line 57
    .line 58
    .line 59
    if-eq v2, v4, :cond_2

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    const-string v2, "https"

    .line 63
    .line 64
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-nez v1, :cond_4

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    const-string v2, "http"

    .line 72
    .line 73
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-nez v1, :cond_4

    .line 78
    .line 79
    :goto_1
    goto :goto_0

    .line 80
    :cond_4
    :goto_2
    iget v1, p1, Lhp1;->c:I

    .line 81
    .line 82
    iput v1, p0, Lip1;->c:I

    .line 83
    .line 84
    iget v2, p1, Lhp1;->e:I

    .line 85
    .line 86
    iput v2, p0, Lip1;->d:I

    .line 87
    .line 88
    iget-object v2, p1, Lhp1;->h:Ljava/lang/String;

    .line 89
    .line 90
    iget-boolean v3, p1, Lhp1;->i:Z

    .line 91
    .line 92
    iput-boolean v3, p0, Lip1;->e:Z

    .line 93
    .line 94
    iget-object v3, p1, Lhp1;->j:Ljava/util/Map;

    .line 95
    .line 96
    iput-object v3, p0, Lip1;->f:Ljava/util/Map;

    .line 97
    .line 98
    new-instance v3, Lac1;

    .line 99
    .line 100
    iget-object v4, p1, Lhp1;->d:Ljava/util/EnumSet;

    .line 101
    .line 102
    invoke-direct {v3, v4}, Lac1;-><init>(Ljava/util/EnumSet;)V

    .line 103
    .line 104
    .line 105
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    iput-object v0, p0, Lip1;->h:Landroid/net/Uri$Builder;

    .line 117
    .line 118
    const/4 v4, 0x1

    .line 119
    if-ne v1, v4, :cond_5

    .line 120
    .line 121
    const-string v1, "i"

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 124
    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_5
    if-nez v2, :cond_6

    .line 128
    .line 129
    const-string v1, "com.snowplowanalytics.snowplow/tp2"

    .line 130
    .line 131
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->appendEncodedPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 132
    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_6
    invoke-virtual {v0, v2}, Landroid/net/Uri$Builder;->appendEncodedPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 136
    .line 137
    .line 138
    :goto_3
    iget-object v0, p1, Lhp1;->f:Lokhttp3/OkHttpClient;

    .line 139
    .line 140
    if-nez v0, :cond_a

    .line 141
    .line 142
    new-instance v0, Lokhttp3/OkHttpClient$Builder;

    .line 143
    .line 144
    invoke-direct {v0}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    .line 145
    .line 146
    .line 147
    iget-object v1, v3, Lac1;->d:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v1, Lam2;

    .line 150
    .line 151
    const/4 v2, 0x0

    .line 152
    if-eqz v1, :cond_9

    .line 153
    .line 154
    iget-object v3, v3, Lac1;->c:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v3, Ljavax/net/ssl/X509TrustManager;

    .line 157
    .line 158
    if-eqz v3, :cond_8

    .line 159
    .line 160
    invoke-virtual {v0, v1, v3}, Lokhttp3/OkHttpClient$Builder;->sslSocketFactory(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)Lokhttp3/OkHttpClient$Builder;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    const-wide/16 v1, 0xf

    .line 165
    .line 166
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 167
    .line 168
    invoke-virtual {v0, v1, v2, v3}, Lokhttp3/OkHttpClient$Builder;->connectTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-virtual {v0, v1, v2, v3}, Lokhttp3/OkHttpClient$Builder;->readTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    iget-object v1, p1, Lhp1;->g:Lokhttp3/CookieJar;

    .line 177
    .line 178
    if-nez v1, :cond_7

    .line 179
    .line 180
    new-instance v1, Lcb;

    .line 181
    .line 182
    iget-object p1, p1, Lhp1;->b:Landroid/content/Context;

    .line 183
    .line 184
    const/16 v2, 0x19

    .line 185
    .line 186
    invoke-direct {v1, p1, v2}, Lcb;-><init>(Landroid/content/Context;I)V

    .line 187
    .line 188
    .line 189
    :cond_7
    invoke-virtual {v0, v1}, Lokhttp3/OkHttpClient$Builder;->cookieJar(Lokhttp3/CookieJar;)Lokhttp3/OkHttpClient$Builder;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    goto :goto_4

    .line 198
    :cond_8
    const-string p0, "trustManager"

    .line 199
    .line 200
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    throw v2

    .line 204
    :cond_9
    const-string p0, "sslSocketFactory"

    .line 205
    .line 206
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    throw v2

    .line 210
    :cond_a
    :goto_4
    iput-object v0, p0, Lip1;->g:Lokhttp3/OkHttpClient;

    .line 211
    .line 212
    return-void
.end method
