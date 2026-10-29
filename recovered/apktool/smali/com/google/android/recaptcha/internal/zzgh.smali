.class public final Lcom/google/android/recaptcha/internal/zzgh;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field private zza:Lcom/google/android/recaptcha/internal/zzvu;

.field private final zzb:Lp51;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget v0, Lcom/google/android/recaptcha/internal/zzby;->zza:I

    .line 5
    .line 6
    sget-object v0, Lcom/google/android/recaptcha/internal/zzgg;->zza:Lcom/google/android/recaptcha/internal/zzgg;

    .line 7
    .line 8
    invoke-static {v0}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zzgh;->zzb:Lp51;

    .line 13
    .line 14
    return-void
.end method

.method private final zzb()Landroid/app/Application;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzgh;->zzb:Lp51;

    .line 2
    .line 3
    invoke-interface {p0}, Lp51;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/app/Application;

    .line 8
    .line 9
    return-object p0
.end method

.method private static final zzc()Ljava/lang/String;
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/util/Locale;->getISO3Country()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/util/MissingResourceException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :catch_0
    const-string v0, ""

    .line 14
    .line 15
    return-object v0
.end method

.method private static final zzd()Ljava/lang/String;
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/util/Locale;->getISO3Language()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/util/MissingResourceException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :catch_0
    const-string v0, ""

    .line 14
    .line 15
    return-object v0
.end method


# virtual methods
.method public final zza(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzwz;
    .locals 9

    .line 1
    sget v0, Lcom/google/android/recaptcha/internal/zzby;->zza:I

    .line 2
    .line 3
    sget-object v0, Lcom/google/android/recaptcha/internal/zzgf;->zza:Lcom/google/android/recaptcha/internal/zzgf;

    .line 4
    .line 5
    invoke-static {v0}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lcom/google/android/recaptcha/internal/zzch;

    .line 14
    .line 15
    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zzgh;->zzb()Landroid/app/Application;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Lcom/google/android/recaptcha/internal/zzch;->zza(Landroid/content/Context;)Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzgh;->zza:Lcom/google/android/recaptcha/internal/zzvu;

    .line 24
    .line 25
    if-nez v1, :cond_5

    .line 26
    .line 27
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzvu;->zzf()Lcom/google/android/recaptcha/internal/zzvr;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Lcom/google/android/recaptcha/internal/zzvr;->zzf(I)Lcom/google/android/recaptcha/internal/zzvr;

    .line 34
    .line 35
    .line 36
    const-string v3, "com.google.android.gms.version"

    .line 37
    .line 38
    const/16 v4, 0x21

    .line 39
    .line 40
    const-string v5, "unknown"

    .line 41
    .line 42
    const/4 v6, -0x1

    .line 43
    if-lt v2, v4, :cond_1

    .line 44
    .line 45
    :try_start_0
    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zzgh;->zzb()Landroid/app/Application;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zzgh;->zzb()Landroid/app/Application;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    invoke-static {}, Lx72;->b()Landroid/content/pm/PackageManager$ApplicationInfoFlags;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    invoke-static {v2, v7, v8}, Lx72;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;Landroid/content/pm/PackageManager$ApplicationInfoFlags;)Landroid/content/pm/ApplicationInfo;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 70
    .line 71
    invoke-virtual {v2, v3, v6}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-ne v2, v6, :cond_0

    .line 76
    .line 77
    :catch_0
    :goto_0
    move-object v2, v5

    .line 78
    goto :goto_1

    .line 79
    :cond_0
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    goto :goto_1

    .line 84
    :cond_1
    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zzgh;->zzb()Landroid/app/Application;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zzgh;->zzb()Landroid/app/Application;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    const/16 v8, 0x80

    .line 101
    .line 102
    invoke-virtual {v2, v7, v8}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 107
    .line 108
    invoke-virtual {v2, v3, v6}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-ne v2, v6, :cond_2

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_2
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v2
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 119
    :goto_1
    invoke-virtual {v1, v2}, Lcom/google/android/recaptcha/internal/zzvr;->zzs(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzvr;

    .line 120
    .line 121
    .line 122
    const-string v2, "18.7.1"

    .line 123
    .line 124
    invoke-virtual {v1, v2}, Lcom/google/android/recaptcha/internal/zzvr;->zzu(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzvr;

    .line 125
    .line 126
    .line 127
    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 128
    .line 129
    invoke-virtual {v1, v2}, Lcom/google/android/recaptcha/internal/zzvr;->zzr(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzvr;

    .line 130
    .line 131
    .line 132
    sget-object v2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 133
    .line 134
    invoke-virtual {v1, v2}, Lcom/google/android/recaptcha/internal/zzvr;->zzt(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzvr;

    .line 135
    .line 136
    .line 137
    :try_start_1
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 138
    .line 139
    if-lt v2, v4, :cond_3

    .line 140
    .line 141
    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zzgh;->zzb()Landroid/app/Application;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zzgh;->zzb()Landroid/app/Application;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    invoke-static {}, Lcom/appsflyer/internal/i;->c()Landroid/content/pm/PackageManager$PackageInfoFlags;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    invoke-static {v2, v3, v4}, Lcom/appsflyer/internal/i;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;Landroid/content/pm/PackageManager$PackageInfoFlags;)Landroid/content/pm/PackageInfo;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    invoke-static {v2}, Lcom/appsflyer/internal/q;->a(Landroid/content/pm/PackageInfo;)J

    .line 166
    .line 167
    .line 168
    move-result-wide v2

    .line 169
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    goto :goto_2

    .line 174
    :cond_3
    const/16 v3, 0x1c

    .line 175
    .line 176
    const/4 v4, 0x0

    .line 177
    if-lt v2, v3, :cond_4

    .line 178
    .line 179
    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zzgh;->zzb()Landroid/app/Application;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zzgh;->zzb()Landroid/app/Application;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    invoke-virtual {v2, v3, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    invoke-static {v2}, Lcom/appsflyer/internal/q;->a(Landroid/content/pm/PackageInfo;)J

    .line 200
    .line 201
    .line 202
    move-result-wide v2

    .line 203
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v5

    .line 207
    goto :goto_2

    .line 208
    :cond_4
    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zzgh;->zzb()Landroid/app/Application;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zzgh;->zzb()Landroid/app/Application;

    .line 217
    .line 218
    .line 219
    move-result-object v3

    .line 220
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    invoke-virtual {v2, v3, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    iget v2, v2, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 229
    .line 230
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v5
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 234
    :catch_1
    :goto_2
    invoke-virtual {v1, v5}, Lcom/google/android/recaptcha/internal/zzvr;->zzq(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzvr;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v1}, Lcom/google/android/recaptcha/internal/zzsh;->zzi()Lcom/google/android/recaptcha/internal/zzsn;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    check-cast v1, Lcom/google/android/recaptcha/internal/zzvu;

    .line 242
    .line 243
    :cond_5
    iput-object v1, p0, Lcom/google/android/recaptcha/internal/zzgh;->zza:Lcom/google/android/recaptcha/internal/zzvu;

    .line 244
    .line 245
    invoke-virtual {v1}, Lcom/google/android/recaptcha/internal/zzsn;->zzr()Lcom/google/android/recaptcha/internal/zzsh;

    .line 246
    .line 247
    .line 248
    move-result-object p0

    .line 249
    check-cast p0, Lcom/google/android/recaptcha/internal/zzvr;

    .line 250
    .line 251
    invoke-virtual {p0, v0}, Lcom/google/android/recaptcha/internal/zzvr;->zze(Ljava/lang/Iterable;)Lcom/google/android/recaptcha/internal/zzvr;

    .line 252
    .line 253
    .line 254
    invoke-virtual {p0}, Lcom/google/android/recaptcha/internal/zzsh;->zzi()Lcom/google/android/recaptcha/internal/zzsn;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    check-cast p0, Lcom/google/android/recaptcha/internal/zzvu;

    .line 259
    .line 260
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzwz;->zzf()Lcom/google/android/recaptcha/internal/zzwx;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-virtual {v0, p1}, Lcom/google/android/recaptcha/internal/zzwx;->zzr(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzwx;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v0, p0}, Lcom/google/android/recaptcha/internal/zzwx;->zze(Lcom/google/android/recaptcha/internal/zzvu;)Lcom/google/android/recaptcha/internal/zzwx;

    .line 268
    .line 269
    .line 270
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzgh;->zzd()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object p0

    .line 274
    invoke-virtual {v0, p0}, Lcom/google/android/recaptcha/internal/zzwx;->zzq(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzwx;

    .line 275
    .line 276
    .line 277
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzgh;->zzc()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object p0

    .line 281
    invoke-virtual {v0, p0}, Lcom/google/android/recaptcha/internal/zzwx;->zzf(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzwx;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzsh;->zzi()Lcom/google/android/recaptcha/internal/zzsn;

    .line 285
    .line 286
    .line 287
    move-result-object p0

    .line 288
    check-cast p0, Lcom/google/android/recaptcha/internal/zzwz;

    .line 289
    .line 290
    return-object p0
.end method
