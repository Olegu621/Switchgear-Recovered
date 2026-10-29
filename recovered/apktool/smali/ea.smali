.class public final synthetic Lea;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 10
    iput p2, p0, Lea;->a:I

    iput-object p1, p0, Lea;->b:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/profileinstaller/ProfileInstallerInitializer;Landroid/content/Context;)V
    .locals 0

    .line 1
    const/4 p1, 0x3

    .line 2
    iput p1, p0, Lea;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lea;->b:Landroid/content/Context;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget v0, p0, Lea;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object p0, p0, Lea;->b:Landroid/content/Context;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    new-instance v0, Lqd1;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    sget-object v1, Lhe3;->d:Lec0;

    .line 17
    .line 18
    invoke-static {p0, v0, v1, v3}, Lhe3;->y(Landroid/content/Context;Ljava/util/concurrent/Executor;Lay1;Z)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    new-instance v4, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 23
    .line 24
    new-instance v10, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 25
    .line 26
    invoke-direct {v10}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 27
    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v6, 0x1

    .line 31
    const-wide/16 v7, 0x0

    .line 32
    .line 33
    sget-object v9, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 34
    .line 35
    invoke-direct/range {v4 .. v10}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    .line 36
    .line 37
    .line 38
    new-instance v0, Lea;

    .line 39
    .line 40
    const/4 v1, 0x5

    .line 41
    invoke-direct {v0, p0, v1}, Lea;-><init>(Landroid/content/Context;I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 49
    .line 50
    const/16 v1, 0x1c

    .line 51
    .line 52
    if-lt v0, v1, :cond_0

    .line 53
    .line 54
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-static {v0}, Ldy1;->a(Landroid/os/Looper;)Landroid/os/Handler;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    new-instance v0, Landroid/os/Handler;

    .line 64
    .line 65
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 70
    .line 71
    .line 72
    :goto_0
    new-instance v1, Ljava/util/Random;

    .line 73
    .line 74
    invoke-direct {v1}, Ljava/util/Random;-><init>()V

    .line 75
    .line 76
    .line 77
    const/16 v3, 0x3e8

    .line 78
    .line 79
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    invoke-virtual {v1, v2}, Ljava/util/Random;->nextInt(I)I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    new-instance v2, Lea;

    .line 88
    .line 89
    const/4 v3, 0x4

    .line 90
    invoke-direct {v2, p0, v3}, Lea;-><init>(Landroid/content/Context;I)V

    .line 91
    .line 92
    .line 93
    add-int/lit16 v1, v1, 0x1388

    .line 94
    .line 95
    int-to-long v3, v1

    .line 96
    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :pswitch_2
    const-string v0, "Shield running in half-integration."

    .line 101
    .line 102
    invoke-static {p0, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :pswitch_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-static {p0}, Li13;->r(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    const-string v2, "installed_before"

    .line 118
    .line 119
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    if-nez v0, :cond_1

    .line 124
    .line 125
    new-instance v0, Lpc;

    .line 126
    .line 127
    invoke-direct {v0, v3}, Lpc;-><init>(I)V

    .line 128
    .line 129
    .line 130
    new-instance v1, Loc;

    .line 131
    .line 132
    invoke-direct {v1, v3, v0, p0}, Loc;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    invoke-static {p0}, Lcom/android/installreferrer/api/InstallReferrerClient;->newBuilder(Landroid/content/Context;)Lcom/android/installreferrer/api/InstallReferrerClient$Builder;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-virtual {p0}, Lcom/android/installreferrer/api/InstallReferrerClient$Builder;->build()Lcom/android/installreferrer/api/InstallReferrerClient;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    new-instance v0, Lwc0;

    .line 144
    .line 145
    const/16 v2, 0xf

    .line 146
    .line 147
    invoke-direct {v0, v2, p0, v1}, Lwc0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0, v0}, Lcom/android/installreferrer/api/InstallReferrerClient;->startConnection(Lcom/android/installreferrer/api/InstallReferrerStateListener;)V

    .line 151
    .line 152
    .line 153
    :cond_1
    return-void

    .line 154
    :pswitch_4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 155
    .line 156
    const/16 v3, 0x21

    .line 157
    .line 158
    if-lt v0, v3, :cond_7

    .line 159
    .line 160
    new-instance v4, Landroid/content/ComponentName;

    .line 161
    .line 162
    const-string v5, "androidx.appcompat.app.AppLocalesMetadataHolderService"

    .line 163
    .line 164
    invoke-direct {v4, p0, v5}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    invoke-virtual {v5, v4}, Landroid/content/pm/PackageManager;->getComponentEnabledSetting(Landroid/content/ComponentName;)I

    .line 172
    .line 173
    .line 174
    move-result v5

    .line 175
    if-eq v5, v2, :cond_7

    .line 176
    .line 177
    const-string v5, "locale"

    .line 178
    .line 179
    if-lt v0, v3, :cond_4

    .line 180
    .line 181
    sget-object v0, Lia;->i:Lkd;

    .line 182
    .line 183
    invoke-virtual {v0}, Lkd;->iterator()Ljava/util/Iterator;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    :cond_2
    move-object v3, v0

    .line 188
    check-cast v3, Lwb1;

    .line 189
    .line 190
    invoke-virtual {v3}, Lwb1;->hasNext()Z

    .line 191
    .line 192
    .line 193
    move-result v6

    .line 194
    if-eqz v6, :cond_3

    .line 195
    .line 196
    invoke-virtual {v3}, Lwb1;->next()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 201
    .line 202
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    check-cast v3, Lia;

    .line 207
    .line 208
    if-eqz v3, :cond_2

    .line 209
    .line 210
    check-cast v3, Lwa;

    .line 211
    .line 212
    iget-object v3, v3, Lwa;->V:Landroid/content/Context;

    .line 213
    .line 214
    if-eqz v3, :cond_2

    .line 215
    .line 216
    invoke-virtual {v3, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    :cond_3
    if-eqz v1, :cond_5

    .line 221
    .line 222
    invoke-static {v1}, Lga;->a(Ljava/lang/Object;)Landroid/os/LocaleList;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    new-instance v1, Lh91;

    .line 227
    .line 228
    new-instance v3, Li91;

    .line 229
    .line 230
    invoke-direct {v3, v0}, Li91;-><init>(Landroid/os/LocaleList;)V

    .line 231
    .line 232
    .line 233
    invoke-direct {v1, v3}, Lh91;-><init>(Li91;)V

    .line 234
    .line 235
    .line 236
    goto :goto_1

    .line 237
    :cond_4
    sget-object v1, Lia;->c:Lh91;

    .line 238
    .line 239
    if-eqz v1, :cond_5

    .line 240
    .line 241
    goto :goto_1

    .line 242
    :cond_5
    sget-object v1, Lh91;->b:Lh91;

    .line 243
    .line 244
    :goto_1
    iget-object v0, v1, Lh91;->a:Li91;

    .line 245
    .line 246
    iget-object v0, v0, Li91;->a:Landroid/os/LocaleList;

    .line 247
    .line 248
    invoke-virtual {v0}, Landroid/os/LocaleList;->isEmpty()Z

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    if-eqz v0, :cond_6

    .line 253
    .line 254
    invoke-static {p0}, Lw11;->C(Landroid/content/Context;)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    invoke-virtual {p0, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    if-eqz v1, :cond_6

    .line 263
    .line 264
    invoke-static {v0}, Lfa;->a(Ljava/lang/String;)Landroid/os/LocaleList;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-static {v1, v0}, Lga;->b(Ljava/lang/Object;Landroid/os/LocaleList;)V

    .line 269
    .line 270
    .line 271
    :cond_6
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 272
    .line 273
    .line 274
    move-result-object p0

    .line 275
    invoke-virtual {p0, v4, v2, v2}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    .line 276
    .line 277
    .line 278
    :cond_7
    sput-boolean v2, Lia;->f:Z

    .line 279
    .line 280
    return-void

    .line 281
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
