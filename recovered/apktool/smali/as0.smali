.class public final Las0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static c:Las0;


# instance fields
.field public final a:Ljava/lang/Object;

.field public volatile b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Las0;->a:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Las0;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lio/sentry/u2;)V
    .locals 1

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Las0;->b:Ljava/lang/Object;

    .line 15
    iput-object p1, p0, Las0;->a:Ljava/lang/Object;

    return-void
.end method

.method public static b(Landroid/content/Context;)Las0;
    .locals 4

    .line 1
    invoke-static {p0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    const-class v0, Las0;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    sget-object v1, Las0;->c:Las0;

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    sget-object v1, Lko3;->a:Luf3;

    .line 12
    .line 13
    const-class v1, Lko3;

    .line 14
    .line 15
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 16
    :try_start_1
    sget-object v2, Lko3;->e:Landroid/content/Context;

    .line 17
    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    sput-object v2, Lko3;->e:Landroid/content/Context;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    .line 26
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    :try_start_3
    const-string v2, "GoogleCertificates"

    .line 31
    .line 32
    const-string v3, "GoogleCertificates has been initialized already"

    .line 33
    .line 34
    invoke-static {v2, v3}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 35
    .line 36
    .line 37
    :try_start_4
    monitor-exit v1

    .line 38
    :goto_0
    new-instance v1, Las0;

    .line 39
    .line 40
    invoke-direct {v1, p0}, Las0;-><init>(Landroid/content/Context;)V

    .line 41
    .line 42
    .line 43
    sput-object v1, Las0;->c:Las0;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :catchall_1
    move-exception p0

    .line 47
    goto :goto_3

    .line 48
    :goto_1
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 49
    :try_start_6
    throw p0

    .line 50
    :cond_1
    :goto_2
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 51
    sget-object p0, Las0;->c:Las0;

    .line 52
    .line 53
    return-object p0

    .line 54
    :goto_3
    :try_start_7
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 55
    throw p0
.end method

.method public static final e(Landroid/content/pm/PackageInfo;Z)Z
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto/16 :goto_9

    .line 5
    .line 6
    :cond_0
    const/4 v1, 0x1

    .line 7
    if-eqz p1, :cond_4

    .line 8
    .line 9
    iget-object v2, p0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 10
    .line 11
    const-string v3, "com.android.vending"

    .line 12
    .line 13
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-nez v2, :cond_1

    .line 18
    .line 19
    iget-object v2, p0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 20
    .line 21
    const-string v3, "com.google.android.gms"

    .line 22
    .line 23
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_4

    .line 28
    .line 29
    :cond_1
    iget-object p1, p0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 30
    .line 31
    if-nez p1, :cond_3

    .line 32
    .line 33
    :cond_2
    move p1, v0

    .line 34
    goto :goto_0

    .line 35
    :cond_3
    iget p1, p1, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 36
    .line 37
    and-int/lit16 p1, p1, 0x81

    .line 38
    .line 39
    if-eqz p1, :cond_2

    .line 40
    .line 41
    move p1, v1

    .line 42
    :cond_4
    :goto_0
    if-eqz p1, :cond_5

    .line 43
    .line 44
    :try_start_0
    sget-object v2, Len3;->c:Lcom/google/android/gms/internal/common/zzah;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_5
    sget-object v2, Len3;->b:Lcom/google/android/gms/internal/common/zzah;

    .line 48
    .line 49
    :goto_1
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 50
    .line 51
    const/16 v4, 0x1c

    .line 52
    .line 53
    if-ge v3, v4, :cond_8

    .line 54
    .line 55
    iget-object v3, p0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    if-eqz v3, :cond_6

    .line 59
    .line 60
    array-length v5, v3

    .line 61
    if-ne v5, v1, :cond_6

    .line 62
    .line 63
    aget-object v3, v3, v0

    .line 64
    .line 65
    invoke-virtual {v3}, Landroid/content/pm/Signature;->toByteArray()[B

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    :cond_6
    if-eqz v4, :cond_7

    .line 70
    .line 71
    invoke-static {v4}, Lcom/google/android/gms/internal/common/zzah;->zzk(Ljava/lang/Object;)Lcom/google/android/gms/internal/common/zzah;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    goto :goto_5

    .line 76
    :cond_7
    invoke-static {}, Lcom/google/android/gms/internal/common/zzah;->zzj()Lcom/google/android/gms/internal/common/zzah;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    goto :goto_5

    .line 81
    :cond_8
    if-lt v3, v4, :cond_9

    .line 82
    .line 83
    move v3, v1

    .line 84
    goto :goto_2

    .line 85
    :cond_9
    move v3, v0

    .line 86
    :goto_2
    invoke-static {v3}, Lcom/google/android/gms/internal/common/zzr;->zza(Z)V

    .line 87
    .line 88
    .line 89
    invoke-static {p0}, Lsk0;->e(Landroid/content/pm/PackageInfo;)Landroid/content/pm/SigningInfo;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    if-eqz v3, :cond_c

    .line 94
    .line 95
    invoke-static {v3}, Lsk0;->u(Landroid/content/pm/SigningInfo;)Z

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    if-nez v4, :cond_c

    .line 100
    .line 101
    invoke-static {v3}, Lsk0;->w(Landroid/content/pm/SigningInfo;)[Landroid/content/pm/Signature;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    if-nez v4, :cond_a

    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_a
    sget v4, Lcom/google/android/gms/internal/common/zzah;->zzd:I

    .line 109
    .line 110
    new-instance v4, Lcom/google/android/gms/internal/common/zzad;

    .line 111
    .line 112
    invoke-direct {v4}, Lcom/google/android/gms/internal/common/zzad;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-static {v3}, Lsk0;->w(Landroid/content/pm/SigningInfo;)[Landroid/content/pm/Signature;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    array-length v5, v3

    .line 120
    move v6, v0

    .line 121
    :goto_3
    if-ge v6, v5, :cond_b

    .line 122
    .line 123
    aget-object v7, v3, v6

    .line 124
    .line 125
    invoke-virtual {v7}, Landroid/content/pm/Signature;->toByteArray()[B

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    invoke-virtual {v4, v7}, Lcom/google/android/gms/internal/common/zzad;->zzb(Ljava/lang/Object;)Lcom/google/android/gms/internal/common/zzad;

    .line 130
    .line 131
    .line 132
    add-int/lit8 v6, v6, 0x1

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_b
    invoke-virtual {v4}, Lcom/google/android/gms/internal/common/zzad;->zzd()Lcom/google/android/gms/internal/common/zzah;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    goto :goto_5

    .line 140
    :cond_c
    :goto_4
    invoke-static {}, Lcom/google/android/gms/internal/common/zzah;->zzj()Lcom/google/android/gms/internal/common/zzah;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    :goto_5
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    if-nez v4, :cond_f

    .line 149
    .line 150
    invoke-virtual {v3}, Lcom/google/android/gms/internal/common/zzah;->zzh()Lcom/google/android/gms/internal/common/zzah;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 155
    .line 156
    .line 157
    move-result v4

    .line 158
    move v5, v0

    .line 159
    :goto_6
    if-ge v5, v4, :cond_11

    .line 160
    .line 161
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    check-cast v6, [B

    .line 166
    .line 167
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/common/zzah;->zzr(I)Lcom/google/android/gms/internal/common/zzal;

    .line 168
    .line 169
    .line 170
    move-result-object v7

    .line 171
    :cond_d
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v8

    .line 175
    add-int/lit8 v9, v5, 0x1

    .line 176
    .line 177
    if-eqz v8, :cond_e

    .line 178
    .line 179
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v8

    .line 183
    check-cast v8, [B

    .line 184
    .line 185
    invoke-static {v6, v8}, Ljava/util/Arrays;->equals([B[B)Z

    .line 186
    .line 187
    .line 188
    move-result v8

    .line 189
    if-eqz v8, :cond_d

    .line 190
    .line 191
    goto :goto_8

    .line 192
    :cond_e
    move v5, v9

    .line 193
    goto :goto_6

    .line 194
    :cond_f
    const-string v2, "Unable to obtain package certificate history."

    .line 195
    .line 196
    new-instance v3, Ljava/lang/IllegalArgumentException;

    .line 197
    .line 198
    invoke-direct {v3, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    throw v3
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 202
    :catch_0
    if-eqz p1, :cond_10

    .line 203
    .line 204
    sget-object p1, Len3;->a:[Ldk3;

    .line 205
    .line 206
    invoke-static {p0, p1}, Las0;->f(Landroid/content/pm/PackageInfo;[Ldk3;)Ldk3;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    goto :goto_7

    .line 211
    :cond_10
    sget-object p1, Len3;->a:[Ldk3;

    .line 212
    .line 213
    aget-object p1, p1, v0

    .line 214
    .line 215
    filled-new-array {p1}, [Ldk3;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    invoke-static {p0, p1}, Las0;->f(Landroid/content/pm/PackageInfo;[Ldk3;)Ldk3;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    :goto_7
    if-eqz p0, :cond_11

    .line 224
    .line 225
    :goto_8
    return v1

    .line 226
    :cond_11
    :goto_9
    return v0
.end method

.method public static varargs f(Landroid/content/pm/PackageInfo;[Ldk3;)Ldk3;
    .locals 3

    .line 1
    iget-object v0, p0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    array-length v0, v0

    .line 8
    const/4 v2, 0x1

    .line 9
    if-eq v0, v2, :cond_1

    .line 10
    .line 11
    const-string p0, "GoogleSignatureVerifier"

    .line 12
    .line 13
    const-string p1, "Package has more than one signature."

    .line 14
    .line 15
    invoke-static {p0, p1}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    return-object v1

    .line 19
    :cond_1
    new-instance v0, Lal3;

    .line 20
    .line 21
    iget-object p0, p0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    aget-object p0, p0, v2

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/content/pm/Signature;->toByteArray()[B

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-direct {v0, p0}, Lal3;-><init>([B)V

    .line 31
    .line 32
    .line 33
    :goto_0
    array-length p0, p1

    .line 34
    if-ge v2, p0, :cond_3

    .line 35
    .line 36
    aget-object p0, p1, v2

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Ldk3;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_2

    .line 43
    .line 44
    aget-object p0, p1, v2

    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    :goto_1
    return-object v1
.end method


# virtual methods
.method public a(Ljava/io/Serializable;)V
    .locals 1

    .line 1
    iput-object p1, p0, Las0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object p1, p0, Las0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object v0, p0, Las0;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->K(Ljava/lang/Iterable;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object p0, p0, Las0;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 21
    .line 22
    .line 23
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 38
    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    :goto_1
    return-void
.end method

.method public c(Landroid/content/Context;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Las0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-object v0, p0, Las0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Las0;->a:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lio/sentry/u2;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lio/sentry/u2;->f(Landroid/content/Context;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Las0;->b:Ljava/lang/Object;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    :goto_0
    monitor-exit p0

    .line 24
    goto :goto_2

    .line 25
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    throw p1

    .line 27
    :cond_1
    :goto_2
    iget-object p0, p0, Las0;->b:Ljava/lang/Object;

    .line 28
    .line 29
    return-object p0
.end method

.method public d(I)Z
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Las0;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroid/content/Context;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    move/from16 v2, p1

    .line 12
    .line 13
    invoke-virtual {v0, v2}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    if-eqz v2, :cond_10

    .line 18
    .line 19
    array-length v3, v2

    .line 20
    if-nez v3, :cond_0

    .line 21
    .line 22
    goto/16 :goto_d

    .line 23
    .line 24
    :cond_0
    const/4 v4, 0x0

    .line 25
    move-object v0, v4

    .line 26
    const/4 v6, 0x0

    .line 27
    :goto_0
    if-ge v6, v3, :cond_f

    .line 28
    .line 29
    aget-object v8, v2, v6

    .line 30
    .line 31
    const-string v15, "GoogleCertificates"

    .line 32
    .line 33
    const-string v7, "Failed to get Google certificates from remote"

    .line 34
    .line 35
    const-string v9, "null pkg"

    .line 36
    .line 37
    if-nez v8, :cond_1

    .line 38
    .line 39
    invoke-static {v9}, Lzr3;->B(Ljava/lang/String;)Lzr3;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const/4 v13, 0x0

    .line 44
    goto/16 :goto_c

    .line 45
    .line 46
    :cond_1
    iget-object v0, v1, Las0;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_c

    .line 55
    .line 56
    sget-object v0, Lko3;->a:Luf3;

    .line 57
    .line 58
    invoke-static {}, Landroid/os/StrictMode;->allowThreadDiskReads()Landroid/os/StrictMode$ThreadPolicy;

    .line 59
    .line 60
    .line 61
    move-result-object v10

    .line 62
    const/4 v11, 0x1

    .line 63
    :try_start_0
    invoke-static {}, Lko3;->a()V

    .line 64
    .line 65
    .line 66
    sget-object v0, Lko3;->c:Lcom/google/android/gms/common/internal/zzad;

    .line 67
    .line 68
    invoke-interface {v0}, Lcom/google/android/gms/common/internal/zzad;->zzg()Z

    .line 69
    .line 70
    .line 71
    move-result v0
    :try_end_0
    .catch Lsb0; {:try_start_0 .. :try_end_0} :catch_3
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 72
    invoke-static {v10}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 73
    .line 74
    .line 75
    if-eqz v0, :cond_5

    .line 76
    .line 77
    iget-object v0, v1, Las0;->a:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v0, Landroid/content/Context;

    .line 80
    .line 81
    invoke-static {v0}, Lwr0;->a(Landroid/content/Context;)Z

    .line 82
    .line 83
    .line 84
    move-result v9

    .line 85
    invoke-static {}, Landroid/os/StrictMode;->allowThreadDiskReads()Landroid/os/StrictMode$ThreadPolicy;

    .line 86
    .line 87
    .line 88
    move-result-object v16

    .line 89
    :try_start_1
    const-string v10, "module init: "

    .line 90
    .line 91
    sget-object v0, Lko3;->e:Landroid/content/Context;

    .line 92
    .line 93
    invoke-static {v0}, Lkb1;->n(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 94
    .line 95
    .line 96
    :try_start_2
    invoke-static {}, Lko3;->a()V
    :try_end_2
    .catch Lsb0; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 97
    .line 98
    .line 99
    :try_start_3
    sget-object v0, Lko3;->e:Landroid/content/Context;

    .line 100
    .line 101
    invoke-static {v0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    sget-object v0, Lko3;->e:Landroid/content/Context;

    .line 105
    .line 106
    move-object v10, v7

    .line 107
    new-instance v7, Lcom/google/android/gms/common/zzp;

    .line 108
    .line 109
    move v12, v11

    .line 110
    new-instance v11, Lcom/google/android/gms/dynamic/ObjectWrapper;

    .line 111
    .line 112
    invoke-direct {v11, v0}, Lcom/google/android/gms/dynamic/ObjectWrapper;-><init>(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    const/4 v13, 0x1

    .line 116
    const/4 v14, 0x0

    .line 117
    move-object/from16 v17, v10

    .line 118
    .line 119
    const/4 v10, 0x0

    .line 120
    move/from16 v18, v12

    .line 121
    .line 122
    const/4 v12, 0x0

    .line 123
    move-object/from16 v19, v17

    .line 124
    .line 125
    move/from16 v5, v18

    .line 126
    .line 127
    invoke-direct/range {v7 .. v14}, Lcom/google/android/gms/common/zzp;-><init>(Ljava/lang/String;ZZLandroid/os/IBinder;ZZZ)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 128
    .line 129
    .line 130
    :try_start_4
    sget-object v0, Lko3;->c:Lcom/google/android/gms/common/internal/zzad;

    .line 131
    .line 132
    invoke-interface {v0, v7}, Lcom/google/android/gms/common/internal/zzad;->U(Lcom/google/android/gms/common/zzp;)Lcom/google/android/gms/common/zzr;

    .line 133
    .line 134
    .line 135
    move-result-object v0
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 136
    :try_start_5
    iget-boolean v7, v0, Lcom/google/android/gms/common/zzr;->a:Z

    .line 137
    .line 138
    if-eqz v7, :cond_2

    .line 139
    .line 140
    iget v0, v0, Lcom/google/android/gms/common/zzr;->d:I

    .line 141
    .line 142
    invoke-static {v0}, Lk50;->Q(I)I

    .line 143
    .line 144
    .line 145
    new-instance v0, Lzr3;

    .line 146
    .line 147
    invoke-direct {v0, v5, v4, v4}, Lzr3;-><init>(ZLjava/lang/String;Ljava/lang/Exception;)V

    .line 148
    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_2
    iget-object v5, v0, Lcom/google/android/gms/common/zzr;->b:Ljava/lang/String;

    .line 152
    .line 153
    iget v7, v0, Lcom/google/android/gms/common/zzr;->c:I

    .line 154
    .line 155
    invoke-static {v7}, Lmn0;->H(I)I

    .line 156
    .line 157
    .line 158
    move-result v7

    .line 159
    const/4 v9, 0x4

    .line 160
    if-ne v7, v9, :cond_3

    .line 161
    .line 162
    new-instance v7, Landroid/content/pm/PackageManager$NameNotFoundException;

    .line 163
    .line 164
    invoke-direct {v7}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>()V

    .line 165
    .line 166
    .line 167
    goto :goto_1

    .line 168
    :catchall_0
    move-exception v0

    .line 169
    goto :goto_4

    .line 170
    :cond_3
    move-object v7, v4

    .line 171
    :goto_1
    const-string v9, "error checking package certificate"

    .line 172
    .line 173
    if-nez v5, :cond_4

    .line 174
    .line 175
    move-object v5, v9

    .line 176
    :cond_4
    iget v9, v0, Lcom/google/android/gms/common/zzr;->d:I

    .line 177
    .line 178
    invoke-static {v9}, Lk50;->Q(I)I

    .line 179
    .line 180
    .line 181
    iget v0, v0, Lcom/google/android/gms/common/zzr;->c:I

    .line 182
    .line 183
    invoke-static {v0}, Lmn0;->H(I)I

    .line 184
    .line 185
    .line 186
    new-instance v0, Lzr3;

    .line 187
    .line 188
    const/4 v9, 0x0

    .line 189
    invoke-direct {v0, v9, v5, v7}, Lzr3;-><init>(ZLjava/lang/String;Ljava/lang/Exception;)V

    .line 190
    .line 191
    .line 192
    goto :goto_2

    .line 193
    :catch_0
    move-exception v0

    .line 194
    move-object/from16 v7, v19

    .line 195
    .line 196
    invoke-static {v15, v7, v0}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 197
    .line 198
    .line 199
    const-string v5, "module call"

    .line 200
    .line 201
    invoke-static {v5, v0}, Lzr3;->C(Ljava/lang/String;Ljava/lang/Exception;)Lzr3;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    goto :goto_2

    .line 206
    :catch_1
    move-exception v0

    .line 207
    invoke-static {v15, v7, v0}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v5

    .line 214
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v5

    .line 218
    invoke-virtual {v10, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v5

    .line 222
    invoke-static {v5, v0}, Lzr3;->C(Ljava/lang/String;Ljava/lang/Exception;)Lzr3;

    .line 223
    .line 224
    .line 225
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 226
    :goto_2
    invoke-static/range {v16 .. v16}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 227
    .line 228
    .line 229
    :goto_3
    const/4 v13, 0x0

    .line 230
    goto/16 :goto_a

    .line 231
    .line 232
    :goto_4
    invoke-static/range {v16 .. v16}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 233
    .line 234
    .line 235
    throw v0

    .line 236
    :cond_5
    move v5, v11

    .line 237
    goto :goto_7

    .line 238
    :catchall_1
    move-exception v0

    .line 239
    goto/16 :goto_b

    .line 240
    .line 241
    :catch_2
    move-exception v0

    .line 242
    :goto_5
    move v5, v11

    .line 243
    goto :goto_6

    .line 244
    :catch_3
    move-exception v0

    .line 245
    goto :goto_5

    .line 246
    :goto_6
    :try_start_6
    invoke-static {v15, v7, v0}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 247
    .line 248
    .line 249
    invoke-static {v10}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 250
    .line 251
    .line 252
    :goto_7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 253
    .line 254
    const/16 v7, 0x1c

    .line 255
    .line 256
    if-lt v0, v7, :cond_6

    .line 257
    .line 258
    const v0, 0x8000040

    .line 259
    .line 260
    .line 261
    goto :goto_8

    .line 262
    :cond_6
    const/16 v0, 0x40

    .line 263
    .line 264
    :goto_8
    :try_start_7
    iget-object v7, v1, Las0;->a:Ljava/lang/Object;

    .line 265
    .line 266
    check-cast v7, Landroid/content/Context;

    .line 267
    .line 268
    invoke-virtual {v7}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 269
    .line 270
    .line 271
    move-result-object v7

    .line 272
    invoke-virtual {v7, v8, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 273
    .line 274
    .line 275
    move-result-object v0
    :try_end_7
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_7 .. :try_end_7} :catch_4

    .line 276
    iget-object v7, v1, Las0;->a:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast v7, Landroid/content/Context;

    .line 279
    .line 280
    invoke-static {v7}, Lwr0;->a(Landroid/content/Context;)Z

    .line 281
    .line 282
    .line 283
    move-result v7

    .line 284
    if-nez v0, :cond_7

    .line 285
    .line 286
    invoke-static {v9}, Lzr3;->B(Ljava/lang/String;)Lzr3;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    goto :goto_3

    .line 291
    :cond_7
    iget-object v9, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 292
    .line 293
    if-eqz v9, :cond_8

    .line 294
    .line 295
    array-length v9, v9

    .line 296
    if-eq v9, v5, :cond_9

    .line 297
    .line 298
    :cond_8
    const/4 v13, 0x0

    .line 299
    goto :goto_9

    .line 300
    :cond_9
    new-instance v9, Lal3;

    .line 301
    .line 302
    iget-object v10, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 303
    .line 304
    const/4 v11, 0x0

    .line 305
    aget-object v10, v10, v11

    .line 306
    .line 307
    invoke-virtual {v10}, Landroid/content/pm/Signature;->toByteArray()[B

    .line 308
    .line 309
    .line 310
    move-result-object v10

    .line 311
    invoke-direct {v9, v10}, Lal3;-><init>([B)V

    .line 312
    .line 313
    .line 314
    iget-object v10, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 315
    .line 316
    invoke-static {}, Landroid/os/StrictMode;->allowThreadDiskReads()Landroid/os/StrictMode$ThreadPolicy;

    .line 317
    .line 318
    .line 319
    move-result-object v12

    .line 320
    :try_start_8
    invoke-static {v10, v9, v7, v11}, Lko3;->b(Ljava/lang/String;Lal3;ZZ)Lzr3;

    .line 321
    .line 322
    .line 323
    move-result-object v7
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 324
    invoke-static {v12}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 325
    .line 326
    .line 327
    iget-boolean v11, v7, Lzr3;->b:Z

    .line 328
    .line 329
    if-eqz v11, :cond_a

    .line 330
    .line 331
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 332
    .line 333
    if-eqz v0, :cond_a

    .line 334
    .line 335
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 336
    .line 337
    and-int/lit8 v0, v0, 0x2

    .line 338
    .line 339
    if-eqz v0, :cond_a

    .line 340
    .line 341
    invoke-static {}, Landroid/os/StrictMode;->allowThreadDiskReads()Landroid/os/StrictMode$ThreadPolicy;

    .line 342
    .line 343
    .line 344
    move-result-object v11

    .line 345
    const/4 v13, 0x0

    .line 346
    :try_start_9
    invoke-static {v10, v9, v13, v5}, Lko3;->b(Ljava/lang/String;Lal3;ZZ)Lzr3;

    .line 347
    .line 348
    .line 349
    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 350
    invoke-static {v11}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 351
    .line 352
    .line 353
    iget-boolean v0, v0, Lzr3;->b:Z

    .line 354
    .line 355
    if-eqz v0, :cond_b

    .line 356
    .line 357
    const-string v0, "debuggable release cert app rejected"

    .line 358
    .line 359
    invoke-static {v0}, Lzr3;->B(Ljava/lang/String;)Lzr3;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    goto :goto_a

    .line 364
    :catchall_2
    move-exception v0

    .line 365
    invoke-static {v11}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 366
    .line 367
    .line 368
    throw v0

    .line 369
    :cond_a
    const/4 v13, 0x0

    .line 370
    :cond_b
    move-object v0, v7

    .line 371
    goto :goto_a

    .line 372
    :catchall_3
    move-exception v0

    .line 373
    invoke-static {v12}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 374
    .line 375
    .line 376
    throw v0

    .line 377
    :goto_9
    const-string v0, "single cert required"

    .line 378
    .line 379
    invoke-static {v0}, Lzr3;->B(Ljava/lang/String;)Lzr3;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    :goto_a
    iget-boolean v5, v0, Lzr3;->b:Z

    .line 384
    .line 385
    if-eqz v5, :cond_d

    .line 386
    .line 387
    iput-object v8, v1, Las0;->b:Ljava/lang/Object;

    .line 388
    .line 389
    goto :goto_c

    .line 390
    :catch_4
    move-exception v0

    .line 391
    const/4 v13, 0x0

    .line 392
    const-string v5, "no pkg "

    .line 393
    .line 394
    invoke-virtual {v5, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v5

    .line 398
    invoke-static {v5, v0}, Lzr3;->C(Ljava/lang/String;Ljava/lang/Exception;)Lzr3;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    goto :goto_c

    .line 403
    :goto_b
    invoke-static {v10}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 404
    .line 405
    .line 406
    throw v0

    .line 407
    :cond_c
    const/4 v13, 0x0

    .line 408
    sget-object v0, Lzr3;->d:Lzr3;

    .line 409
    .line 410
    :cond_d
    :goto_c
    iget-boolean v5, v0, Lzr3;->b:Z

    .line 411
    .line 412
    if-eqz v5, :cond_e

    .line 413
    .line 414
    goto :goto_e

    .line 415
    :cond_e
    add-int/lit8 v6, v6, 0x1

    .line 416
    .line 417
    goto/16 :goto_0

    .line 418
    .line 419
    :cond_f
    invoke-static {v0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 420
    .line 421
    .line 422
    goto :goto_e

    .line 423
    :cond_10
    :goto_d
    const-string v0, "no pkgs"

    .line 424
    .line 425
    invoke-static {v0}, Lzr3;->B(Ljava/lang/String;)Lzr3;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    :goto_e
    iget-boolean v1, v0, Lzr3;->b:Z

    .line 430
    .line 431
    if-nez v1, :cond_12

    .line 432
    .line 433
    const-string v1, "GoogleCertificatesRslt"

    .line 434
    .line 435
    const/4 v2, 0x3

    .line 436
    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 437
    .line 438
    .line 439
    move-result v1

    .line 440
    if-eqz v1, :cond_12

    .line 441
    .line 442
    iget-object v1, v0, Lzr3;->c:Ljava/lang/Object;

    .line 443
    .line 444
    check-cast v1, Ljava/lang/Throwable;

    .line 445
    .line 446
    if-eqz v1, :cond_11

    .line 447
    .line 448
    invoke-virtual {v0}, Lzr3;->y()V

    .line 449
    .line 450
    .line 451
    goto :goto_f

    .line 452
    :cond_11
    invoke-virtual {v0}, Lzr3;->y()V

    .line 453
    .line 454
    .line 455
    :cond_12
    :goto_f
    iget-boolean v0, v0, Lzr3;->b:Z

    .line 456
    .line 457
    return v0
.end method
