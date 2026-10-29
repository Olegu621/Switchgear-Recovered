.class public final Lls1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final synthetic b:[Lu21;


# instance fields
.field public final a:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 24

    .line 1
    new-instance v0, Lsy1;

    .line 2
    .line 3
    const-class v1, Lls1;

    .line 4
    .line 5
    const-string v2, "osType"

    .line 6
    .line 7
    const-string v3, "getOsType()Ljava/lang/String;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    sget-object v2, Lj22;->a:Lk22;

    .line 14
    .line 15
    const-string v3, "osVersion"

    .line 16
    .line 17
    const-string v5, "getOsVersion()Ljava/lang/String;"

    .line 18
    .line 19
    invoke-static {v2, v1, v3, v5, v4}, Lfm0;->d(Lk22;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lsy1;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    new-instance v3, Lsy1;

    .line 24
    .line 25
    const-string v5, "deviceVendor"

    .line 26
    .line 27
    const-string v6, "getDeviceVendor()Ljava/lang/String;"

    .line 28
    .line 29
    invoke-direct {v3, v1, v5, v6, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 30
    .line 31
    .line 32
    new-instance v5, Lsy1;

    .line 33
    .line 34
    const-string v6, "deviceModel"

    .line 35
    .line 36
    const-string v7, "getDeviceModel()Ljava/lang/String;"

    .line 37
    .line 38
    invoke-direct {v5, v1, v6, v7, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 39
    .line 40
    .line 41
    new-instance v6, Lsy1;

    .line 42
    .line 43
    const-string v7, "carrier"

    .line 44
    .line 45
    const-string v8, "getCarrier()Ljava/lang/String;"

    .line 46
    .line 47
    invoke-direct {v6, v1, v7, v8, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 48
    .line 49
    .line 50
    new-instance v7, Lsy1;

    .line 51
    .line 52
    const-string v8, "networkType"

    .line 53
    .line 54
    const-string v9, "getNetworkType()Ljava/lang/String;"

    .line 55
    .line 56
    invoke-direct {v7, v1, v8, v9, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    new-instance v8, Lsy1;

    .line 60
    .line 61
    const-string v9, "networkTechnology"

    .line 62
    .line 63
    const-string v10, "getNetworkTechnology()Ljava/lang/String;"

    .line 64
    .line 65
    invoke-direct {v8, v1, v9, v10, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 66
    .line 67
    .line 68
    new-instance v9, Lsy1;

    .line 69
    .line 70
    const-string v10, "androidIdfa"

    .line 71
    .line 72
    const-string v11, "getAndroidIdfa()Ljava/lang/String;"

    .line 73
    .line 74
    invoke-direct {v9, v1, v10, v11, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 75
    .line 76
    .line 77
    new-instance v10, Lsy1;

    .line 78
    .line 79
    const-string v11, "availableStorage"

    .line 80
    .line 81
    const-string v12, "getAvailableStorage()Ljava/lang/String;"

    .line 82
    .line 83
    invoke-direct {v10, v1, v11, v12, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 84
    .line 85
    .line 86
    new-instance v11, Lsy1;

    .line 87
    .line 88
    const-string v12, "totalStorage"

    .line 89
    .line 90
    const-string v13, "getTotalStorage()Ljava/lang/String;"

    .line 91
    .line 92
    invoke-direct {v11, v1, v12, v13, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 93
    .line 94
    .line 95
    new-instance v12, Lsy1;

    .line 96
    .line 97
    const-string v13, "physicalMemory"

    .line 98
    .line 99
    const-string v14, "getPhysicalMemory()Ljava/lang/String;"

    .line 100
    .line 101
    invoke-direct {v12, v1, v13, v14, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 102
    .line 103
    .line 104
    new-instance v13, Lsy1;

    .line 105
    .line 106
    const-string v14, "systemAvailableMemory"

    .line 107
    .line 108
    const-string v15, "getSystemAvailableMemory()Ljava/lang/String;"

    .line 109
    .line 110
    invoke-direct {v13, v1, v14, v15, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 111
    .line 112
    .line 113
    new-instance v14, Lsy1;

    .line 114
    .line 115
    const-string v15, "batteryLevel"

    .line 116
    .line 117
    move-object/from16 v16, v0

    .line 118
    .line 119
    const-string v0, "getBatteryLevel()Ljava/lang/Integer;"

    .line 120
    .line 121
    invoke-direct {v14, v1, v15, v0, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 122
    .line 123
    .line 124
    new-instance v0, Lsy1;

    .line 125
    .line 126
    const-string v15, "batteryState"

    .line 127
    .line 128
    move-object/from16 v17, v2

    .line 129
    .line 130
    const-string v2, "getBatteryState()Ljava/lang/String;"

    .line 131
    .line 132
    invoke-direct {v0, v1, v15, v2, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 133
    .line 134
    .line 135
    new-instance v2, Lsy1;

    .line 136
    .line 137
    const-string v15, "isPortrait"

    .line 138
    .line 139
    move-object/from16 v18, v0

    .line 140
    .line 141
    const-string v0, "isPortrait()Ljava/lang/Boolean;"

    .line 142
    .line 143
    invoke-direct {v2, v1, v15, v0, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 144
    .line 145
    .line 146
    new-instance v0, Lsy1;

    .line 147
    .line 148
    const-string v15, "resolution"

    .line 149
    .line 150
    move-object/from16 v19, v2

    .line 151
    .line 152
    const-string v2, "getResolution()Ljava/lang/String;"

    .line 153
    .line 154
    invoke-direct {v0, v1, v15, v2, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 155
    .line 156
    .line 157
    new-instance v2, Lsy1;

    .line 158
    .line 159
    const-string v15, "scale"

    .line 160
    .line 161
    move-object/from16 v20, v0

    .line 162
    .line 163
    const-string v0, "getScale()Ljava/lang/Double;"

    .line 164
    .line 165
    invoke-direct {v2, v1, v15, v0, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 166
    .line 167
    .line 168
    new-instance v0, Lsy1;

    .line 169
    .line 170
    const-string v15, "language"

    .line 171
    .line 172
    move-object/from16 v21, v2

    .line 173
    .line 174
    const-string v2, "getLanguage()Ljava/lang/String;"

    .line 175
    .line 176
    invoke-direct {v0, v1, v15, v2, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 177
    .line 178
    .line 179
    new-instance v2, Lsy1;

    .line 180
    .line 181
    const-string v15, "appSetId"

    .line 182
    .line 183
    move-object/from16 v22, v0

    .line 184
    .line 185
    const-string v0, "getAppSetId()Ljava/lang/String;"

    .line 186
    .line 187
    invoke-direct {v2, v1, v15, v0, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 188
    .line 189
    .line 190
    new-instance v0, Lsy1;

    .line 191
    .line 192
    const-string v15, "appSetIdScope"

    .line 193
    .line 194
    move-object/from16 v23, v2

    .line 195
    .line 196
    const-string v2, "getAppSetIdScope()Ljava/lang/String;"

    .line 197
    .line 198
    invoke-direct {v0, v1, v15, v2, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 199
    .line 200
    .line 201
    const/16 v1, 0x14

    .line 202
    .line 203
    new-array v1, v1, [Lu21;

    .line 204
    .line 205
    aput-object v16, v1, v4

    .line 206
    .line 207
    const/4 v2, 0x1

    .line 208
    aput-object v17, v1, v2

    .line 209
    .line 210
    const/4 v2, 0x2

    .line 211
    aput-object v3, v1, v2

    .line 212
    .line 213
    const/4 v2, 0x3

    .line 214
    aput-object v5, v1, v2

    .line 215
    .line 216
    const/4 v2, 0x4

    .line 217
    aput-object v6, v1, v2

    .line 218
    .line 219
    const/4 v2, 0x5

    .line 220
    aput-object v7, v1, v2

    .line 221
    .line 222
    const/4 v2, 0x6

    .line 223
    aput-object v8, v1, v2

    .line 224
    .line 225
    const/4 v2, 0x7

    .line 226
    aput-object v9, v1, v2

    .line 227
    .line 228
    const/16 v2, 0x8

    .line 229
    .line 230
    aput-object v10, v1, v2

    .line 231
    .line 232
    const/16 v2, 0x9

    .line 233
    .line 234
    aput-object v11, v1, v2

    .line 235
    .line 236
    const/16 v2, 0xa

    .line 237
    .line 238
    aput-object v12, v1, v2

    .line 239
    .line 240
    const/16 v2, 0xb

    .line 241
    .line 242
    aput-object v13, v1, v2

    .line 243
    .line 244
    const/16 v2, 0xc

    .line 245
    .line 246
    aput-object v14, v1, v2

    .line 247
    .line 248
    const/16 v2, 0xd

    .line 249
    .line 250
    aput-object v18, v1, v2

    .line 251
    .line 252
    const/16 v2, 0xe

    .line 253
    .line 254
    aput-object v19, v1, v2

    .line 255
    .line 256
    const/16 v2, 0xf

    .line 257
    .line 258
    aput-object v20, v1, v2

    .line 259
    .line 260
    const/16 v2, 0x10

    .line 261
    .line 262
    aput-object v21, v1, v2

    .line 263
    .line 264
    const/16 v2, 0x11

    .line 265
    .line 266
    aput-object v22, v1, v2

    .line 267
    .line 268
    const/16 v2, 0x12

    .line 269
    .line 270
    aput-object v23, v1, v2

    .line 271
    .line 272
    const/16 v2, 0x13

    .line 273
    .line 274
    aput-object v0, v1, v2

    .line 275
    .line 276
    sput-object v1, Lls1;->b:[Lu21;

    .line 277
    .line 278
    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lbz;

    .line 5
    .line 6
    const/16 v1, 0x10

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lbz;-><init>(I)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v0}, Lmc1;->b(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lls1;->a:Ljava/util/Map;

    .line 16
    .line 17
    return-void
.end method
