.class public Lcom/quago/mobile/sdk/QuagoSettings;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;,
        Lcom/quago/mobile/sdk/QuagoSettings$QuagoTokenCallback;,
        Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;,
        Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;,
        Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;,
        Lcom/quago/mobile/sdk/QuagoSettings$Builder;,
        Lcom/quago/mobile/sdk/QuagoSettings$QuagoCallback;
    }
.end annotation


# static fields
.field protected static LOG:Lcom/quago/mobile/sdk/j0;


# instance fields
.field protected appToken:Ljava/lang/String;

.field protected autoMaxDurationMillis:J

.field protected autoMotionAmount:I

.field protected autoMotionIntervalMillis:J

.field protected callback:Lcom/quago/mobile/sdk/QuagoSettings$QuagoCallback;

.field protected defaultAdditionalId:Ljava/lang/String;

.field protected disableInitSegment:Z

.field protected disableTouchSegment:Z

.field protected enableManualKeysDispatcher:Z

.field protected enableManualMotionDispatcher:Z

.field protected flavor:Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;

.field protected forceActivateAllSensors:Z

.field protected logLevel:Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

.field protected loggerCallback:Lcom/quago/mobile/sdk/utils/IQuagoLog;

.field protected maxCountMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field protected maxSegments:I

.field protected sampleRateMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field protected segmentQueryFullRangeMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field protected tokenCallback:Lcom/quago/mobile/sdk/QuagoSettings$QuagoTokenCallback;

.field protected touchSegmentDurationMillis:J

.field protected wrapper:I

.field protected wrapperVersion:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lcom/quago/mobile/sdk/k0;->a:Ljava/util/Locale;

    .line 2
    .line 3
    new-instance v0, Lcom/quago/mobile/sdk/j0;

    .line 4
    .line 5
    const-string v1, "QuagoSettings"

    .line 6
    .line 7
    invoke-direct {v0, v1}, Lcom/quago/mobile/sdk/j0;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/quago/mobile/sdk/QuagoSettings;->LOG:Lcom/quago/mobile/sdk/j0;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;)V
    .locals 12

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->INFO:Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/quago/mobile/sdk/QuagoSettings;->logLevel:Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/quago/mobile/sdk/QuagoSettings;->tokenCallback:Lcom/quago/mobile/sdk/QuagoSettings$QuagoTokenCallback;

    .line 10
    .line 11
    const-string v1, "0"

    .line 12
    .line 13
    iput-object v1, p0, Lcom/quago/mobile/sdk/QuagoSettings;->wrapperVersion:Ljava/lang/String;

    .line 14
    .line 15
    const/4 v1, -0x1

    .line 16
    iput v1, p0, Lcom/quago/mobile/sdk/QuagoSettings;->maxSegments:I

    .line 17
    .line 18
    const/16 v1, 0x32

    .line 19
    .line 20
    iput v1, p0, Lcom/quago/mobile/sdk/QuagoSettings;->autoMotionAmount:I

    .line 21
    .line 22
    const-wide/16 v2, 0x3a98

    .line 23
    .line 24
    iput-wide v2, p0, Lcom/quago/mobile/sdk/QuagoSettings;->autoMotionIntervalMillis:J

    .line 25
    .line 26
    const-wide/32 v2, 0x493e0

    .line 27
    .line 28
    .line 29
    iput-wide v2, p0, Lcom/quago/mobile/sdk/QuagoSettings;->autoMaxDurationMillis:J

    .line 30
    .line 31
    const-wide/16 v2, 0x3e8

    .line 32
    .line 33
    iput-wide v2, p0, Lcom/quago/mobile/sdk/QuagoSettings;->touchSegmentDurationMillis:J

    .line 34
    .line 35
    iput-object v0, p0, Lcom/quago/mobile/sdk/QuagoSettings;->defaultAdditionalId:Ljava/lang/String;

    .line 36
    .line 37
    iput-object p1, p0, Lcom/quago/mobile/sdk/QuagoSettings;->appToken:Ljava/lang/String;

    .line 38
    .line 39
    iput-object p2, p0, Lcom/quago/mobile/sdk/QuagoSettings;->flavor:Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;

    .line 40
    .line 41
    new-instance p1, Ljava/util/HashMap;

    .line 42
    .line 43
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Lcom/quago/mobile/sdk/QuagoSettings;->maxCountMap:Ljava/util/Map;

    .line 47
    .line 48
    sget-object p2, Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;->MOTION:Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;

    .line 49
    .line 50
    const/16 v0, 0x7d0

    .line 51
    .line 52
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {p1, p2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, Lcom/quago/mobile/sdk/QuagoSettings;->maxCountMap:Ljava/util/Map;

    .line 60
    .line 61
    sget-object p2, Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;->KEYS:Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;

    .line 62
    .line 63
    const/16 v0, 0xfa

    .line 64
    .line 65
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    iget-object p1, p0, Lcom/quago/mobile/sdk/QuagoSettings;->maxCountMap:Ljava/util/Map;

    .line 73
    .line 74
    sget-object p2, Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;->ACCELEROMETER:Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;

    .line 75
    .line 76
    const/16 v2, 0x3e8

    .line 77
    .line 78
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-interface {p1, p2, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    iget-object p1, p0, Lcom/quago/mobile/sdk/QuagoSettings;->maxCountMap:Ljava/util/Map;

    .line 86
    .line 87
    sget-object p2, Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;->BATTERY:Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;

    .line 88
    .line 89
    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    iget-object p1, p0, Lcom/quago/mobile/sdk/QuagoSettings;->maxCountMap:Ljava/util/Map;

    .line 93
    .line 94
    sget-object p2, Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;->MAGNETIC_FIELD:Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;

    .line 95
    .line 96
    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    iget-object p1, p0, Lcom/quago/mobile/sdk/QuagoSettings;->maxCountMap:Ljava/util/Map;

    .line 100
    .line 101
    sget-object p2, Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;->GYROSCOPE:Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;

    .line 102
    .line 103
    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    iget-object p1, p0, Lcom/quago/mobile/sdk/QuagoSettings;->maxCountMap:Ljava/util/Map;

    .line 107
    .line 108
    sget-object p2, Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;->PROXIMITY:Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;

    .line 109
    .line 110
    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    iget-object p1, p0, Lcom/quago/mobile/sdk/QuagoSettings;->maxCountMap:Ljava/util/Map;

    .line 114
    .line 115
    sget-object p2, Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;->LIGHT:Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;

    .line 116
    .line 117
    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    iget-object p1, p0, Lcom/quago/mobile/sdk/QuagoSettings;->maxCountMap:Ljava/util/Map;

    .line 121
    .line 122
    sget-object p2, Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;->PRESSURE:Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;

    .line 123
    .line 124
    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    iget-object p1, p0, Lcom/quago/mobile/sdk/QuagoSettings;->maxCountMap:Ljava/util/Map;

    .line 128
    .line 129
    sget-object p2, Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;->AMBIENT_TEMPERATURE:Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;

    .line 130
    .line 131
    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    iget-object p1, p0, Lcom/quago/mobile/sdk/QuagoSettings;->maxCountMap:Ljava/util/Map;

    .line 135
    .line 136
    sget-object p2, Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;->STEP_DETECTOR:Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;

    .line 137
    .line 138
    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    iget-object p1, p0, Lcom/quago/mobile/sdk/QuagoSettings;->maxCountMap:Ljava/util/Map;

    .line 142
    .line 143
    sget-object p2, Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;->GEOMAGNETIC_ROTATION_VECTOR:Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;

    .line 144
    .line 145
    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    iget-object p1, p0, Lcom/quago/mobile/sdk/QuagoSettings;->maxCountMap:Ljava/util/Map;

    .line 149
    .line 150
    sget-object p2, Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;->RESOLUTION:Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;

    .line 151
    .line 152
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    iget-object p1, p0, Lcom/quago/mobile/sdk/QuagoSettings;->maxCountMap:Ljava/util/Map;

    .line 160
    .line 161
    sget-object p2, Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;->LIFECYCLE:Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;

    .line 162
    .line 163
    const/16 v0, 0x64

    .line 164
    .line 165
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    new-instance p1, Ljava/util/HashMap;

    .line 173
    .line 174
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 175
    .line 176
    .line 177
    iput-object p1, p0, Lcom/quago/mobile/sdk/QuagoSettings;->segmentQueryFullRangeMap:Ljava/util/Map;

    .line 178
    .line 179
    sget-object p2, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->BATTERY:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 180
    .line 181
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 182
    .line 183
    invoke-virtual {p1, p2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    iget-object p1, p0, Lcom/quago/mobile/sdk/QuagoSettings;->segmentQueryFullRangeMap:Ljava/util/Map;

    .line 187
    .line 188
    sget-object v1, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->ACCELEROMETER:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 189
    .line 190
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    iget-object p1, p0, Lcom/quago/mobile/sdk/QuagoSettings;->segmentQueryFullRangeMap:Ljava/util/Map;

    .line 194
    .line 195
    sget-object v2, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->MAGNETIC_FIELD:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 196
    .line 197
    invoke-interface {p1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    iget-object p1, p0, Lcom/quago/mobile/sdk/QuagoSettings;->segmentQueryFullRangeMap:Ljava/util/Map;

    .line 201
    .line 202
    sget-object v3, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->GYROSCOPE:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 203
    .line 204
    invoke-interface {p1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    iget-object p1, p0, Lcom/quago/mobile/sdk/QuagoSettings;->segmentQueryFullRangeMap:Ljava/util/Map;

    .line 208
    .line 209
    sget-object v4, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->PROXIMITY:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 210
    .line 211
    invoke-interface {p1, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    iget-object p1, p0, Lcom/quago/mobile/sdk/QuagoSettings;->segmentQueryFullRangeMap:Ljava/util/Map;

    .line 215
    .line 216
    sget-object v5, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->LIGHT:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 217
    .line 218
    invoke-interface {p1, v5, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    iget-object p1, p0, Lcom/quago/mobile/sdk/QuagoSettings;->segmentQueryFullRangeMap:Ljava/util/Map;

    .line 222
    .line 223
    sget-object v6, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->PRESSURE:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 224
    .line 225
    invoke-interface {p1, v6, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    iget-object p1, p0, Lcom/quago/mobile/sdk/QuagoSettings;->segmentQueryFullRangeMap:Ljava/util/Map;

    .line 229
    .line 230
    sget-object v7, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->AMBIENT_TEMPERATURE:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 231
    .line 232
    invoke-interface {p1, v7, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    iget-object p1, p0, Lcom/quago/mobile/sdk/QuagoSettings;->segmentQueryFullRangeMap:Ljava/util/Map;

    .line 236
    .line 237
    sget-object v8, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->STEP_DETECTOR:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 238
    .line 239
    invoke-interface {p1, v8, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    iget-object p1, p0, Lcom/quago/mobile/sdk/QuagoSettings;->segmentQueryFullRangeMap:Ljava/util/Map;

    .line 243
    .line 244
    sget-object v9, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->GEOMAGNETIC_ROTATION_VECTOR:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 245
    .line 246
    invoke-interface {p1, v9, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    const p1, 0x3d090

    .line 250
    .line 251
    .line 252
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    const v0, 0xc350

    .line 257
    .line 258
    .line 259
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    const v10, 0x7a120

    .line 264
    .line 265
    .line 266
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 267
    .line 268
    .line 269
    move-result-object v10

    .line 270
    new-instance v11, Ljava/util/HashMap;

    .line 271
    .line 272
    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    .line 273
    .line 274
    .line 275
    iput-object v11, p0, Lcom/quago/mobile/sdk/QuagoSettings;->sampleRateMap:Ljava/util/Map;

    .line 276
    .line 277
    invoke-virtual {v11, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    iget-object v1, p0, Lcom/quago/mobile/sdk/QuagoSettings;->sampleRateMap:Ljava/util/Map;

    .line 281
    .line 282
    invoke-interface {v1, v2, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    iget-object v1, p0, Lcom/quago/mobile/sdk/QuagoSettings;->sampleRateMap:Ljava/util/Map;

    .line 286
    .line 287
    invoke-interface {v1, v3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    iget-object v1, p0, Lcom/quago/mobile/sdk/QuagoSettings;->sampleRateMap:Ljava/util/Map;

    .line 291
    .line 292
    const/4 v2, 0x0

    .line 293
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    invoke-interface {v1, v9, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    iget-object v1, p0, Lcom/quago/mobile/sdk/QuagoSettings;->sampleRateMap:Ljava/util/Map;

    .line 301
    .line 302
    invoke-interface {v1, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    iget-object v0, p0, Lcom/quago/mobile/sdk/QuagoSettings;->sampleRateMap:Ljava/util/Map;

    .line 306
    .line 307
    invoke-interface {v0, v5, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    iget-object v0, p0, Lcom/quago/mobile/sdk/QuagoSettings;->sampleRateMap:Ljava/util/Map;

    .line 311
    .line 312
    invoke-interface {v0, v6, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    iget-object v0, p0, Lcom/quago/mobile/sdk/QuagoSettings;->sampleRateMap:Ljava/util/Map;

    .line 316
    .line 317
    invoke-interface {v0, v7, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    iget-object v0, p0, Lcom/quago/mobile/sdk/QuagoSettings;->sampleRateMap:Ljava/util/Map;

    .line 321
    .line 322
    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    iget-object p0, p0, Lcom/quago/mobile/sdk/QuagoSettings;->sampleRateMap:Ljava/util/Map;

    .line 326
    .line 327
    invoke-interface {p0, v8, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    return-void
.end method

.method public static create(Ljava/lang/String;Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;)Lcom/quago/mobile/sdk/QuagoSettings$Builder;
    .locals 1

    .line 1
    new-instance v0, Lcom/quago/mobile/sdk/QuagoSettings$Builder;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/quago/mobile/sdk/QuagoSettings$Builder;-><init>(Ljava/lang/String;Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public getAppToken()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/quago/mobile/sdk/QuagoSettings;->appToken:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getAutoMaxDurationMillis()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/quago/mobile/sdk/QuagoSettings;->autoMaxDurationMillis:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getAutoMotionAmount()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/quago/mobile/sdk/QuagoSettings;->autoMotionAmount:I

    .line 2
    .line 3
    return p0
.end method

.method public getAutoMotionIntervalMillis()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/quago/mobile/sdk/QuagoSettings;->autoMotionIntervalMillis:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getCallback()Lcom/quago/mobile/sdk/QuagoSettings$QuagoCallback;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/quago/mobile/sdk/QuagoSettings;->callback:Lcom/quago/mobile/sdk/QuagoSettings$QuagoCallback;

    .line 2
    .line 3
    return-object p0
.end method

.method public getDefaultAdditionalId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/quago/mobile/sdk/QuagoSettings;->defaultAdditionalId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getFlavor()Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/quago/mobile/sdk/QuagoSettings;->flavor:Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMaxSegments()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/quago/mobile/sdk/QuagoSettings;->maxSegments:I

    .line 2
    .line 3
    return p0
.end method

.method public getQueryMaxCount(Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/quago/mobile/sdk/QuagoSettings;->maxCountMap:Ljava/util/Map;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object p0, p0, Lcom/quago/mobile/sdk/QuagoSettings;->maxCountMap:Ljava/util/Map;

    .line 14
    .line 15
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Ljava/lang/Integer;

    .line 20
    .line 21
    if-nez p0, :cond_1

    .line 22
    .line 23
    return v1

    .line 24
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    return p0

    .line 29
    :cond_2
    :goto_0
    return v1
.end method

.method public getSampleRate(Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/quago/mobile/sdk/QuagoSettings;->sampleRateMap:Ljava/util/Map;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object p0, p0, Lcom/quago/mobile/sdk/QuagoSettings;->sampleRateMap:Ljava/util/Map;

    .line 14
    .line 15
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Ljava/lang/Integer;

    .line 20
    .line 21
    if-nez p0, :cond_1

    .line 22
    .line 23
    return v1

    .line 24
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    return p0

    .line 29
    :cond_2
    :goto_0
    return v1
.end method

.method public getSegmentQueryFullRange(Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/quago/mobile/sdk/QuagoSettings;->segmentQueryFullRangeMap:Ljava/util/Map;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object p0, p0, Lcom/quago/mobile/sdk/QuagoSettings;->segmentQueryFullRangeMap:Ljava/util/Map;

    .line 14
    .line 15
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Ljava/lang/Boolean;

    .line 20
    .line 21
    if-nez p0, :cond_1

    .line 22
    .line 23
    return v1

    .line 24
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    return p0

    .line 29
    :cond_2
    :goto_0
    return v1
.end method

.method public getTokenCallback()Lcom/quago/mobile/sdk/QuagoSettings$QuagoTokenCallback;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/quago/mobile/sdk/QuagoSettings;->tokenCallback:Lcom/quago/mobile/sdk/QuagoSettings$QuagoTokenCallback;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTouchSegmentDurationMillis()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/quago/mobile/sdk/QuagoSettings;->touchSegmentDurationMillis:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getWrapper()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/quago/mobile/sdk/QuagoSettings;->wrapper:I

    .line 2
    .line 3
    return p0
.end method

.method public getWrapperVersion()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/quago/mobile/sdk/QuagoSettings;->wrapperVersion:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public isForceActivateAllSensors()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/quago/mobile/sdk/QuagoSettings;->forceActivateAllSensors:Z

    .line 2
    .line 3
    return p0
.end method

.method public isInitSegmentDisabled()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/quago/mobile/sdk/QuagoSettings;->disableInitSegment:Z

    .line 2
    .line 3
    return p0
.end method

.method public isManualKeysDispatcherEnabled()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/quago/mobile/sdk/QuagoSettings;->enableManualKeysDispatcher:Z

    .line 2
    .line 3
    return p0
.end method

.method public isManualMotionDispatcherEnabled()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/quago/mobile/sdk/QuagoSettings;->enableManualMotionDispatcher:Z

    .line 2
    .line 3
    return p0
.end method

.method public isTouchSegmentDisabled()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/quago/mobile/sdk/QuagoSettings;->disableTouchSegment:Z

    .line 2
    .line 3
    return p0
.end method

.method public setAppToken(Ljava/lang/String;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iput-object p1, p0, Lcom/quago/mobile/sdk/QuagoSettings;->appToken:Ljava/lang/String;

    .line 11
    .line 12
    return-void

    .line 13
    :cond_1
    :goto_0
    sget-object p0, Lcom/quago/mobile/sdk/QuagoSettings;->LOG:Lcom/quago/mobile/sdk/j0;

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    new-array p1, p1, [Ljava/lang/Object;

    .line 17
    .line 18
    const-string v0, "setAppToken"

    .line 19
    .line 20
    const-string v1, "newAppToken is null or empty - ignoring!"

    .line 21
    .line 22
    invoke-virtual {p0, v0, v1, p1}, Lcom/quago/mobile/sdk/j0;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method
