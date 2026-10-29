.class public Lcb;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Li2;
.implements Lso;
.implements Lokhttp3/CookieJar;
.implements Lxo0;


# static fields
.field public static final d:[I

.field public static final e:Ljava/lang/Object;

.field public static f:Lc93;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    const v0, 0x101013b

    .line 2
    .line 3
    .line 4
    const v1, 0x101013c

    .line 5
    .line 6
    .line 7
    filled-new-array {v0, v1}, [I

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lcb;->d:[I

    .line 12
    .line 13
    new-instance v0, Ljava/lang/Object;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lcb;->e:Ljava/lang/Object;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    iput p1, p0, Lcb;->a:I

    sparse-switch p1, :sswitch_data_0

    .line 213
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 214
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcb;->b:Ljava/lang/Object;

    .line 215
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcb;->c:Ljava/lang/Object;

    return-void

    .line 216
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 217
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcb;->b:Ljava/lang/Object;

    .line 218
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lcb;->c:Ljava/lang/Object;

    .line 219
    new-instance p0, Ljava/util/HashSet;

    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    return-void

    .line 220
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 221
    new-instance p1, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, Lcb;->b:Ljava/lang/Object;

    .line 222
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lcb;->c:Ljava/lang/Object;

    return-void

    .line 223
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object p1, p0, Lcb;->b:Ljava/lang/Object;

    return-void

    :sswitch_data_0
    .sparse-switch
        0x8 -> :sswitch_2
        0xb -> :sswitch_1
        0x13 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 193
    iput p1, p0, Lcb;->a:I

    iput-object p2, p0, Lcb;->b:Ljava/lang/Object;

    iput-object p3, p0, Lcb;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 159
    iput p1, p0, Lcb;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 4

    .line 1
    iput p2, p0, Lcb;->a:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcb;->b:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance p1, Lqd1;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcb;->c:Ljava/lang/Object;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance p2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 26
    .line 27
    invoke-direct {p2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-static {p2}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iput-object p2, p0, Lcb;->b:Ljava/lang/Object;

    .line 38
    .line 39
    const-string p2, "cookie_persistance"

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, Lcb;->c:Ljava/lang/Object;

    .line 50
    .line 51
    new-instance p2, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-interface {p1}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_2

    .line 76
    .line 77
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    check-cast v1, Ljava/util/Map$Entry;

    .line 82
    .line 83
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    check-cast v2, Ljava/lang/String;

    .line 88
    .line 89
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    instance-of v3, v1, Ljava/lang/String;

    .line 94
    .line 95
    if-eqz v3, :cond_0

    .line 96
    .line 97
    check-cast v1, Ljava/lang/String;

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_0
    const/4 v1, 0x0

    .line 101
    :goto_1
    if-nez v1, :cond_1

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_1
    :try_start_0
    new-instance v3, Lxw;

    .line 105
    .line 106
    invoke-direct {v3, v1}, Lxw;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    iget-object v1, p0, Lcb;->b:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v1, Ljava/util/Set;

    .line 112
    .line 113
    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 114
    .line 115
    .line 116
    goto :goto_0

    .line 117
    :catch_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_2
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    if-nez p0, :cond_4

    .line 129
    .line 130
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 139
    .line 140
    .line 141
    move-result p2

    .line 142
    if-eqz p2, :cond_3

    .line 143
    .line 144
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    check-cast p2, Ljava/lang/String;

    .line 149
    .line 150
    invoke-interface {p0, p2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 151
    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_3
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 155
    .line 156
    .line 157
    :cond_4
    return-void

    .line 158
    nop

    .line 159
    :pswitch_data_0
    .packed-switch 0x19
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Landroid/content/Context;Lgq;)V
    .locals 1

    const/16 v0, 0x12

    iput v0, p0, Lcb;->a:I

    .line 184
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 185
    const-string v0, "camera"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/hardware/camera2/CameraManager;

    iput-object p1, p0, Lcb;->b:Ljava/lang/Object;

    .line 186
    iput-object p2, p0, Lcb;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/Object;Ljava/util/LinkedHashSet;)V
    .locals 4

    const/16 v0, 0xf

    iput v0, p0, Lcb;->a:I

    .line 200
    new-instance v0, Ldc0;

    const/16 v1, 0x18

    .line 201
    invoke-direct {v0, v1}, Ldc0;-><init>(I)V

    .line 202
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 203
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lcb;->b:Ljava/lang/Object;

    .line 204
    iput-object v0, p0, Lcb;->c:Ljava/lang/Object;

    .line 205
    instance-of v0, p2, Lcq;

    if-eqz v0, :cond_0

    .line 206
    check-cast p2, Lcq;

    goto :goto_0

    .line 207
    :cond_0
    invoke-static {}, Ljb1;->q()Landroid/os/Handler;

    move-result-object p2

    invoke-static {p1, p2}, Lcq;->a(Landroid/content/Context;Landroid/os/Handler;)Lcq;

    move-result-object p2

    .line 208
    :goto_0
    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 209
    iget-object v1, p0, Lcb;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    new-instance v2, Lcj2;

    iget-object v3, p0, Lcb;->c:Ljava/lang/Object;

    check-cast v3, Ldc0;

    invoke-direct {v2, p1, v0, p2, v3}, Lcj2;-><init>(Landroid/content/Context;Ljava/lang/String;Lcq;Ldc0;)V

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    return-void
.end method

.method public constructor <init>(Landroid/hardware/camera2/CameraCaptureSession;Lcp;)V
    .locals 1

    const/16 v0, 0x10

    iput v0, p0, Lcb;->a:I

    .line 163
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 164
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    iput-object p1, p0, Lcb;->b:Ljava/lang/Object;

    .line 166
    iput-object p2, p0, Lcb;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/hardware/camera2/CameraDevice;Lqp;)V
    .locals 1

    const/16 v0, 0x11

    iput v0, p0, Lcb;->a:I

    .line 174
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 175
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    iput-object p1, p0, Lcb;->b:Ljava/lang/Object;

    .line 177
    iput-object p2, p0, Lcb;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/widget/EditText;)V
    .locals 2

    const/4 v0, 0x6

    iput v0, p0, Lcb;->a:I

    .line 187
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 188
    iput-object p1, p0, Lcb;->b:Ljava/lang/Object;

    .line 189
    new-instance v0, Lgr0;

    .line 190
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 191
    new-instance v1, Lwc0;

    invoke-direct {v1, p1}, Lwc0;-><init>(Landroid/widget/EditText;)V

    iput-object v1, v0, Lgr0;->a:Ljava/lang/Object;

    .line 192
    iput-object v0, p0, Lcb;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/cardview/widget/CardView;)V
    .locals 1

    const/16 v0, 0x16

    iput v0, p0, Lcb;->a:I

    .line 210
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcb;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 160
    iput p2, p0, Lcb;->a:I

    iput-object p1, p0, Lcb;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V
    .locals 0

    .line 161
    iput p3, p0, Lcb;->a:I

    iput-object p1, p0, Lcb;->c:Ljava/lang/Object;

    iput-object p2, p0, Lcb;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p2, p0, Lcb;->a:I

    packed-switch p2, :pswitch_data_0

    .line 178
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 179
    iput-object p1, p0, Lcb;->b:Ljava/lang/Object;

    .line 180
    new-instance p1, Lfv;

    invoke-direct {p1, p0}, Lfv;-><init>(Lcb;)V

    .line 181
    iput-object p1, p0, Lcb;->c:Ljava/lang/Object;

    return-void

    .line 182
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcb;->b:Ljava/lang/Object;

    .line 183
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lcb;->c:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1a
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function2;I)V
    .locals 0

    iput p2, p0, Lcb;->a:I

    packed-switch p2, :pswitch_data_0

    .line 194
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 195
    iput-object p1, p0, Lcb;->b:Ljava/lang/Object;

    .line 196
    new-instance p1, Lgv;

    invoke-direct {p1}, Lgv;-><init>()V

    .line 197
    iput-object p1, p0, Lcb;->c:Ljava/lang/Object;

    return-void

    .line 198
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcb;->b:Ljava/lang/Object;

    .line 199
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lcb;->c:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1b
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Llq;)V
    .locals 2

    const/16 v0, 0x14

    iput v0, p0, Lcb;->a:I

    .line 167
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 168
    iput-object p1, p0, Lcb;->b:Ljava/lang/Object;

    .line 169
    new-instance p1, Lrk1;

    .line 170
    invoke-direct {p1}, La91;-><init>()V

    .line 171
    iput-object p1, p0, Lcb;->c:Ljava/lang/Object;

    .line 172
    new-instance p0, Lef;

    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lef;-><init>(ILff;)V

    .line 173
    invoke-virtual {p1, p0}, Lrk1;->k(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Lxn;)V
    .locals 1

    const/16 v0, 0xe

    iput v0, p0, Lcb;->a:I

    .line 211
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcb;->c:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 212
    iput-object p1, p0, Lcb;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Z)V
    .locals 0

    .line 162
    const/16 p1, 0x8

    iput p1, p0, Lcb;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static k(Landroid/content/Context;Landroid/content/Intent;Z)Lcom/google/android/gms/tasks/Task;
    .locals 3

    .line 1
    sget-object v0, Lcb;->e:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcb;->f:Lc93;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Lc93;

    .line 9
    .line 10
    invoke-direct {v1, p0}, Lc93;-><init>(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lcb;->f:Lc93;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    goto :goto_4

    .line 18
    :cond_0
    :goto_0
    sget-object v1, Lcb;->f:Lc93;

    .line 19
    .line 20
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    if-eqz p2, :cond_3

    .line 22
    .line 23
    invoke-static {}, Lra2;->l()Lra2;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {p2, p0}, Lra2;->q(Landroid/content/Context;)Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-eqz p2, :cond_2

    .line 32
    .line 33
    sget-object p2, Lyy1;->c:Ljava/lang/Object;

    .line 34
    .line 35
    monitor-enter p2

    .line 36
    :try_start_1
    invoke-static {p0}, Lyy1;->h(Landroid/content/Context;)V

    .line 37
    .line 38
    .line 39
    const-string p0, "com.google.firebase.iid.WakeLockHolder.wakefulintent"

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    invoke-virtual {p1, p0, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    const-string v0, "com.google.firebase.iid.WakeLockHolder.wakefulintent"

    .line 47
    .line 48
    const/4 v2, 0x1

    .line 49
    invoke-virtual {p1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 50
    .line 51
    .line 52
    if-nez p0, :cond_1

    .line 53
    .line 54
    sget-object p0, Lyy1;->d:Lg63;

    .line 55
    .line 56
    invoke-virtual {p0}, Lg63;->a()V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :catchall_1
    move-exception p0

    .line 61
    goto :goto_2

    .line 62
    :cond_1
    :goto_1
    invoke-virtual {v1, p1}, Lc93;->b(Landroid/content/Intent;)Lcom/google/android/gms/tasks/Task;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    new-instance v0, Lx6;

    .line 67
    .line 68
    const/16 v1, 0x13

    .line 69
    .line 70
    invoke-direct {v0, p1, v1}, Lx6;-><init>(Ljava/lang/Object;I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v0}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 74
    .line 75
    .line 76
    monitor-exit p2

    .line 77
    goto :goto_3

    .line 78
    :goto_2
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 79
    throw p0

    .line 80
    :cond_2
    invoke-virtual {v1, p1}, Lc93;->b(Landroid/content/Intent;)Lcom/google/android/gms/tasks/Task;

    .line 81
    .line 82
    .line 83
    :goto_3
    const/4 p0, -0x1

    .line 84
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-static {p0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0

    .line 93
    :cond_3
    invoke-virtual {v1, p1}, Lc93;->b(Landroid/content/Intent;)Lcom/google/android/gms/tasks/Task;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    new-instance p1, Lqd1;

    .line 98
    .line 99
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 100
    .line 101
    .line 102
    new-instance p2, Ls80;

    .line 103
    .line 104
    const/16 v0, 0x8

    .line 105
    .line 106
    invoke-direct {p2, v0}, Ls80;-><init>(I)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/tasks/Task;->continueWith(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    return-object p0

    .line 114
    :goto_4
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 115
    throw p0
.end method

.method public static w()Lwe2;
    .locals 11

    .line 1
    new-instance v0, Landroid/os/StatFs;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/os/StatFs;->getAvailableBlocksLong()J

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    long-to-double v1, v1

    .line 19
    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSizeLong()J

    .line 20
    .line 21
    .line 22
    move-result-wide v3

    .line 23
    long-to-double v3, v3

    .line 24
    mul-double/2addr v1, v3

    .line 25
    const-wide/high16 v3, 0x41d0000000000000L    # 1.073741824E9

    .line 26
    .line 27
    div-double/2addr v1, v3

    .line 28
    const-wide/high16 v5, 0x4059000000000000L    # 100.0

    .line 29
    .line 30
    mul-double/2addr v1, v5

    .line 31
    invoke-static {v1, v2}, Ljava/lang/Math;->round(D)J

    .line 32
    .line 33
    .line 34
    move-result-wide v1

    .line 35
    long-to-double v1, v1

    .line 36
    div-double/2addr v1, v5

    .line 37
    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockCountLong()J

    .line 38
    .line 39
    .line 40
    move-result-wide v7

    .line 41
    long-to-double v7, v7

    .line 42
    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSizeLong()J

    .line 43
    .line 44
    .line 45
    move-result-wide v9

    .line 46
    long-to-double v9, v9

    .line 47
    mul-double/2addr v7, v9

    .line 48
    div-double/2addr v7, v3

    .line 49
    mul-double/2addr v7, v5

    .line 50
    invoke-static {v7, v8}, Ljava/lang/Math;->round(D)J

    .line 51
    .line 52
    .line 53
    move-result-wide v3

    .line 54
    long-to-double v3, v3

    .line 55
    div-double/2addr v3, v5

    .line 56
    new-instance v0, Lwe2;

    .line 57
    .line 58
    new-instance v5, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v3, " GB"

    .line 67
    .line 68
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    new-instance v5, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v5, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    const/16 v2, 0x9

    .line 91
    .line 92
    const/4 v3, 0x0

    .line 93
    invoke-direct {v0, v4, v1, v2, v3}, Lwe2;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 94
    .line 95
    .line 96
    return-object v0
.end method


# virtual methods
.method public A()Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object p0, p0, Lcb;->b:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast p0, Landroid/content/Context;

    .line 5
    .line 6
    const-string v1, "connectivity"

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Landroid/net/ConnectivityManager;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 21
    .line 22
    .line 23
    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    return p0

    .line 28
    :catch_0
    move-exception p0

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return v0

    .line 31
    :goto_0
    const-string v1, "Device"

    .line 32
    .line 33
    const-string v2, "Exception while getting system connectivity service"

    .line 34
    .line 35
    invoke-static {v1, v2, p0}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    return v0
.end method

.method public B(Landroid/util/AttributeSet;I)V
    .locals 8

    .line 1
    iget v0, p0, Lcb;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcb;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Landroid/widget/EditText;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v3, Landroidx/appcompat/R$styleable;->AppCompatTextView:[I

    .line 17
    .line 18
    invoke-virtual {v0, p1, v3, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    :try_start_0
    sget p2, Landroidx/appcompat/R$styleable;->AppCompatTextView_emojiCompatEnabled:I

    .line 23
    .line 24
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    if-eqz p2, :cond_0

    .line 29
    .line 30
    sget p2, Landroidx/appcompat/R$styleable;->AppCompatTextView_emojiCompatEnabled:I

    .line 31
    .line 32
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 33
    .line 34
    .line 35
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p0

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    :goto_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v1}, Lcb;->H(Z)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :goto_1
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 47
    .line 48
    .line 49
    throw p0

    .line 50
    :pswitch_0
    iget-object v0, p0, Lcb;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Landroid/widget/AbsSeekBar;

    .line 53
    .line 54
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    sget-object v4, Lcb;->d:[I

    .line 59
    .line 60
    invoke-static {v3, p1, v4, p2}, Lac1;->H(Landroid/content/Context;Landroid/util/AttributeSet;[II)Lac1;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p1, v2}, Lac1;->o(I)Landroid/graphics/drawable/Drawable;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    if-eqz p2, :cond_3

    .line 69
    .line 70
    instance-of v3, p2, Landroid/graphics/drawable/AnimationDrawable;

    .line 71
    .line 72
    if-eqz v3, :cond_2

    .line 73
    .line 74
    check-cast p2, Landroid/graphics/drawable/AnimationDrawable;

    .line 75
    .line 76
    invoke-virtual {p2}, Landroid/graphics/drawable/AnimationDrawable;->getNumberOfFrames()I

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    new-instance v4, Landroid/graphics/drawable/AnimationDrawable;

    .line 81
    .line 82
    invoke-direct {v4}, Landroid/graphics/drawable/AnimationDrawable;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2}, Landroid/graphics/drawable/AnimationDrawable;->isOneShot()Z

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    invoke-virtual {v4, v5}, Landroid/graphics/drawable/AnimationDrawable;->setOneShot(Z)V

    .line 90
    .line 91
    .line 92
    move v5, v2

    .line 93
    :goto_2
    const/16 v6, 0x2710

    .line 94
    .line 95
    if-ge v5, v3, :cond_1

    .line 96
    .line 97
    invoke-virtual {p2, v5}, Landroid/graphics/drawable/AnimationDrawable;->getFrame(I)Landroid/graphics/drawable/Drawable;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    invoke-virtual {p0, v7, v1}, Lcb;->M(Landroid/graphics/drawable/Drawable;Z)Landroid/graphics/drawable/Drawable;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    invoke-virtual {v7, v6}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    .line 106
    .line 107
    .line 108
    invoke-virtual {p2, v5}, Landroid/graphics/drawable/AnimationDrawable;->getDuration(I)I

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    invoke-virtual {v4, v7, v6}, Landroid/graphics/drawable/AnimationDrawable;->addFrame(Landroid/graphics/drawable/Drawable;I)V

    .line 113
    .line 114
    .line 115
    add-int/lit8 v5, v5, 0x1

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_1
    invoke-virtual {v4, v6}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    .line 119
    .line 120
    .line 121
    move-object p2, v4

    .line 122
    :cond_2
    invoke-virtual {v0, p2}, Landroid/widget/ProgressBar;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 123
    .line 124
    .line 125
    :cond_3
    invoke-virtual {p1, v1}, Lac1;->o(I)Landroid/graphics/drawable/Drawable;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    if-eqz p2, :cond_4

    .line 130
    .line 131
    invoke-virtual {p0, p2, v2}, Lcb;->M(Landroid/graphics/drawable/Drawable;Z)Landroid/graphics/drawable/Drawable;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-virtual {v0, p0}, Landroid/widget/ProgressBar;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 136
    .line 137
    .line 138
    :cond_4
    invoke-virtual {p1}, Lac1;->J()V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    nop

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public C(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)Lzc0;
    .locals 1

    .line 1
    iget-object p0, p0, Lcb;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lgr0;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    goto :goto_1

    .line 12
    :cond_0
    iget-object p0, p0, Lgr0;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lwc0;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    instance-of v0, p1, Lzc0;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    new-instance v0, Lzc0;

    .line 25
    .line 26
    iget-object p0, p0, Lwc0;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, Landroid/widget/EditText;

    .line 29
    .line 30
    invoke-direct {v0, p2, p1, p0}, Lzc0;-><init>(Landroid/view/inputmethod/EditorInfo;Landroid/view/inputmethod/InputConnection;Landroid/widget/TextView;)V

    .line 31
    .line 32
    .line 33
    move-object p1, v0

    .line 34
    :goto_0
    move-object p0, p1

    .line 35
    :goto_1
    check-cast p0, Lzc0;

    .line 36
    .line 37
    return-object p0
.end method

.method public D(Lol0;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcb;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/os/Handler;

    .line 4
    .line 5
    iget-object p0, p0, Lcb;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lts0;

    .line 8
    .line 9
    iget v1, p1, Lol0;->b:I

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iget-object p1, p1, Lol0;->a:Landroid/graphics/Typeface;

    .line 14
    .line 15
    new-instance v1, Lcp0;

    .line 16
    .line 17
    const/4 v2, 0x4

    .line 18
    invoke-direct {v1, v2, p0, p1}, Lcp0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    new-instance p1, Lym;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-direct {p1, p0, v1, v2}, Lym;-><init>(Ljava/lang/Object;II)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public E(Ljava/lang/String;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraDevice$StateCallback;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Lqn;

    .line 8
    .line 9
    invoke-direct {v0, p2, p3}, Lqn;-><init>(Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraDevice$StateCallback;)V

    .line 10
    .line 11
    .line 12
    iget-object p2, p0, Lcb;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p2, Lgq;

    .line 15
    .line 16
    :try_start_0
    iget-object p0, p0, Lcb;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Landroid/hardware/camera2/CameraManager;

    .line 19
    .line 20
    iget-object p2, p2, Lgq;->b:Landroid/os/Handler;

    .line 21
    .line 22
    invoke-virtual {p0, p1, v0, p2}, Landroid/hardware/camera2/CameraManager;->openCamera(Ljava/lang/String;Landroid/hardware/camera2/CameraDevice$StateCallback;Landroid/os/Handler;)V
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catch_0
    move-exception p0

    .line 27
    new-instance p1, Llo;

    .line 28
    .line 29
    invoke-direct {p1, p0}, Llo;-><init>(Landroid/hardware/camera2/CameraAccessException;)V

    .line 30
    .line 31
    .line 32
    throw p1
.end method

.method public F(Landroid/content/Intent;)Lcom/google/android/gms/tasks/Task;
    .locals 6

    .line 1
    const-string v0, "gcm.rawData64"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    const-string v3, "rawData"

    .line 11
    .line 12
    invoke-static {v1, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {p1, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lcb;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Landroid/content/Context;

    .line 25
    .line 26
    iget-object p0, p0, Lcb;->c:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, Lqd1;

    .line 29
    .line 30
    invoke-static {}, Lj13;->l()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const/4 v3, 0x1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget v1, v1, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 42
    .line 43
    const/16 v4, 0x1a

    .line 44
    .line 45
    if-lt v1, v4, :cond_1

    .line 46
    .line 47
    move v1, v3

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    move v1, v2

    .line 50
    :goto_0
    invoke-virtual {p1}, Landroid/content/Intent;->getFlags()I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    const/high16 v5, 0x10000000

    .line 55
    .line 56
    and-int/2addr v4, v5

    .line 57
    if-eqz v4, :cond_2

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    move v3, v2

    .line 61
    :goto_1
    if-eqz v1, :cond_3

    .line 62
    .line 63
    if-nez v3, :cond_3

    .line 64
    .line 65
    invoke-static {v0, p1, v3}, Lcb;->k(Landroid/content/Context;Landroid/content/Intent;Z)Lcom/google/android/gms/tasks/Task;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0

    .line 70
    :cond_3
    new-instance v1, Lbh0;

    .line 71
    .line 72
    invoke-direct {v1, v2, v0, p1}, Lbh0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-static {p0, v1}, Lcom/google/android/gms/tasks/Tasks;->call(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    new-instance v2, Lch0;

    .line 80
    .line 81
    invoke-direct {v2, v0, p1, v3}, Lch0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, p0, v2}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0
.end method

.method public G(Ly92;Lsn;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcb;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lgq;

    .line 4
    .line 5
    iget-object v1, v0, Lgq;->a:Ljava/util/HashMap;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    iget-object v2, v0, Lgq;->a:Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-virtual {v2, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Lbq;

    .line 15
    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    new-instance v2, Lbq;

    .line 19
    .line 20
    invoke-direct {v2, p1, p2}, Lbq;-><init>(Ly92;Lsn;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, v0, Lgq;->a:Ljava/util/HashMap;

    .line 24
    .line 25
    invoke-virtual {p1, p2, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    iget-object p0, p0, Lcb;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, Landroid/hardware/camera2/CameraManager;

    .line 35
    .line 36
    iget-object p1, v0, Lgq;->b:Landroid/os/Handler;

    .line 37
    .line 38
    invoke-virtual {p0, v2, p1}, Landroid/hardware/camera2/CameraManager;->registerAvailabilityCallback(Landroid/hardware/camera2/CameraManager$AvailabilityCallback;Landroid/os/Handler;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :goto_1
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    throw p0
.end method

.method public H(Z)V
    .locals 4

    .line 1
    iget-object p0, p0, Lcb;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lgr0;

    .line 4
    .line 5
    iget-object p0, p0, Lgr0;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lwc0;

    .line 8
    .line 9
    iget-object p0, p0, Lwc0;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lid0;

    .line 12
    .line 13
    iget-boolean v0, p0, Lid0;->c:Z

    .line 14
    .line 15
    if-eq v0, p1, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lid0;->b:Lhd0;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-static {}, Lsc0;->a()Lsc0;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v1, p0, Lid0;->b:Lhd0;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    const-string v2, "initCallback cannot be null"

    .line 31
    .line 32
    invoke-static {v1, v2}, Lde3;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object v2, v0, Lsc0;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-interface {v3}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 42
    .line 43
    .line 44
    :try_start_0
    iget-object v0, v0, Lsc0;->b:Lkd;

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Lkd;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catchall_0
    move-exception p0

    .line 58
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 63
    .line 64
    .line 65
    throw p0

    .line 66
    :cond_0
    :goto_0
    iput-boolean p1, p0, Lid0;->c:Z

    .line 67
    .line 68
    if-eqz p1, :cond_1

    .line 69
    .line 70
    iget-object p0, p0, Lid0;->a:Landroid/widget/EditText;

    .line 71
    .line 72
    invoke-static {}, Lsc0;->a()Lsc0;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p1}, Lsc0;->b()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    invoke-static {p0, p1}, Lid0;->a(Landroid/widget/EditText;I)V

    .line 81
    .line 82
    .line 83
    :cond_1
    return-void
.end method

.method public I(IIII)V
    .locals 2

    .line 1
    iget-object p0, p0, Lcb;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/cardview/widget/CardView;

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/cardview/widget/CardView;->d:Landroid/graphics/Rect;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Landroidx/cardview/widget/CardView;->c:Landroid/graphics/Rect;

    .line 11
    .line 12
    iget v1, v0, Landroid/graphics/Rect;->left:I

    .line 13
    .line 14
    add-int/2addr p1, v1

    .line 15
    iget v1, v0, Landroid/graphics/Rect;->top:I

    .line 16
    .line 17
    add-int/2addr p2, v1

    .line 18
    iget v1, v0, Landroid/graphics/Rect;->right:I

    .line 19
    .line 20
    add-int/2addr p3, v1

    .line 21
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 22
    .line 23
    add-int/2addr p4, v0

    .line 24
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/cardview/widget/CardView;->e(Landroidx/cardview/widget/CardView;IIII)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public J(Landroid/hardware/camera2/CaptureRequest;Ly92;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I
    .locals 1

    .line 1
    new-instance v0, Lhn;

    .line 2
    .line 3
    invoke-direct {v0, p2, p3}, Lhn;-><init>(Ly92;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lcb;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p2, Lcp;

    .line 9
    .line 10
    iget-object p0, p0, Lcb;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Landroid/hardware/camera2/CameraCaptureSession;

    .line 13
    .line 14
    iget-object p2, p2, Lcp;->a:Landroid/os/Handler;

    .line 15
    .line 16
    invoke-virtual {p0, p1, v0, p2}, Landroid/hardware/camera2/CameraCaptureSession;->setRepeatingRequest(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0
.end method

.method public declared-synchronized K()V
    .locals 6

    .line 1
    const-string v0, "Not starting poller, shouldPoll: "

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcb;->c:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Lnm;

    .line 7
    .line 8
    invoke-virtual {v1}, Lnm;->p()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    iget-object v2, p0, Lcb;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lnm;

    .line 15
    .line 16
    invoke-virtual {v2}, Lnm;->m()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v3, 0x0

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-string v0, "ConvPolr"

    .line 27
    .line 28
    const-string v1, "Starting poller."

    .line 29
    .line 30
    invoke-static {v0, v1, v3}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lcb;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Ljt1;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    iput-boolean v1, v0, Ljt1;->f:Z

    .line 39
    .line 40
    iget-boolean v2, v0, Ljt1;->e:Z

    .line 41
    .line 42
    if-nez v2, :cond_1

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljt1;->a(I)V

    .line 45
    .line 46
    .line 47
    const/4 v1, 0x1

    .line 48
    iput-boolean v1, v0, Ljt1;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    :cond_1
    monitor-exit p0

    .line 51
    return-void

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    goto :goto_1

    .line 54
    :cond_2
    :goto_0
    :try_start_1
    const-string v4, "ConvPolr"

    .line 55
    .line 56
    new-instance v5, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v0, ",  push synced: "

    .line 65
    .line 66
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-static {v4, v0, v3}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    .line 78
    .line 79
    monitor-exit p0

    .line 80
    return-void

    .line 81
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 82
    throw v0
.end method

.method public declared-synchronized L()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "ConvPolr"

    .line 3
    .line 4
    const-string v1, "Stopping poller."

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-static {v0, v1, v2}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcb;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Ljt1;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    iput-boolean v1, v0, Ljt1;->f:Z

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput-boolean v1, v0, Ljt1;->e:Z

    .line 19
    .line 20
    iget-object v1, v0, Ljt1;->c:Lub0;

    .line 21
    .line 22
    iget v2, v1, Lub0;->a:I

    .line 23
    .line 24
    iput v2, v1, Lub0;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    :try_start_1
    iget-object v0, v0, Ljt1;->b:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->getQueue()Ljava/util/concurrent/BlockingQueue;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-interface {v0}, Ljava/util/Collection;->clear()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catch_0
    move-exception v0

    .line 37
    :try_start_2
    const-string v1, "PolerCntlr"

    .line 38
    .line 39
    const-string v2, "Error in clearing the polling queue."

    .line 40
    .line 41
    invoke-static {v1, v2, v0}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 42
    .line 43
    .line 44
    :goto_0
    monitor-exit p0

    .line 45
    return-void

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 48
    throw v0
.end method

.method public M(Landroid/graphics/drawable/Drawable;Z)Landroid/graphics/drawable/Drawable;
    .locals 7

    .line 1
    instance-of v0, p1, Landroid/graphics/drawable/LayerDrawable;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_4

    .line 5
    .line 6
    check-cast p1, Landroid/graphics/drawable/LayerDrawable;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/graphics/drawable/LayerDrawable;->getNumberOfLayers()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    new-array v0, p2, [Landroid/graphics/drawable/Drawable;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    move v3, v2

    .line 16
    :goto_0
    if-ge v3, p2, :cond_2

    .line 17
    .line 18
    invoke-virtual {p1, v3}, Landroid/graphics/drawable/LayerDrawable;->getId(I)I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    invoke-virtual {p1, v3}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    const v6, 0x102000d

    .line 27
    .line 28
    .line 29
    if-eq v4, v6, :cond_1

    .line 30
    .line 31
    const v6, 0x102000f

    .line 32
    .line 33
    .line 34
    if-ne v4, v6, :cond_0

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    move v4, v2

    .line 38
    goto :goto_2

    .line 39
    :cond_1
    :goto_1
    move v4, v1

    .line 40
    :goto_2
    invoke-virtual {p0, v5, v4}, Lcb;->M(Landroid/graphics/drawable/Drawable;Z)Landroid/graphics/drawable/Drawable;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    aput-object v4, v0, v3

    .line 45
    .line 46
    add-int/lit8 v3, v3, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    new-instance p0, Landroid/graphics/drawable/LayerDrawable;

    .line 50
    .line 51
    invoke-direct {p0, v0}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 52
    .line 53
    .line 54
    :goto_3
    if-ge v2, p2, :cond_3

    .line 55
    .line 56
    invoke-virtual {p1, v2}, Landroid/graphics/drawable/LayerDrawable;->getId(I)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    invoke-virtual {p0, v2, v0}, Landroid/graphics/drawable/LayerDrawable;->setId(II)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v2}, Landroid/graphics/drawable/LayerDrawable;->getLayerGravity(I)I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    invoke-virtual {p0, v2, v0}, Landroid/graphics/drawable/LayerDrawable;->setLayerGravity(II)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v2}, Landroid/graphics/drawable/LayerDrawable;->getLayerWidth(I)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    invoke-virtual {p0, v2, v0}, Landroid/graphics/drawable/LayerDrawable;->setLayerWidth(II)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, v2}, Landroid/graphics/drawable/LayerDrawable;->getLayerHeight(I)I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    invoke-virtual {p0, v2, v0}, Landroid/graphics/drawable/LayerDrawable;->setLayerHeight(II)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, v2}, Landroid/graphics/drawable/LayerDrawable;->getLayerInsetLeft(I)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    invoke-virtual {p0, v2, v0}, Landroid/graphics/drawable/LayerDrawable;->setLayerInsetLeft(II)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, v2}, Landroid/graphics/drawable/LayerDrawable;->getLayerInsetRight(I)I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    invoke-virtual {p0, v2, v0}, Landroid/graphics/drawable/LayerDrawable;->setLayerInsetRight(II)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, v2}, Landroid/graphics/drawable/LayerDrawable;->getLayerInsetTop(I)I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    invoke-virtual {p0, v2, v0}, Landroid/graphics/drawable/LayerDrawable;->setLayerInsetTop(II)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, v2}, Landroid/graphics/drawable/LayerDrawable;->getLayerInsetBottom(I)I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    invoke-virtual {p0, v2, v0}, Landroid/graphics/drawable/LayerDrawable;->setLayerInsetBottom(II)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1, v2}, Landroid/graphics/drawable/LayerDrawable;->getLayerInsetStart(I)I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    invoke-virtual {p0, v2, v0}, Landroid/graphics/drawable/LayerDrawable;->setLayerInsetStart(II)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, v2}, Landroid/graphics/drawable/LayerDrawable;->getLayerInsetEnd(I)I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    invoke-virtual {p0, v2, v0}, Landroid/graphics/drawable/LayerDrawable;->setLayerInsetEnd(II)V

    .line 124
    .line 125
    .line 126
    add-int/lit8 v2, v2, 0x1

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_3
    return-object p0

    .line 130
    :cond_4
    instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 131
    .line 132
    if-eqz v0, :cond_7

    .line 133
    .line 134
    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 135
    .line 136
    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    iget-object v2, p0, Lcb;->c:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v2, Landroid/graphics/Bitmap;

    .line 143
    .line 144
    if-nez v2, :cond_5

    .line 145
    .line 146
    iput-object v0, p0, Lcb;->c:Ljava/lang/Object;

    .line 147
    .line 148
    :cond_5
    new-instance p0, Landroid/graphics/drawable/ShapeDrawable;

    .line 149
    .line 150
    const/16 v2, 0x8

    .line 151
    .line 152
    new-array v2, v2, [F

    .line 153
    .line 154
    fill-array-data v2, :array_0

    .line 155
    .line 156
    .line 157
    new-instance v3, Landroid/graphics/drawable/shapes/RoundRectShape;

    .line 158
    .line 159
    const/4 v4, 0x0

    .line 160
    invoke-direct {v3, v2, v4, v4}, Landroid/graphics/drawable/shapes/RoundRectShape;-><init>([FLandroid/graphics/RectF;[F)V

    .line 161
    .line 162
    .line 163
    invoke-direct {p0, v3}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    .line 164
    .line 165
    .line 166
    new-instance v2, Landroid/graphics/BitmapShader;

    .line 167
    .line 168
    sget-object v3, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    .line 169
    .line 170
    sget-object v4, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 171
    .line 172
    invoke-direct {v2, v0, v3, v4}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getPaint()Landroid/graphics/Paint;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    invoke-virtual {p1}, Landroid/graphics/Paint;->getColorFilter()Landroid/graphics/ColorFilter;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 195
    .line 196
    .line 197
    if-eqz p2, :cond_6

    .line 198
    .line 199
    new-instance p1, Landroid/graphics/drawable/ClipDrawable;

    .line 200
    .line 201
    const/4 p2, 0x3

    .line 202
    invoke-direct {p1, p0, p2, v1}, Landroid/graphics/drawable/ClipDrawable;-><init>(Landroid/graphics/drawable/Drawable;II)V

    .line 203
    .line 204
    .line 205
    return-object p1

    .line 206
    :cond_6
    return-object p0

    .line 207
    :cond_7
    return-object p1

    .line 208
    nop

    .line 209
    :array_0
    .array-data 4
        0x40a00000    # 5.0f
        0x40a00000    # 5.0f
        0x40a00000    # 5.0f
        0x40a00000    # 5.0f
        0x40a00000    # 5.0f
        0x40a00000    # 5.0f
        0x40a00000    # 5.0f
        0x40a00000    # 5.0f
    .end array-data
.end method

.method public N(Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcb;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lgq;

    .line 6
    .line 7
    iget-object v1, v0, Lgq;->a:Ljava/util/HashMap;

    .line 8
    .line 9
    monitor-enter v1

    .line 10
    :try_start_0
    iget-object v0, v0, Lgq;->a:Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lbq;

    .line 17
    .line 18
    monitor-exit v1

    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    throw p0

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    :goto_0
    if-eqz p1, :cond_1

    .line 25
    .line 26
    iget-object v0, p1, Lbq;->c:Ljava/lang/Object;

    .line 27
    .line 28
    monitor-enter v0

    .line 29
    const/4 v1, 0x1

    .line 30
    :try_start_1
    iput-boolean v1, p1, Lbq;->d:Z

    .line 31
    .line 32
    monitor-exit v0

    .line 33
    goto :goto_1

    .line 34
    :catchall_1
    move-exception p0

    .line 35
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 36
    throw p0

    .line 37
    :cond_1
    :goto_1
    iget-object p0, p0, Lcb;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p0, Landroid/hardware/camera2/CameraManager;

    .line 40
    .line 41
    invoke-virtual {p0, p1}, Landroid/hardware/camera2/CameraManager;->unregisterAvailabilityCallback(Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public a()Lnm2;
    .locals 0

    .line 1
    iget-object p0, p0, Lcb;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lnm2;

    .line 4
    .line 5
    return-object p0
.end method

.method public b()J
    .locals 2

    .line 1
    iget-object p0, p0, Lcb;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/hardware/camera2/CaptureResult;

    .line 4
    .line 5
    sget-object v0, Landroid/hardware/camera2/CaptureResult;->SENSOR_TIMESTAMP:Landroid/hardware/camera2/CaptureResult$Key;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ljava/lang/Long;

    .line 12
    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    const-wide/16 v0, -0x1

    .line 16
    .line 17
    return-wide v0

    .line 18
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    return-wide v0
.end method

.method public c(Lj2;Landroid/view/MenuItem;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcb;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Li2;

    .line 4
    .line 5
    invoke-interface {p0, p1, p2}, Li2;->c(Lj2;Landroid/view/MenuItem;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public d(Lj2;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcb;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li2;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Li2;->d(Lj2;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lcb;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Lwa;

    .line 11
    .line 12
    iget-object v0, p1, Lwa;->h0:Landroid/widget/PopupWindow;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p1, Lwa;->W:Landroid/view/Window;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v1, p1, Lwa;->i0:Lja;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-object v0, p1, Lwa;->g0:Landroidx/appcompat/widget/ActionBarContextView;

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    iget-object v0, p1, Lwa;->j0:Lp43;

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    invoke-virtual {v0}, Lp43;->b()V

    .line 36
    .line 37
    .line 38
    :cond_1
    iget-object v0, p1, Lwa;->g0:Landroidx/appcompat/widget/ActionBarContextView;

    .line 39
    .line 40
    invoke-static {v0}, Le33;->a(Landroid/view/View;)Lp43;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const/4 v1, 0x0

    .line 45
    invoke-virtual {v0, v1}, Lp43;->a(F)V

    .line 46
    .line 47
    .line 48
    iput-object v0, p1, Lwa;->j0:Lp43;

    .line 49
    .line 50
    new-instance v1, Lla;

    .line 51
    .line 52
    const/4 v2, 0x2

    .line 53
    invoke-direct {v1, p0, v2}, Lla;-><init>(Ljava/lang/Object;I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Lp43;->d(Lr43;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    iget-object p0, p1, Lwa;->Y:Lca;

    .line 60
    .line 61
    iget-object v0, p1, Lwa;->f0:Lj2;

    .line 62
    .line 63
    invoke-interface {p0, v0}, Lca;->onSupportActionModeFinished(Lj2;)V

    .line 64
    .line 65
    .line 66
    const/4 p0, 0x0

    .line 67
    iput-object p0, p1, Lwa;->f0:Lj2;

    .line 68
    .line 69
    iget-object p0, p1, Lwa;->l0:Landroid/view/ViewGroup;

    .line 70
    .line 71
    sget-object v0, Le33;->a:Ljava/util/WeakHashMap;

    .line 72
    .line 73
    invoke-static {p0}, Lq23;->c(Landroid/view/View;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Lwa;->I()V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public e()Lro;
    .locals 3

    .line 1
    iget-object p0, p0, Lcb;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/hardware/camera2/CaptureResult;

    .line 4
    .line 5
    sget-object v0, Landroid/hardware/camera2/CaptureResult;->CONTROL_AWB_STATE:Landroid/hardware/camera2/CaptureResult$Key;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ljava/lang/Integer;

    .line 12
    .line 13
    sget-object v0, Lro;->a:Lro;

    .line 14
    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_4

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    if-eq v1, v2, :cond_3

    .line 26
    .line 27
    const/4 v2, 0x2

    .line 28
    if-eq v1, v2, :cond_2

    .line 29
    .line 30
    const/4 v2, 0x3

    .line 31
    if-eq v1, v2, :cond_1

    .line 32
    .line 33
    new-instance v1, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v2, "Undefined awb state: "

    .line 36
    .line 37
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    const-string v1, "C2CameraCaptureResult"

    .line 48
    .line 49
    invoke-static {v1, p0}, Lhu0;->T(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v0

    .line 53
    :cond_1
    sget-object p0, Lro;->e:Lro;

    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_2
    sget-object p0, Lro;->d:Lro;

    .line 57
    .line 58
    return-object p0

    .line 59
    :cond_3
    sget-object p0, Lro;->c:Lro;

    .line 60
    .line 61
    return-object p0

    .line 62
    :cond_4
    sget-object p0, Lro;->b:Lro;

    .line 63
    .line 64
    return-object p0
.end method

.method public f(Lj2;Landroid/view/Menu;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcb;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Li2;

    .line 4
    .line 5
    invoke-interface {p0, p1, p2}, Li2;->f(Lj2;Landroid/view/Menu;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public g()Lpo;
    .locals 3

    .line 1
    iget-object p0, p0, Lcb;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/hardware/camera2/CaptureResult;

    .line 4
    .line 5
    sget-object v0, Landroid/hardware/camera2/CaptureResult;->CONTROL_AE_STATE:Landroid/hardware/camera2/CaptureResult$Key;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ljava/lang/Integer;

    .line 12
    .line 13
    sget-object v0, Lpo;->a:Lpo;

    .line 14
    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_5

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    if-eq v1, v2, :cond_4

    .line 26
    .line 27
    const/4 v2, 0x2

    .line 28
    if-eq v1, v2, :cond_3

    .line 29
    .line 30
    const/4 v2, 0x3

    .line 31
    if-eq v1, v2, :cond_2

    .line 32
    .line 33
    const/4 v2, 0x4

    .line 34
    if-eq v1, v2, :cond_1

    .line 35
    .line 36
    const/4 v2, 0x5

    .line 37
    if-eq v1, v2, :cond_4

    .line 38
    .line 39
    new-instance v1, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v2, "Undefined ae state: "

    .line 42
    .line 43
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    const-string v1, "C2CameraCaptureResult"

    .line 54
    .line 55
    invoke-static {v1, p0}, Lhu0;->T(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object v0

    .line 59
    :cond_1
    sget-object p0, Lpo;->d:Lpo;

    .line 60
    .line 61
    return-object p0

    .line 62
    :cond_2
    sget-object p0, Lpo;->f:Lpo;

    .line 63
    .line 64
    return-object p0

    .line 65
    :cond_3
    sget-object p0, Lpo;->e:Lpo;

    .line 66
    .line 67
    return-object p0

    .line 68
    :cond_4
    sget-object p0, Lpo;->c:Lpo;

    .line 69
    .line 70
    return-object p0

    .line 71
    :cond_5
    sget-object p0, Lpo;->b:Lpo;

    .line 72
    .line 73
    return-object p0
.end method

.method public h(Lj2;Landroid/view/Menu;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcb;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lwa;

    .line 4
    .line 5
    iget-object v0, v0, Lwa;->l0:Landroid/view/ViewGroup;

    .line 6
    .line 7
    sget-object v1, Le33;->a:Ljava/util/WeakHashMap;

    .line 8
    .line 9
    invoke-static {v0}, Lq23;->c(Landroid/view/View;)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lcb;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Li2;

    .line 15
    .line 16
    invoke-interface {p0, p1, p2}, Li2;->h(Lj2;Landroid/view/Menu;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0
.end method

.method public i()Landroid/hardware/camera2/CaptureResult;
    .locals 0

    .line 1
    iget-object p0, p0, Lcb;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/hardware/camera2/CaptureResult;

    .line 4
    .line 5
    return-object p0
.end method

.method public j()Lqo;
    .locals 3

    .line 1
    iget-object p0, p0, Lcb;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/hardware/camera2/CaptureResult;

    .line 4
    .line 5
    sget-object v0, Landroid/hardware/camera2/CaptureResult;->CONTROL_AF_STATE:Landroid/hardware/camera2/CaptureResult$Key;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ljava/lang/Integer;

    .line 12
    .line 13
    sget-object v0, Lqo;->a:Lqo;

    .line 14
    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    packed-switch v1, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    new-instance v1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v2, "Undefined af state: "

    .line 28
    .line 29
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    const-string v1, "C2CameraCaptureResult"

    .line 40
    .line 41
    invoke-static {v1, p0}, Lhu0;->T(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v0

    .line 45
    :pswitch_0
    sget-object p0, Lqo;->e:Lqo;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_1
    sget-object p0, Lqo;->i:Lqo;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_2
    sget-object p0, Lqo;->f:Lqo;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_3
    sget-object p0, Lqo;->d:Lqo;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_4
    sget-object p0, Lqo;->c:Lqo;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_5
    sget-object p0, Lqo;->b:Lqo;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public l()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcb;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lec;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v1, v0, Lec;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 13
    .line 14
    .line 15
    iget-object v0, v0, Lec;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ljava/util/concurrent/ScheduledFuture;

    .line 18
    .line 19
    invoke-interface {v0, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 20
    .line 21
    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    iput-object v0, p0, Lcb;->b:Ljava/lang/Object;

    .line 24
    .line 25
    return-void
.end method

.method public loadForRequest(Lokhttp3/HttpUrl;)Ljava/util/List;
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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
    new-instance v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, Lcb;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Ljava/util/Set;

    .line 17
    .line 18
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_2

    .line 27
    .line 28
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    check-cast v4, Lxw;

    .line 33
    .line 34
    iget-object v5, v4, Lxw;->a:Lokhttp3/Cookie;

    .line 35
    .line 36
    iget-object v6, v4, Lxw;->a:Lokhttp3/Cookie;

    .line 37
    .line 38
    invoke-virtual {v5}, Lokhttp3/Cookie;->expiresAt()J

    .line 39
    .line 40
    .line 41
    move-result-wide v7

    .line 42
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 43
    .line 44
    .line 45
    move-result-wide v9

    .line 46
    cmp-long v5, v7, v9

    .line 47
    .line 48
    if-gez v5, :cond_1

    .line 49
    .line 50
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-virtual {v6, p1}, Lokhttp3/Cookie;->matches(Lokhttp3/HttpUrl;)Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-eqz v4, :cond_0

    .line 59
    .line 60
    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-nez p1, :cond_4

    .line 69
    .line 70
    iget-object p0, p0, Lcb;->c:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p0, Landroid/content/SharedPreferences;

    .line 73
    .line 74
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_3

    .line 87
    .line 88
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, Lxw;

    .line 93
    .line 94
    invoke-interface {v2, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Lxw;->a()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-interface {p0, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_3
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 106
    .line 107
    .line 108
    :cond_4
    return-object v1
.end method

.method public m(Ljava/util/ArrayList;Ly92;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I
    .locals 1

    .line 1
    new-instance v0, Lhn;

    .line 2
    .line 3
    invoke-direct {v0, p2, p3}, Lhn;-><init>(Ly92;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lcb;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p2, Lcp;

    .line 9
    .line 10
    iget-object p0, p0, Lcb;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Landroid/hardware/camera2/CameraCaptureSession;

    .line 13
    .line 14
    iget-object p2, p2, Lcp;->a:Landroid/os/Handler;

    .line 15
    .line 16
    invoke-virtual {p0, p1, v0, p2}, Landroid/hardware/camera2/CameraCaptureSession;->captureBurst(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0
.end method

.method public n(Lkb2;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcb;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/hardware/camera2/CameraDevice;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object p1, p1, Lkb2;->a:Ljb2;

    .line 9
    .line 10
    invoke-interface {p1}, Ljb2;->e()Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-interface {p1}, Ljb2;->f()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-eqz v1, :cond_6

    .line 22
    .line 23
    invoke-interface {p1}, Ljb2;->c()Ljava/util/concurrent/Executor;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    if-eqz v2, :cond_5

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Loq1;

    .line 48
    .line 49
    iget-object v3, v3, Loq1;->a:Lqq1;

    .line 50
    .line 51
    invoke-virtual {v3}, Lqq1;->d()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    if-eqz v3, :cond_0

    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-nez v4, :cond_0

    .line 62
    .line 63
    const-string v4, ": Camera doesn\'t support physicalCameraId "

    .line 64
    .line 65
    const-string v5, ". Ignoring."

    .line 66
    .line 67
    const-string v6, "Camera "

    .line 68
    .line 69
    invoke-static {v6, v2, v4, v3, v5}, Lfm0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    const-string v4, "CameraDeviceCompat"

    .line 74
    .line 75
    invoke-static {v4, v3}, Lhu0;->H0(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    new-instance v1, Lap;

    .line 80
    .line 81
    invoke-interface {p1}, Ljb2;->c()Ljava/util/concurrent/Executor;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-interface {p1}, Ljb2;->e()Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-direct {v1, v2, v3}, Lap;-><init>(Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)V

    .line 90
    .line 91
    .line 92
    invoke-interface {p1}, Ljb2;->f()Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    iget-object p0, p0, Lcb;->c:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast p0, Lqp;

    .line 99
    .line 100
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    iget-object p0, p0, Lqp;->a:Landroid/os/Handler;

    .line 104
    .line 105
    invoke-interface {p1}, Ljb2;->b()Lby0;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    if-eqz v3, :cond_2

    .line 110
    .line 111
    :try_start_0
    iget-object p1, v3, Lby0;->a:Lzx0;

    .line 112
    .line 113
    iget-object p1, p1, Lzx0;->a:Landroid/hardware/camera2/params/InputConfiguration;

    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-static {v2}, Lkb2;->a(Ljava/util/List;)Ljava/util/ArrayList;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-virtual {v0, p1, v2, v1, p0}, Landroid/hardware/camera2/CameraDevice;->createReprocessableCaptureSessionByConfigurations(Landroid/hardware/camera2/params/InputConfiguration;Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/os/Handler;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :cond_2
    invoke-interface {p1}, Ljb2;->d()I

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    const/4 v3, 0x1

    .line 131
    if-ne p1, v3, :cond_4

    .line 132
    .line 133
    new-instance p1, Ljava/util/ArrayList;

    .line 134
    .line 135
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    invoke-direct {p1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 140
    .line 141
    .line 142
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    if-eqz v3, :cond_3

    .line 151
    .line 152
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    check-cast v3, Loq1;

    .line 157
    .line 158
    iget-object v3, v3, Loq1;->a:Lqq1;

    .line 159
    .line 160
    invoke-virtual {v3}, Lqq1;->c()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    check-cast v3, Landroid/hardware/camera2/params/OutputConfiguration;

    .line 165
    .line 166
    invoke-virtual {v3}, Landroid/hardware/camera2/params/OutputConfiguration;->getSurface()Landroid/view/Surface;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_3
    invoke-virtual {v0, p1, v1, p0}, Landroid/hardware/camera2/CameraDevice;->createConstrainedHighSpeedCaptureSession(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/os/Handler;)V

    .line 175
    .line 176
    .line 177
    return-void

    .line 178
    :cond_4
    invoke-static {v2}, Lkb2;->a(Ljava/util/List;)Ljava/util/ArrayList;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-virtual {v0, p1, v1, p0}, Landroid/hardware/camera2/CameraDevice;->createCaptureSessionByOutputConfigurations(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/os/Handler;)V
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 183
    .line 184
    .line 185
    return-void

    .line 186
    :catch_0
    move-exception p0

    .line 187
    new-instance p1, Llo;

    .line 188
    .line 189
    invoke-direct {p1, p0}, Llo;-><init>(Landroid/hardware/camera2/CameraAccessException;)V

    .line 190
    .line 191
    .line 192
    throw p1

    .line 193
    :cond_5
    const-string p0, "Invalid executor"

    .line 194
    .line 195
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    return-void

    .line 199
    :cond_6
    const-string p0, "Invalid output configurations"

    .line 200
    .line 201
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    return-void
.end method

.method public o()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object p0, p0, Lcb;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/content/Context;

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {v0, p0}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    goto :goto_0

    .line 22
    :catch_0
    move-exception p0

    .line 23
    const-string v0, "Device"

    .line 24
    .line 25
    const-string v1, "Error getting application name"

    .line 26
    .line 27
    invoke-static {v0, v1, p0}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    :goto_0
    if-nez p0, :cond_0

    .line 32
    .line 33
    const-string p0, "Support"

    .line 34
    .line 35
    :cond_0
    return-object p0
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lcb;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Llj2;

    .line 4
    .line 5
    iget p0, p0, Llj2;->f:I

    .line 6
    .line 7
    const/4 v0, 0x2

    .line 8
    const-string v1, "DualSurfaceProcessorNode"

    .line 9
    .line 10
    if-ne p0, v0, :cond_0

    .line 11
    .line 12
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-static {v1}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-static {p0}, Lhu0;->c0(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const-string v0, "Downstream node failed to provide Surface. Target: "

    .line 25
    .line 26
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {v1, p0, p1}, Lhu0;->I0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, Lmj2;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcb;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lb5;

    .line 9
    .line 10
    iget-object p0, p0, Lb5;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lcb0;

    .line 13
    .line 14
    iget-object v0, p0, Lcb0;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p1}, Lmj2;->close()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v0, Lj8;

    .line 27
    .line 28
    const/16 v1, 0x14

    .line 29
    .line 30
    invoke-direct {v0, v1, p0, p1}, Lj8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    new-instance v1, Ls2;

    .line 37
    .line 38
    const/16 v2, 0xe

    .line 39
    .line 40
    invoke-direct {v1, p1, v2}, Ls2;-><init>(Ljava/lang/Object;I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v0, v1}, Lcb0;->b(Ljava/lang/Runnable;Ljava/lang/Runnable;)V

    .line 44
    .line 45
    .line 46
    :goto_0
    return-void
.end method

.method public p()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object p0, p0, Lcb;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/content/Context;

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {p0, v0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    iget-object p0, p0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    return-object p0

    .line 21
    :catch_0
    move-exception p0

    .line 22
    const-string v0, "Device"

    .line 23
    .line 24
    const-string v1, "Error getting app version"

    .line 25
    .line 26
    invoke-static {v0, v1, p0}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    return-object p0
.end method

.method public q()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Landroid/content/IntentFilter;

    .line 2
    .line 3
    const-string v1, "android.intent.action.BATTERY_CHANGED"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lcb;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Landroid/content/Context;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    const-string p0, ""

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    const-string v0, "level"

    .line 23
    .line 24
    const/4 v1, -0x1

    .line 25
    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const-string v2, "scale"

    .line 30
    .line 31
    invoke-virtual {p0, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    int-to-float v0, v0

    .line 36
    int-to-float p0, p0

    .line 37
    div-float/2addr v0, p0

    .line 38
    const/high16 p0, 0x42c80000    # 100.0f

    .line 39
    .line 40
    mul-float/2addr v0, p0

    .line 41
    float-to-int p0, v0

    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string p0, "%"

    .line 51
    .line 52
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0
.end method

.method public r()Lsj;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcb;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lsj;

    .line 6
    .line 7
    if-nez v1, :cond_2b

    .line 8
    .line 9
    iget-object v1, v0, Lcb;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Lra2;

    .line 12
    .line 13
    iget-object v2, v1, Lra2;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, Lsj;

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    goto/16 :goto_17

    .line 20
    .line 21
    :cond_0
    iget-object v2, v1, Lra2;->a:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Lva1;

    .line 24
    .line 25
    iget v3, v2, Lva1;->a:I

    .line 26
    .line 27
    iget v4, v2, Lva1;->b:I

    .line 28
    .line 29
    const/16 v5, 0x28

    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    const/4 v8, 0x1

    .line 33
    if-lt v3, v5, :cond_1a

    .line 34
    .line 35
    if-lt v4, v5, :cond_1a

    .line 36
    .line 37
    invoke-virtual {v2}, Lva1;->a()[B

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    shr-int/lit8 v5, v3, 0x3

    .line 42
    .line 43
    and-int/lit8 v9, v3, 0x7

    .line 44
    .line 45
    if-eqz v9, :cond_1

    .line 46
    .line 47
    add-int/lit8 v5, v5, 0x1

    .line 48
    .line 49
    :cond_1
    shr-int/lit8 v9, v4, 0x3

    .line 50
    .line 51
    and-int/lit8 v10, v4, 0x7

    .line 52
    .line 53
    if-eqz v10, :cond_2

    .line 54
    .line 55
    add-int/lit8 v9, v9, 0x1

    .line 56
    .line 57
    :cond_2
    add-int/lit8 v10, v4, -0x8

    .line 58
    .line 59
    add-int/lit8 v11, v3, -0x8

    .line 60
    .line 61
    const/4 v12, 0x2

    .line 62
    new-array v13, v12, [I

    .line 63
    .line 64
    aput v5, v13, v8

    .line 65
    .line 66
    aput v9, v13, v6

    .line 67
    .line 68
    sget-object v14, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 69
    .line 70
    invoke-static {v14, v13}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v13

    .line 74
    check-cast v13, [[I

    .line 75
    .line 76
    move v14, v6

    .line 77
    :goto_0
    const/16 v15, 0x8

    .line 78
    .line 79
    if-ge v14, v9, :cond_d

    .line 80
    .line 81
    move/from16 v16, v6

    .line 82
    .line 83
    shl-int/lit8 v6, v14, 0x3

    .line 84
    .line 85
    if-le v6, v10, :cond_3

    .line 86
    .line 87
    move v6, v10

    .line 88
    :cond_3
    move/from16 v17, v8

    .line 89
    .line 90
    move/from16 v8, v16

    .line 91
    .line 92
    :goto_1
    if-ge v8, v5, :cond_c

    .line 93
    .line 94
    move/from16 v18, v12

    .line 95
    .line 96
    shl-int/lit8 v12, v8, 0x3

    .line 97
    .line 98
    if-le v12, v11, :cond_4

    .line 99
    .line 100
    move v12, v11

    .line 101
    :cond_4
    mul-int v19, v6, v3

    .line 102
    .line 103
    add-int v19, v19, v12

    .line 104
    .line 105
    move/from16 v12, v16

    .line 106
    .line 107
    move/from16 v20, v12

    .line 108
    .line 109
    move/from16 v21, v20

    .line 110
    .line 111
    const/16 v22, 0xff

    .line 112
    .line 113
    :goto_2
    if-ge v12, v15, :cond_a

    .line 114
    .line 115
    move-object/from16 v23, v2

    .line 116
    .line 117
    move/from16 v24, v6

    .line 118
    .line 119
    move/from16 v6, v16

    .line 120
    .line 121
    move/from16 v7, v21

    .line 122
    .line 123
    move/from16 v2, v22

    .line 124
    .line 125
    :goto_3
    if-ge v6, v15, :cond_7

    .line 126
    .line 127
    add-int v21, v19, v6

    .line 128
    .line 129
    aget-byte v15, v23, v21

    .line 130
    .line 131
    move/from16 v21, v6

    .line 132
    .line 133
    const/16 v6, 0xff

    .line 134
    .line 135
    and-int/2addr v15, v6

    .line 136
    add-int v20, v20, v15

    .line 137
    .line 138
    if-ge v15, v2, :cond_5

    .line 139
    .line 140
    move v2, v15

    .line 141
    :cond_5
    if-le v15, v7, :cond_6

    .line 142
    .line 143
    move v7, v15

    .line 144
    :cond_6
    add-int/lit8 v6, v21, 0x1

    .line 145
    .line 146
    const/16 v15, 0x8

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_7
    sub-int v6, v7, v2

    .line 150
    .line 151
    const/16 v15, 0x18

    .line 152
    .line 153
    if-le v6, v15, :cond_9

    .line 154
    .line 155
    :goto_4
    add-int/lit8 v12, v12, 0x1

    .line 156
    .line 157
    add-int v19, v19, v3

    .line 158
    .line 159
    const/16 v6, 0x8

    .line 160
    .line 161
    if-ge v12, v6, :cond_9

    .line 162
    .line 163
    move/from16 v15, v16

    .line 164
    .line 165
    :goto_5
    if-ge v15, v6, :cond_8

    .line 166
    .line 167
    add-int v6, v19, v15

    .line 168
    .line 169
    aget-byte v6, v23, v6

    .line 170
    .line 171
    move/from16 v21, v2

    .line 172
    .line 173
    const/16 v2, 0xff

    .line 174
    .line 175
    and-int/2addr v6, v2

    .line 176
    add-int v20, v20, v6

    .line 177
    .line 178
    add-int/lit8 v15, v15, 0x1

    .line 179
    .line 180
    move/from16 v2, v21

    .line 181
    .line 182
    const/16 v6, 0x8

    .line 183
    .line 184
    goto :goto_5

    .line 185
    :cond_8
    move/from16 v21, v2

    .line 186
    .line 187
    goto :goto_4

    .line 188
    :cond_9
    move/from16 v21, v2

    .line 189
    .line 190
    add-int/lit8 v12, v12, 0x1

    .line 191
    .line 192
    add-int v19, v19, v3

    .line 193
    .line 194
    move/from16 v22, v21

    .line 195
    .line 196
    move-object/from16 v2, v23

    .line 197
    .line 198
    move/from16 v6, v24

    .line 199
    .line 200
    const/16 v15, 0x8

    .line 201
    .line 202
    move/from16 v21, v7

    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_a
    move-object/from16 v23, v2

    .line 206
    .line 207
    move/from16 v24, v6

    .line 208
    .line 209
    shr-int/lit8 v2, v20, 0x6

    .line 210
    .line 211
    move/from16 v7, v22

    .line 212
    .line 213
    sub-int v6, v21, v7

    .line 214
    .line 215
    const/16 v15, 0x18

    .line 216
    .line 217
    if-gt v6, v15, :cond_b

    .line 218
    .line 219
    div-int/lit8 v2, v7, 0x2

    .line 220
    .line 221
    if-lez v14, :cond_b

    .line 222
    .line 223
    if-lez v8, :cond_b

    .line 224
    .line 225
    add-int/lit8 v6, v14, -0x1

    .line 226
    .line 227
    aget-object v6, v13, v6

    .line 228
    .line 229
    aget v12, v6, v8

    .line 230
    .line 231
    aget-object v15, v13, v14

    .line 232
    .line 233
    add-int/lit8 v19, v8, -0x1

    .line 234
    .line 235
    aget v15, v15, v19

    .line 236
    .line 237
    mul-int/lit8 v15, v15, 0x2

    .line 238
    .line 239
    add-int/2addr v15, v12

    .line 240
    aget v6, v6, v19

    .line 241
    .line 242
    add-int/2addr v15, v6

    .line 243
    div-int/lit8 v6, v15, 0x4

    .line 244
    .line 245
    if-ge v7, v6, :cond_b

    .line 246
    .line 247
    move v2, v6

    .line 248
    :cond_b
    aget-object v6, v13, v14

    .line 249
    .line 250
    aput v2, v6, v8

    .line 251
    .line 252
    add-int/lit8 v8, v8, 0x1

    .line 253
    .line 254
    move/from16 v12, v18

    .line 255
    .line 256
    move-object/from16 v2, v23

    .line 257
    .line 258
    move/from16 v6, v24

    .line 259
    .line 260
    const/16 v15, 0x8

    .line 261
    .line 262
    goto/16 :goto_1

    .line 263
    .line 264
    :cond_c
    move-object/from16 v23, v2

    .line 265
    .line 266
    move/from16 v18, v12

    .line 267
    .line 268
    add-int/lit8 v14, v14, 0x1

    .line 269
    .line 270
    move/from16 v6, v16

    .line 271
    .line 272
    move/from16 v8, v17

    .line 273
    .line 274
    goto/16 :goto_0

    .line 275
    .line 276
    :cond_d
    move-object/from16 v23, v2

    .line 277
    .line 278
    move/from16 v16, v6

    .line 279
    .line 280
    move/from16 v18, v12

    .line 281
    .line 282
    new-instance v2, Lsj;

    .line 283
    .line 284
    invoke-direct {v2, v3, v4}, Lsj;-><init>(II)V

    .line 285
    .line 286
    .line 287
    move/from16 v4, v16

    .line 288
    .line 289
    :goto_6
    if-ge v4, v9, :cond_19

    .line 290
    .line 291
    shl-int/lit8 v6, v4, 0x3

    .line 292
    .line 293
    if-le v6, v10, :cond_e

    .line 294
    .line 295
    move v6, v10

    .line 296
    :cond_e
    add-int/lit8 v7, v9, -0x3

    .line 297
    .line 298
    move/from16 v8, v18

    .line 299
    .line 300
    if-ge v4, v8, :cond_f

    .line 301
    .line 302
    const/4 v7, 0x2

    .line 303
    goto :goto_7

    .line 304
    :cond_f
    if-le v4, v7, :cond_10

    .line 305
    .line 306
    goto :goto_7

    .line 307
    :cond_10
    move v7, v4

    .line 308
    :goto_7
    move/from16 v8, v16

    .line 309
    .line 310
    :goto_8
    if-ge v8, v5, :cond_18

    .line 311
    .line 312
    shl-int/lit8 v12, v8, 0x3

    .line 313
    .line 314
    if-le v12, v11, :cond_11

    .line 315
    .line 316
    move v12, v11

    .line 317
    :cond_11
    add-int/lit8 v14, v5, -0x3

    .line 318
    .line 319
    const/4 v15, 0x2

    .line 320
    if-ge v8, v15, :cond_12

    .line 321
    .line 322
    move v14, v15

    .line 323
    goto :goto_9

    .line 324
    :cond_12
    if-le v8, v14, :cond_13

    .line 325
    .line 326
    goto :goto_9

    .line 327
    :cond_13
    move v14, v8

    .line 328
    :goto_9
    const/16 v17, -0x2

    .line 329
    .line 330
    move/from16 v19, v4

    .line 331
    .line 332
    move/from16 v4, v17

    .line 333
    .line 334
    move/from16 v17, v16

    .line 335
    .line 336
    :goto_a
    if-gt v4, v15, :cond_14

    .line 337
    .line 338
    add-int v15, v7, v4

    .line 339
    .line 340
    aget-object v15, v13, v15

    .line 341
    .line 342
    add-int/lit8 v20, v14, -0x2

    .line 343
    .line 344
    aget v20, v15, v20

    .line 345
    .line 346
    add-int/lit8 v21, v14, -0x1

    .line 347
    .line 348
    aget v21, v15, v21

    .line 349
    .line 350
    add-int v20, v20, v21

    .line 351
    .line 352
    aget v21, v15, v14

    .line 353
    .line 354
    add-int v20, v20, v21

    .line 355
    .line 356
    add-int/lit8 v21, v14, 0x1

    .line 357
    .line 358
    aget v21, v15, v21

    .line 359
    .line 360
    add-int v20, v20, v21

    .line 361
    .line 362
    const/16 v18, 0x2

    .line 363
    .line 364
    add-int/lit8 v21, v14, 0x2

    .line 365
    .line 366
    aget v15, v15, v21

    .line 367
    .line 368
    add-int v20, v20, v15

    .line 369
    .line 370
    add-int v17, v20, v17

    .line 371
    .line 372
    add-int/lit8 v4, v4, 0x1

    .line 373
    .line 374
    move/from16 v15, v18

    .line 375
    .line 376
    goto :goto_a

    .line 377
    :cond_14
    move/from16 v18, v15

    .line 378
    .line 379
    div-int/lit8 v4, v17, 0x19

    .line 380
    .line 381
    mul-int v14, v6, v3

    .line 382
    .line 383
    add-int/2addr v14, v12

    .line 384
    move/from16 v20, v5

    .line 385
    .line 386
    move/from16 v15, v16

    .line 387
    .line 388
    :goto_b
    const/16 v5, 0x8

    .line 389
    .line 390
    if-ge v15, v5, :cond_17

    .line 391
    .line 392
    move/from16 v17, v6

    .line 393
    .line 394
    move/from16 v6, v16

    .line 395
    .line 396
    :goto_c
    if-ge v6, v5, :cond_16

    .line 397
    .line 398
    add-int v21, v14, v6

    .line 399
    .line 400
    aget-byte v5, v23, v21

    .line 401
    .line 402
    move/from16 v21, v6

    .line 403
    .line 404
    const/16 v6, 0xff

    .line 405
    .line 406
    and-int/2addr v5, v6

    .line 407
    if-gt v5, v4, :cond_15

    .line 408
    .line 409
    add-int v6, v12, v21

    .line 410
    .line 411
    add-int v5, v17, v15

    .line 412
    .line 413
    invoke-virtual {v2, v6, v5}, Lsj;->c(II)V

    .line 414
    .line 415
    .line 416
    :cond_15
    add-int/lit8 v6, v21, 0x1

    .line 417
    .line 418
    const/16 v5, 0x8

    .line 419
    .line 420
    goto :goto_c

    .line 421
    :cond_16
    add-int/lit8 v15, v15, 0x1

    .line 422
    .line 423
    add-int/2addr v14, v3

    .line 424
    move/from16 v6, v17

    .line 425
    .line 426
    goto :goto_b

    .line 427
    :cond_17
    move/from16 v17, v6

    .line 428
    .line 429
    add-int/lit8 v8, v8, 0x1

    .line 430
    .line 431
    move/from16 v4, v19

    .line 432
    .line 433
    move/from16 v5, v20

    .line 434
    .line 435
    goto :goto_8

    .line 436
    :cond_18
    move/from16 v19, v4

    .line 437
    .line 438
    move/from16 v20, v5

    .line 439
    .line 440
    const/16 v18, 0x2

    .line 441
    .line 442
    add-int/lit8 v4, v19, 0x1

    .line 443
    .line 444
    goto/16 :goto_6

    .line 445
    .line 446
    :cond_19
    iput-object v2, v1, Lra2;->d:Ljava/lang/Object;

    .line 447
    .line 448
    goto/16 :goto_16

    .line 449
    .line 450
    :cond_1a
    move/from16 v16, v6

    .line 451
    .line 452
    move/from16 v17, v8

    .line 453
    .line 454
    new-instance v5, Lsj;

    .line 455
    .line 456
    invoke-direct {v5, v3, v4}, Lsj;-><init>(II)V

    .line 457
    .line 458
    .line 459
    iget-object v6, v1, Lra2;->b:Ljava/lang/Object;

    .line 460
    .line 461
    check-cast v6, [B

    .line 462
    .line 463
    array-length v6, v6

    .line 464
    if-ge v6, v3, :cond_1b

    .line 465
    .line 466
    new-array v6, v3, [B

    .line 467
    .line 468
    iput-object v6, v1, Lra2;->b:Ljava/lang/Object;

    .line 469
    .line 470
    :cond_1b
    move/from16 v6, v16

    .line 471
    .line 472
    :goto_d
    iget-object v7, v1, Lra2;->c:Ljava/lang/Object;

    .line 473
    .line 474
    check-cast v7, [I

    .line 475
    .line 476
    const/16 v8, 0x20

    .line 477
    .line 478
    if-ge v6, v8, :cond_1c

    .line 479
    .line 480
    aput v16, v7, v6

    .line 481
    .line 482
    add-int/lit8 v6, v6, 0x1

    .line 483
    .line 484
    goto :goto_d

    .line 485
    :cond_1c
    move/from16 v6, v17

    .line 486
    .line 487
    :goto_e
    const/4 v8, 0x5

    .line 488
    if-ge v6, v8, :cond_1e

    .line 489
    .line 490
    mul-int v9, v4, v6

    .line 491
    .line 492
    div-int/2addr v9, v8

    .line 493
    iget-object v10, v1, Lra2;->b:Ljava/lang/Object;

    .line 494
    .line 495
    check-cast v10, [B

    .line 496
    .line 497
    invoke-virtual {v2, v10, v9}, Lva1;->b([BI)[B

    .line 498
    .line 499
    .line 500
    move-result-object v9

    .line 501
    shl-int/lit8 v10, v3, 0x2

    .line 502
    .line 503
    div-int/2addr v10, v8

    .line 504
    div-int/lit8 v8, v3, 0x5

    .line 505
    .line 506
    :goto_f
    if-ge v8, v10, :cond_1d

    .line 507
    .line 508
    aget-byte v11, v9, v8

    .line 509
    .line 510
    const/16 v12, 0xff

    .line 511
    .line 512
    and-int/2addr v11, v12

    .line 513
    shr-int/lit8 v11, v11, 0x3

    .line 514
    .line 515
    aget v12, v7, v11

    .line 516
    .line 517
    add-int/lit8 v12, v12, 0x1

    .line 518
    .line 519
    aput v12, v7, v11

    .line 520
    .line 521
    add-int/lit8 v8, v8, 0x1

    .line 522
    .line 523
    goto :goto_f

    .line 524
    :cond_1d
    add-int/lit8 v6, v6, 0x1

    .line 525
    .line 526
    goto :goto_e

    .line 527
    :cond_1e
    array-length v6, v7

    .line 528
    move/from16 v8, v16

    .line 529
    .line 530
    move v9, v8

    .line 531
    move v10, v9

    .line 532
    move v11, v10

    .line 533
    :goto_10
    if-ge v8, v6, :cond_21

    .line 534
    .line 535
    aget v12, v7, v8

    .line 536
    .line 537
    if-le v12, v9, :cond_1f

    .line 538
    .line 539
    move v11, v8

    .line 540
    move v9, v12

    .line 541
    :cond_1f
    if-le v12, v10, :cond_20

    .line 542
    .line 543
    move v10, v12

    .line 544
    :cond_20
    add-int/lit8 v8, v8, 0x1

    .line 545
    .line 546
    goto :goto_10

    .line 547
    :cond_21
    move/from16 v8, v16

    .line 548
    .line 549
    move v9, v8

    .line 550
    move v12, v9

    .line 551
    :goto_11
    if-ge v8, v6, :cond_23

    .line 552
    .line 553
    sub-int v13, v8, v11

    .line 554
    .line 555
    aget v14, v7, v8

    .line 556
    .line 557
    mul-int/2addr v14, v13

    .line 558
    mul-int/2addr v14, v13

    .line 559
    if-le v14, v12, :cond_22

    .line 560
    .line 561
    move v9, v8

    .line 562
    move v12, v14

    .line 563
    :cond_22
    add-int/lit8 v8, v8, 0x1

    .line 564
    .line 565
    goto :goto_11

    .line 566
    :cond_23
    if-le v11, v9, :cond_24

    .line 567
    .line 568
    goto :goto_12

    .line 569
    :cond_24
    move/from16 v25, v11

    .line 570
    .line 571
    move v11, v9

    .line 572
    move/from16 v9, v25

    .line 573
    .line 574
    :goto_12
    sub-int v8, v11, v9

    .line 575
    .line 576
    div-int/lit8 v6, v6, 0x10

    .line 577
    .line 578
    if-le v8, v6, :cond_2a

    .line 579
    .line 580
    add-int/lit8 v6, v11, -0x1

    .line 581
    .line 582
    const/4 v8, -0x1

    .line 583
    move v12, v8

    .line 584
    move v8, v6

    .line 585
    :goto_13
    if-le v6, v9, :cond_26

    .line 586
    .line 587
    sub-int v13, v6, v9

    .line 588
    .line 589
    mul-int/2addr v13, v13

    .line 590
    sub-int v14, v11, v6

    .line 591
    .line 592
    mul-int/2addr v14, v13

    .line 593
    aget v13, v7, v6

    .line 594
    .line 595
    sub-int v13, v10, v13

    .line 596
    .line 597
    mul-int/2addr v13, v14

    .line 598
    if-le v13, v12, :cond_25

    .line 599
    .line 600
    move v8, v6

    .line 601
    move v12, v13

    .line 602
    :cond_25
    add-int/lit8 v6, v6, -0x1

    .line 603
    .line 604
    goto :goto_13

    .line 605
    :cond_26
    shl-int/lit8 v6, v8, 0x3

    .line 606
    .line 607
    invoke-virtual {v2}, Lva1;->a()[B

    .line 608
    .line 609
    .line 610
    move-result-object v2

    .line 611
    move/from16 v7, v16

    .line 612
    .line 613
    :goto_14
    if-ge v7, v4, :cond_29

    .line 614
    .line 615
    mul-int v8, v7, v3

    .line 616
    .line 617
    move/from16 v9, v16

    .line 618
    .line 619
    :goto_15
    if-ge v9, v3, :cond_28

    .line 620
    .line 621
    add-int v10, v8, v9

    .line 622
    .line 623
    aget-byte v10, v2, v10

    .line 624
    .line 625
    const/16 v12, 0xff

    .line 626
    .line 627
    and-int/2addr v10, v12

    .line 628
    if-ge v10, v6, :cond_27

    .line 629
    .line 630
    invoke-virtual {v5, v9, v7}, Lsj;->c(II)V

    .line 631
    .line 632
    .line 633
    :cond_27
    add-int/lit8 v9, v9, 0x1

    .line 634
    .line 635
    goto :goto_15

    .line 636
    :cond_28
    const/16 v12, 0xff

    .line 637
    .line 638
    add-int/lit8 v7, v7, 0x1

    .line 639
    .line 640
    goto :goto_14

    .line 641
    :cond_29
    iput-object v5, v1, Lra2;->d:Ljava/lang/Object;

    .line 642
    .line 643
    :goto_16
    iget-object v1, v1, Lra2;->d:Ljava/lang/Object;

    .line 644
    .line 645
    move-object v2, v1

    .line 646
    check-cast v2, Lsj;

    .line 647
    .line 648
    :goto_17
    iput-object v2, v0, Lcb;->c:Ljava/lang/Object;

    .line 649
    .line 650
    goto :goto_18

    .line 651
    :cond_2a
    sget-object v0, Lun1;->c:Lun1;

    .line 652
    .line 653
    throw v0

    .line 654
    :cond_2b
    :goto_18
    iget-object v0, v0, Lcb;->c:Ljava/lang/Object;

    .line 655
    .line 656
    check-cast v0, Lsj;

    .line 657
    .line 658
    return-object v0
.end method

.method public s(Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;
    .locals 0

    .line 1
    :try_start_0
    iget-object p0, p0, Lcb;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/hardware/camera2/CameraManager;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/hardware/camera2/CameraManager;->getCameraCharacteristics(Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;

    .line 6
    .line 7
    .line 8
    move-result-object p0
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-object p0

    .line 10
    :catch_0
    move-exception p0

    .line 11
    new-instance p1, Llo;

    .line 12
    .line 13
    invoke-direct {p1, p0}, Llo;-><init>(Landroid/hardware/camera2/CameraAccessException;)V

    .line 14
    .line 15
    .line 16
    throw p1
.end method

.method public saveFromResponse(Lokhttp3/HttpUrl;Ljava/util/List;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lcb;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Ljava/util/Set;

    .line 10
    .line 11
    iget-object p0, p0, Lcb;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Landroid/content/SharedPreferences;

    .line 14
    .line 15
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Lokhttp3/Cookie;

    .line 43
    .line 44
    new-instance v2, Lxw;

    .line 45
    .line 46
    invoke-direct {v2, v1}, Lxw;-><init>(Lokhttp3/Cookie;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_1

    .line 62
    .line 63
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    check-cast v0, Lxw;

    .line 68
    .line 69
    invoke-interface {p1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    invoke-interface {p1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Lxw;->a()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    new-instance v2, Ljava/util/HashMap;

    .line 80
    .line 81
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 82
    .line 83
    .line 84
    iget-object v0, v0, Lxw;->a:Lokhttp3/Cookie;

    .line 85
    .line 86
    invoke-virtual {v0}, Lokhttp3/Cookie;->name()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    const-string v4, "name"

    .line 91
    .line 92
    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    const-string v3, "value"

    .line 96
    .line 97
    invoke-virtual {v0}, Lokhttp3/Cookie;->value()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Lokhttp3/Cookie;->expiresAt()J

    .line 105
    .line 106
    .line 107
    move-result-wide v3

    .line 108
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    const-string v4, "expiresAt"

    .line 113
    .line 114
    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    const-string v3, "domain"

    .line 118
    .line 119
    invoke-virtual {v0}, Lokhttp3/Cookie;->domain()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    const-string v3, "path"

    .line 127
    .line 128
    invoke-virtual {v0}, Lokhttp3/Cookie;->path()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    new-instance v0, Lorg/json/JSONObject;

    .line 136
    .line 137
    invoke-direct {v0, v2}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    invoke-interface {p0, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 148
    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_1
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 152
    .line 153
    .line 154
    return-void
.end method

.method public t()Ljava/util/LinkedHashSet;
    .locals 2

    .line 1
    iget-object v0, p0, Lcb;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 5
    .line 6
    iget-object p0, p0, Lcb;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-direct {v1, p0}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 15
    .line 16
    .line 17
    monitor-exit v0

    .line 18
    return-object v1

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    throw p0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lcb;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    :try_start_0
    invoke-virtual {p0}, Lcb;->r()Lsj;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Lsj;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0
    :try_end_0
    .catch Lun1; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    goto :goto_0

    .line 20
    :catch_0
    const-string p0, ""

    .line 21
    .line 22
    :goto_0
    return-object p0

    .line 23
    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_0
    .end packed-switch
.end method

.method public u()Ljava/util/Set;
    .locals 0

    .line 1
    sget-object p0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 2
    .line 3
    return-object p0
.end method

.method public v()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object p0, p0, Lcb;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ler0;

    .line 4
    .line 5
    iget-object v0, p0, Ler0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ler0;

    .line 8
    .line 9
    const-string v1, "hs_did"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ler0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lb40;->p(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p0, v1, v0}, Ler0;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-object v0
.end method

.method public x(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;
    .locals 1

    .line 1
    instance-of v0, p1, Landroid/text/method/NumberKeyListener;

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    iget-object p0, p0, Lcb;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lgr0;

    .line 8
    .line 9
    iget-object p0, p0, Lgr0;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lwc0;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    instance-of p0, p1, Lcd0;

    .line 17
    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_0
    if-nez p1, :cond_1

    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return-object p0

    .line 25
    :cond_1
    instance-of p0, p1, Landroid/text/method/NumberKeyListener;

    .line 26
    .line 27
    if-eqz p0, :cond_2

    .line 28
    .line 29
    return-object p1

    .line 30
    :cond_2
    new-instance p0, Lcd0;

    .line 31
    .line 32
    invoke-direct {p0, p1}, Lcd0;-><init>(Landroid/text/method/KeyListener;)V

    .line 33
    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_3
    return-object p1
.end method

.method public y()Ljava/lang/String;
    .locals 2

    .line 1
    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    iget-object p0, p0, Lcb;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Landroid/content/Context;

    .line 10
    .line 11
    invoke-static {}, Ly0;->q()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, Ly0;->a(Ljava/lang/Object;)Landroid/app/LocaleManager;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p0}, Ly0;->j(Landroid/app/LocaleManager;)Landroid/os/LocaleList;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/os/LocaleList;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-virtual {p0, v0}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :cond_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :cond_1
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {p0}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 62
    return-object p0

    .line 63
    :catch_0
    move-exception p0

    .line 64
    const-string v0, "Device"

    .line 65
    .line 66
    const-string v1, "Error getting app language"

    .line 67
    .line 68
    invoke-static {v0, v1, p0}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    const-string p0, "unknown"

    .line 72
    .line 73
    return-object p0
.end method

.method public z(Lln;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcb;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 8
    .line 9
    iget-object v2, p1, Lln;->f:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v1, v2}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Ljava/lang/String;

    .line 29
    .line 30
    const-string v3, "CameraRepository"

    .line 31
    .line 32
    invoke-static {v3}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    iget-object v3, p0, Lcb;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v3, Ljava/util/LinkedHashMap;

    .line 38
    .line 39
    invoke-virtual {p1, v2}, Lln;->a(Ljava/lang/String;)Lxn;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-interface {v3, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lmq; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p0

    .line 48
    goto :goto_2

    .line 49
    :catch_0
    move-exception p0

    .line 50
    goto :goto_1

    .line 51
    :cond_0
    :try_start_1
    monitor-exit v0

    .line 52
    return-void

    .line 53
    :goto_1
    new-instance p1, Lux0;

    .line 54
    .line 55
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :goto_2
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 60
    throw p0
.end method
