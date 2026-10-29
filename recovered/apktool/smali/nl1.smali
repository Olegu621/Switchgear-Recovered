.class public final Lnl1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final Companion:Lml1;


# instance fields
.field public final a:Lgv1;

.field public final b:Lhk2;

.field public final c:Landroid/content/Context;

.field public final d:Lts0;

.field public final e:Lcom/usercentrics/sdk/UsercentricsOptions;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lml1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lnl1;->Companion:Lml1;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lts0;Lgv1;Lcom/usercentrics/sdk/UsercentricsOptions;)V
    .locals 1

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p3, p0, Lnl1;->a:Lgv1;

    .line 14
    .line 15
    new-instance p3, Lf8;

    .line 16
    .line 17
    const/16 v0, 0x11

    .line 18
    .line 19
    invoke-direct {p3, p0, v0}, Lf8;-><init>(Ljava/lang/Object;I)V

    .line 20
    .line 21
    .line 22
    invoke-static {p3}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    iput-object p3, p0, Lnl1;->b:Lhk2;

    .line 27
    .line 28
    iput-object p1, p0, Lnl1;->c:Landroid/content/Context;

    .line 29
    .line 30
    iput-object p2, p0, Lnl1;->d:Lts0;

    .line 31
    .line 32
    iput-object p4, p0, Lnl1;->e:Lcom/usercentrics/sdk/UsercentricsOptions;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final a()Le13;
    .locals 9

    .line 1
    new-instance v1, Le13;

    .line 2
    .line 3
    iget-object v0, p0, Lnl1;->c:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v2, "uimode"

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    instance-of v3, v2, Landroid/app/UiModeManager;

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    check-cast v2, Landroid/app/UiModeManager;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v2, v4

    .line 23
    :goto_0
    if-eqz v2, :cond_1

    .line 24
    .line 25
    invoke-virtual {v2}, Landroid/app/UiModeManager;->getCurrentModeType()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    :cond_1
    if-nez v4, :cond_2

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    const/4 v3, 0x4

    .line 41
    if-ne v2, v3, :cond_3

    .line 42
    .line 43
    const-string v2, "Android-TV"

    .line 44
    .line 45
    goto :goto_5

    .line 46
    :cond_3
    :goto_1
    const/4 v2, 0x3

    .line 47
    if-nez v4, :cond_4

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_4
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-ne v3, v2, :cond_5

    .line 55
    .line 56
    const-string v2, "Android-Car"

    .line 57
    .line 58
    goto :goto_5

    .line 59
    :cond_5
    :goto_2
    if-nez v4, :cond_6

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_6
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    const/4 v5, 0x2

    .line 67
    if-ne v3, v5, :cond_7

    .line 68
    .line 69
    const-string v2, "Android-Desktop"

    .line 70
    .line 71
    goto :goto_5

    .line 72
    :cond_7
    :goto_3
    if-nez v4, :cond_8

    .line 73
    .line 74
    goto :goto_4

    .line 75
    :cond_8
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    const/4 v4, 0x6

    .line 80
    if-ne v3, v4, :cond_9

    .line 81
    .line 82
    const-string v2, "Android-Watch"

    .line 83
    .line 84
    goto :goto_5

    .line 85
    :cond_9
    :goto_4
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    const-string v4, "amazon.hardware.fire_tv"

    .line 90
    .line 91
    invoke-virtual {v3, v4}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-eqz v3, :cond_a

    .line 96
    .line 97
    const-string v2, "Android-Amazon-FireTV"

    .line 98
    .line 99
    goto :goto_5

    .line 100
    :cond_a
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    iget v3, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 109
    .line 110
    and-int/lit8 v3, v3, 0xf

    .line 111
    .line 112
    if-lt v3, v2, :cond_b

    .line 113
    .line 114
    const-string v2, "Android-Tablet"

    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_b
    const-string v2, "Android"

    .line 118
    .line 119
    :goto_5
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 120
    .line 121
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    iget-object v5, p0, Lnl1;->b:Lhk2;

    .line 133
    .line 134
    invoke-virtual {v5}, Lhk2;->getValue()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    check-cast v5, Ljava/lang/String;

    .line 139
    .line 140
    const/4 v6, 0x0

    .line 141
    :try_start_0
    sget-object v7, Lo42;->b:Lm42;

    .line 142
    .line 143
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 144
    .line 145
    .line 146
    move-result-object v7

    .line 147
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-virtual {v7, v0, v6}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 156
    .line 157
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 158
    .line 159
    .line 160
    goto :goto_6

    .line 161
    :catchall_0
    move-exception v0

    .line 162
    sget-object v7, Lo42;->b:Lm42;

    .line 163
    .line 164
    new-instance v7, Ln42;

    .line 165
    .line 166
    invoke-direct {v7, v0}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 167
    .line 168
    .line 169
    move-object v0, v7

    .line 170
    :goto_6
    invoke-static {v0}, Lo42;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 171
    .line 172
    .line 173
    move-result-object v7

    .line 174
    if-nez v7, :cond_c

    .line 175
    .line 176
    goto :goto_7

    .line 177
    :cond_c
    const-string v0, "unknown-version"

    .line 178
    .line 179
    :goto_7
    check-cast v0, Ljava/lang/String;

    .line 180
    .line 181
    iget-object v7, p0, Lnl1;->d:Lts0;

    .line 182
    .line 183
    iget-object v7, v7, Lts0;->a:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v7, Lil1;

    .line 186
    .line 187
    const-string v8, "com.usercentrics.sdk.flutter.UCFlutterFlag"

    .line 188
    .line 189
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    :try_start_1
    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 193
    .line 194
    .line 195
    goto :goto_8

    .line 196
    :catch_0
    const-string v7, "usercentrics_sdk.UCFlutterFlag"

    .line 197
    .line 198
    :try_start_2
    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 199
    .line 200
    .line 201
    :goto_8
    const-string v6, "flutter"

    .line 202
    .line 203
    :goto_9
    move-object v7, v6

    .line 204
    goto :goto_b

    .line 205
    :catch_1
    const-string v7, "com.usercentrics.reactnativeusercentrics.UCRNFlag"

    .line 206
    .line 207
    :try_start_3
    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 208
    .line 209
    .line 210
    goto :goto_a

    .line 211
    :catch_2
    const-string v7, "react_native_usercentrics.UCRNFlag"

    .line 212
    .line 213
    :try_start_4
    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 214
    .line 215
    .line 216
    :goto_a
    const-string v6, "react-native"

    .line 217
    .line 218
    goto :goto_9

    .line 219
    :catch_3
    const-string v7, "2.24.4"

    .line 220
    .line 221
    const-string v8, "-unity"

    .line 222
    .line 223
    invoke-static {v7, v8, v6}, Lkotlin/text/StringsKt;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 224
    .line 225
    .line 226
    move-result v6

    .line 227
    if-eqz v6, :cond_d

    .line 228
    .line 229
    const-string v6, "unity"

    .line 230
    .line 231
    goto :goto_9

    .line 232
    :cond_d
    const-string v6, "native"

    .line 233
    .line 234
    goto :goto_9

    .line 235
    :goto_b
    iget-object p0, p0, Lnl1;->e:Lcom/usercentrics/sdk/UsercentricsOptions;

    .line 236
    .line 237
    iget-boolean v8, p0, Lcom/usercentrics/sdk/UsercentricsOptions;->g:Z

    .line 238
    .line 239
    move-object v6, v0

    .line 240
    invoke-direct/range {v1 .. v8}, Le13;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 241
    .line 242
    .line 243
    return-object v1
.end method
