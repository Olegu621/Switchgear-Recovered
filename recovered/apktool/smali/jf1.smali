.class public final Ljf1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final synthetic c:[Lu21;


# instance fields
.field public final a:Ljava/util/Map;

.field public final b:Lhk2;


# direct methods
.method static constructor <clinit>()V
    .locals 19

    .line 1
    new-instance v0, Lsy1;

    .line 2
    .line 3
    const-class v1, Ljf1;

    .line 4
    .line 5
    const-string v2, "currentTime"

    .line 6
    .line 7
    const-string v3, "getCurrentTime()Ljava/lang/Double;"

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
    const-string v3, "duration"

    .line 16
    .line 17
    const-string v5, "getDuration()Ljava/lang/Double;"

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
    const-string v5, "ended"

    .line 26
    .line 27
    const-string v6, "getEnded()Ljava/lang/Boolean;"

    .line 28
    .line 29
    invoke-direct {v3, v1, v5, v6, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 30
    .line 31
    .line 32
    new-instance v5, Lsy1;

    .line 33
    .line 34
    const-string v6, "fullscreen"

    .line 35
    .line 36
    const-string v7, "getFullscreen()Ljava/lang/Boolean;"

    .line 37
    .line 38
    invoke-direct {v5, v1, v6, v7, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 39
    .line 40
    .line 41
    new-instance v6, Lsy1;

    .line 42
    .line 43
    const-string v7, "livestream"

    .line 44
    .line 45
    const-string v8, "getLivestream()Ljava/lang/Boolean;"

    .line 46
    .line 47
    invoke-direct {v6, v1, v7, v8, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 48
    .line 49
    .line 50
    new-instance v7, Lsy1;

    .line 51
    .line 52
    const-string v8, "label"

    .line 53
    .line 54
    const-string v9, "getLabel()Ljava/lang/String;"

    .line 55
    .line 56
    invoke-direct {v7, v1, v8, v9, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    new-instance v8, Lsy1;

    .line 60
    .line 61
    const-string v9, "loop"

    .line 62
    .line 63
    const-string v10, "getLoop()Ljava/lang/Boolean;"

    .line 64
    .line 65
    invoke-direct {v8, v1, v9, v10, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 66
    .line 67
    .line 68
    new-instance v9, Lsy1;

    .line 69
    .line 70
    const-string v10, "mediaType"

    .line 71
    .line 72
    const-string v11, "getMediaType()Ljava/lang/String;"

    .line 73
    .line 74
    invoke-direct {v9, v1, v10, v11, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 75
    .line 76
    .line 77
    new-instance v10, Lsy1;

    .line 78
    .line 79
    const-string v11, "muted"

    .line 80
    .line 81
    const-string v12, "getMuted()Ljava/lang/Boolean;"

    .line 82
    .line 83
    invoke-direct {v10, v1, v11, v12, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 84
    .line 85
    .line 86
    new-instance v11, Lsy1;

    .line 87
    .line 88
    const-string v12, "paused"

    .line 89
    .line 90
    const-string v13, "getPaused()Ljava/lang/Boolean;"

    .line 91
    .line 92
    invoke-direct {v11, v1, v12, v13, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 93
    .line 94
    .line 95
    new-instance v12, Lsy1;

    .line 96
    .line 97
    const-string v13, "pictureInPicture"

    .line 98
    .line 99
    const-string v14, "getPictureInPicture()Ljava/lang/Boolean;"

    .line 100
    .line 101
    invoke-direct {v12, v1, v13, v14, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 102
    .line 103
    .line 104
    new-instance v13, Lsy1;

    .line 105
    .line 106
    const-string v14, "playerType"

    .line 107
    .line 108
    const-string v15, "getPlayerType()Ljava/lang/String;"

    .line 109
    .line 110
    invoke-direct {v13, v1, v14, v15, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 111
    .line 112
    .line 113
    new-instance v14, Lsy1;

    .line 114
    .line 115
    const-string v15, "playbackRate"

    .line 116
    .line 117
    move-object/from16 v16, v0

    .line 118
    .line 119
    const-string v0, "getPlaybackRate()Ljava/lang/Double;"

    .line 120
    .line 121
    invoke-direct {v14, v1, v15, v0, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 122
    .line 123
    .line 124
    new-instance v0, Lsy1;

    .line 125
    .line 126
    const-string v15, "quality"

    .line 127
    .line 128
    move-object/from16 v17, v2

    .line 129
    .line 130
    const-string v2, "getQuality()Ljava/lang/String;"

    .line 131
    .line 132
    invoke-direct {v0, v1, v15, v2, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 133
    .line 134
    .line 135
    new-instance v2, Lsy1;

    .line 136
    .line 137
    const-string v15, "volume"

    .line 138
    .line 139
    move-object/from16 v18, v0

    .line 140
    .line 141
    const-string v0, "getVolume()Ljava/lang/Integer;"

    .line 142
    .line 143
    invoke-direct {v2, v1, v15, v0, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 144
    .line 145
    .line 146
    const/16 v0, 0xf

    .line 147
    .line 148
    new-array v0, v0, [Lu21;

    .line 149
    .line 150
    aput-object v16, v0, v4

    .line 151
    .line 152
    const/4 v1, 0x1

    .line 153
    aput-object v17, v0, v1

    .line 154
    .line 155
    const/4 v1, 0x2

    .line 156
    aput-object v3, v0, v1

    .line 157
    .line 158
    const/4 v1, 0x3

    .line 159
    aput-object v5, v0, v1

    .line 160
    .line 161
    const/4 v1, 0x4

    .line 162
    aput-object v6, v0, v1

    .line 163
    .line 164
    const/4 v1, 0x5

    .line 165
    aput-object v7, v0, v1

    .line 166
    .line 167
    const/4 v1, 0x6

    .line 168
    aput-object v8, v0, v1

    .line 169
    .line 170
    const/4 v1, 0x7

    .line 171
    aput-object v9, v0, v1

    .line 172
    .line 173
    const/16 v1, 0x8

    .line 174
    .line 175
    aput-object v10, v0, v1

    .line 176
    .line 177
    const/16 v1, 0x9

    .line 178
    .line 179
    aput-object v11, v0, v1

    .line 180
    .line 181
    const/16 v1, 0xa

    .line 182
    .line 183
    aput-object v12, v0, v1

    .line 184
    .line 185
    const/16 v1, 0xb

    .line 186
    .line 187
    aput-object v13, v0, v1

    .line 188
    .line 189
    const/16 v1, 0xc

    .line 190
    .line 191
    aput-object v14, v0, v1

    .line 192
    .line 193
    const/16 v1, 0xd

    .line 194
    .line 195
    aput-object v18, v0, v1

    .line 196
    .line 197
    const/16 v1, 0xe

    .line 198
    .line 199
    aput-object v2, v0, v1

    .line 200
    .line 201
    sput-object v0, Ljf1;->c:[Lu21;

    .line 202
    .line 203
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
    const/16 v1, 0xb

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
    iput-object p1, p0, Ljf1;->a:Ljava/util/Map;

    .line 16
    .line 17
    new-instance p1, Lod;

    .line 18
    .line 19
    const/4 v0, 0x5

    .line 20
    invoke-direct {p1, p0, v0}, Lod;-><init>(Ljava/lang/Object;I)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Ljf1;->b:Lhk2;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final a()Lif1;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lif1;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    sget-object v3, Ljf1;->c:[Lu21;

    .line 7
    .line 8
    aget-object v2, v3, v2

    .line 9
    .line 10
    invoke-interface {v2}, Ln21;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    iget-object v4, v0, Ljf1;->a:Ljava/util/Map;

    .line 15
    .line 16
    invoke-static {v4, v2}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Ljava/lang/Double;

    .line 21
    .line 22
    const/4 v5, 0x1

    .line 23
    aget-object v5, v3, v5

    .line 24
    .line 25
    invoke-interface {v5}, Ln21;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-static {v4, v5}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    check-cast v5, Ljava/lang/Double;

    .line 34
    .line 35
    const/4 v6, 0x2

    .line 36
    aget-object v6, v3, v6

    .line 37
    .line 38
    invoke-interface {v6}, Ln21;->getName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    invoke-static {v4, v6}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    check-cast v6, Ljava/lang/Boolean;

    .line 47
    .line 48
    const/4 v7, 0x3

    .line 49
    aget-object v7, v3, v7

    .line 50
    .line 51
    invoke-interface {v7}, Ln21;->getName()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    invoke-static {v4, v7}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    check-cast v7, Ljava/lang/Boolean;

    .line 60
    .line 61
    const/4 v8, 0x4

    .line 62
    aget-object v8, v3, v8

    .line 63
    .line 64
    invoke-interface {v8}, Ln21;->getName()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    invoke-static {v4, v8}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    check-cast v8, Ljava/lang/Boolean;

    .line 73
    .line 74
    const/4 v9, 0x5

    .line 75
    aget-object v9, v3, v9

    .line 76
    .line 77
    invoke-interface {v9}, Ln21;->getName()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v9

    .line 81
    invoke-static {v4, v9}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v9

    .line 85
    check-cast v9, Ljava/lang/String;

    .line 86
    .line 87
    const/4 v10, 0x6

    .line 88
    aget-object v10, v3, v10

    .line 89
    .line 90
    invoke-interface {v10}, Ln21;->getName()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v10

    .line 94
    invoke-static {v4, v10}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v10

    .line 98
    check-cast v10, Ljava/lang/Boolean;

    .line 99
    .line 100
    iget-object v0, v0, Ljf1;->b:Lhk2;

    .line 101
    .line 102
    invoke-virtual {v0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    check-cast v0, Lwf1;

    .line 107
    .line 108
    const/16 v11, 0x8

    .line 109
    .line 110
    aget-object v11, v3, v11

    .line 111
    .line 112
    invoke-interface {v11}, Ln21;->getName()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v11

    .line 116
    invoke-static {v4, v11}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v11

    .line 120
    check-cast v11, Ljava/lang/Boolean;

    .line 121
    .line 122
    const/16 v12, 0x9

    .line 123
    .line 124
    aget-object v12, v3, v12

    .line 125
    .line 126
    invoke-interface {v12}, Ln21;->getName()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v12

    .line 130
    invoke-static {v4, v12}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v12

    .line 134
    check-cast v12, Ljava/lang/Boolean;

    .line 135
    .line 136
    const/16 v13, 0xa

    .line 137
    .line 138
    aget-object v13, v3, v13

    .line 139
    .line 140
    invoke-interface {v13}, Ln21;->getName()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v13

    .line 144
    invoke-static {v4, v13}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v13

    .line 148
    check-cast v13, Ljava/lang/Boolean;

    .line 149
    .line 150
    const/16 v14, 0xb

    .line 151
    .line 152
    aget-object v14, v3, v14

    .line 153
    .line 154
    invoke-interface {v14}, Ln21;->getName()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v14

    .line 158
    invoke-static {v4, v14}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v14

    .line 162
    check-cast v14, Ljava/lang/String;

    .line 163
    .line 164
    const/16 v15, 0xc

    .line 165
    .line 166
    aget-object v15, v3, v15

    .line 167
    .line 168
    invoke-interface {v15}, Ln21;->getName()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v15

    .line 172
    invoke-static {v4, v15}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v15

    .line 176
    check-cast v15, Ljava/lang/Double;

    .line 177
    .line 178
    const/16 v16, 0xd

    .line 179
    .line 180
    aget-object v16, v3, v16

    .line 181
    .line 182
    move-object/from16 p0, v0

    .line 183
    .line 184
    invoke-interface/range {v16 .. v16}, Ln21;->getName()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-static {v4, v0}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    check-cast v0, Ljava/lang/String;

    .line 193
    .line 194
    const/16 v16, 0xe

    .line 195
    .line 196
    aget-object v3, v3, v16

    .line 197
    .line 198
    invoke-interface {v3}, Ln21;->getName()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    invoke-static {v4, v3}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    check-cast v3, Ljava/lang/Integer;

    .line 207
    .line 208
    move-object v4, v15

    .line 209
    move-object v15, v3

    .line 210
    move-object v3, v6

    .line 211
    move-object v6, v9

    .line 212
    move-object v9, v11

    .line 213
    move-object v11, v13

    .line 214
    move-object v13, v4

    .line 215
    move-object v4, v7

    .line 216
    move-object v7, v10

    .line 217
    move-object v10, v12

    .line 218
    move-object v12, v14

    .line 219
    move-object v14, v0

    .line 220
    move-object v0, v1

    .line 221
    move-object v1, v2

    .line 222
    move-object v2, v5

    .line 223
    move-object v5, v8

    .line 224
    move-object/from16 v8, p0

    .line 225
    .line 226
    invoke-direct/range {v0 .. v15}, Lif1;-><init>(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lwf1;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 227
    .line 228
    .line 229
    return-object v0
.end method
