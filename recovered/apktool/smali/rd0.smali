.class public final Lrd0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final c:[Ljava/lang/String;

.field public static final d:[Ljava/lang/String;

.field public static final e:[Ljava/lang/String;

.field public static final f:[Ljava/lang/String;

.field public static final g:[Ljava/lang/String;

.field public static final h:[Ljava/lang/String;

.field public static final i:[Ljava/lang/String;

.field public static final j:[Lru1;

.field public static k:Lrd0;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 17

    .line 1
    const-string v0, "/system/priv-app/com.bluestacks.settings"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lrd0;->c:[Ljava/lang/String;

    .line 8
    .line 9
    const-string v0, "/dev/socket/genyd"

    .line 10
    .line 11
    const-string v1, "/dev/socket/baseband_genyd"

    .line 12
    .line 13
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lrd0;->d:[Ljava/lang/String;

    .line 18
    .line 19
    const-string v0, "goldfish"

    .line 20
    .line 21
    filled-new-array {v0}, [Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    sput-object v1, Lrd0;->e:[Ljava/lang/String;

    .line 26
    .line 27
    const-string v1, "/dev/socket/qemud"

    .line 28
    .line 29
    const-string v2, "/dev/qemu_pipe"

    .line 30
    .line 31
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    sput-object v1, Lrd0;->f:[Ljava/lang/String;

    .line 36
    .line 37
    const-string v8, "init.vbox86.rc"

    .line 38
    .line 39
    const-string v9, "ueventd.vbox86.rc"

    .line 40
    .line 41
    const-string v2, "ueventd.android_x86.rc"

    .line 42
    .line 43
    const-string v3, "x86.prop"

    .line 44
    .line 45
    const-string v4, "ueventd.ttVM_x86.rc"

    .line 46
    .line 47
    const-string v5, "init.ttVM_x86.rc"

    .line 48
    .line 49
    const-string v6, "fstab.ttVM_x86"

    .line 50
    .line 51
    const-string v7, "fstab.vbox86"

    .line 52
    .line 53
    filled-new-array/range {v2 .. v9}, [Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    sput-object v1, Lrd0;->g:[Ljava/lang/String;

    .line 58
    .line 59
    const-string v1, "fstab.andy"

    .line 60
    .line 61
    const-string v2, "ueventd.andy.rc"

    .line 62
    .line 63
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    sput-object v1, Lrd0;->h:[Ljava/lang/String;

    .line 68
    .line 69
    const-string v6, "/system/bin/noxd"

    .line 70
    .line 71
    const-string v7, "/system/bin/nox-vbox-sf"

    .line 72
    .line 73
    const-string v2, "fstab.nox"

    .line 74
    .line 75
    const-string v3, "init.nox.rc"

    .line 76
    .line 77
    const-string v4, "ueventd.nox.rc"

    .line 78
    .line 79
    const-string v5, "/system/bin/nox-prop"

    .line 80
    .line 81
    filled-new-array/range {v2 .. v7}, [Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    sput-object v1, Lrd0;->i:[Ljava/lang/String;

    .line 86
    .line 87
    new-instance v2, Lru1;

    .line 88
    .line 89
    const/4 v1, 0x1

    .line 90
    const-string v3, "init.svc.qemud"

    .line 91
    .line 92
    const/4 v4, 0x0

    .line 93
    invoke-direct {v2, v1, v3, v4}, Lru1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    new-instance v3, Lru1;

    .line 97
    .line 98
    const-string v1, "init.svc.qemu-props"

    .line 99
    .line 100
    const/4 v5, 0x1

    .line 101
    invoke-direct {v3, v5, v1, v4}, Lru1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    new-instance v1, Lru1;

    .line 105
    .line 106
    const-string v5, "qemu.hw.mainkeys"

    .line 107
    .line 108
    const/4 v6, 0x1

    .line 109
    invoke-direct {v1, v6, v5, v4}, Lru1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    new-instance v5, Lru1;

    .line 113
    .line 114
    const-string v6, "qemu.sf.fake_camera"

    .line 115
    .line 116
    const/4 v7, 0x1

    .line 117
    invoke-direct {v5, v7, v6, v4}, Lru1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    new-instance v6, Lru1;

    .line 121
    .line 122
    const-string v7, "qemu.sf.lcd_density"

    .line 123
    .line 124
    const/4 v8, 0x1

    .line 125
    invoke-direct {v6, v8, v7, v4}, Lru1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    new-instance v7, Lru1;

    .line 129
    .line 130
    const-string v9, "ro.bootloader"

    .line 131
    .line 132
    const-string v10, "unknown"

    .line 133
    .line 134
    invoke-direct {v7, v8, v9, v10}, Lru1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    new-instance v8, Lru1;

    .line 138
    .line 139
    const-string v9, "ro.bootmode"

    .line 140
    .line 141
    const/4 v11, 0x1

    .line 142
    invoke-direct {v8, v11, v9, v10}, Lru1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    new-instance v9, Lru1;

    .line 146
    .line 147
    const-string v10, "ro.hardware"

    .line 148
    .line 149
    invoke-direct {v9, v11, v10, v0}, Lru1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    new-instance v10, Lru1;

    .line 153
    .line 154
    const-string v0, "ro.kernel.android.qemud"

    .line 155
    .line 156
    invoke-direct {v10, v11, v0, v4}, Lru1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    new-instance v11, Lru1;

    .line 160
    .line 161
    const-string v0, "ro.kernel.qemu.gles"

    .line 162
    .line 163
    const/4 v12, 0x1

    .line 164
    invoke-direct {v11, v12, v0, v4}, Lru1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    new-instance v12, Lru1;

    .line 168
    .line 169
    const-string v0, "1"

    .line 170
    .line 171
    const/4 v4, 0x1

    .line 172
    const-string v13, "ro.kernel.qemu"

    .line 173
    .line 174
    invoke-direct {v12, v4, v13, v0}, Lru1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    new-instance v13, Lru1;

    .line 178
    .line 179
    const-string v0, "generic"

    .line 180
    .line 181
    const-string v14, "ro.product.device"

    .line 182
    .line 183
    invoke-direct {v13, v4, v14, v0}, Lru1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    new-instance v14, Lru1;

    .line 187
    .line 188
    const/4 v0, 0x1

    .line 189
    const-string v4, "ro.product.model"

    .line 190
    .line 191
    const-string v15, "sdk"

    .line 192
    .line 193
    invoke-direct {v14, v0, v4, v15}, Lru1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    new-instance v0, Lru1;

    .line 197
    .line 198
    const-string v4, "ro.product.name"

    .line 199
    .line 200
    move-object/from16 v16, v1

    .line 201
    .line 202
    const/4 v1, 0x1

    .line 203
    invoke-direct {v0, v1, v4, v15}, Lru1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    move-object v15, v0

    .line 207
    move-object/from16 v4, v16

    .line 208
    .line 209
    filled-new-array/range {v2 .. v15}, [Lru1;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    sput-object v0, Lrd0;->j:[Lru1;

    .line 214
    .line 215
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
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
    iput-object v0, p0, Lrd0;->b:Ljava/util/ArrayList;

    .line 10
    .line 11
    iput-object p1, p0, Lrd0;->a:Landroid/content/Context;

    .line 12
    .line 13
    const-string p0, "com.google.android.launcher.layouts.genymotion"

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    const-string p0, "com.bluestacks"

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    const-string p0, "com.bignox.app"

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public static a([Ljava/lang/String;)Z
    .locals 5

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v2, v0, :cond_1

    .line 5
    .line 6
    aget-object v3, p0, v2

    .line 7
    .line 8
    new-instance v4, Ljava/io/File;

    .line 9
    .line 10
    invoke-direct {v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    return v1
.end method
