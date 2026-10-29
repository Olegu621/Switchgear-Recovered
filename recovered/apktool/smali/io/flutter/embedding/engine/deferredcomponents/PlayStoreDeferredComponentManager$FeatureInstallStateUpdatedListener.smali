.class Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lcom/google/android/play/core/splitinstall/SplitInstallStateUpdatedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "FeatureInstallStateUpdatedListener"
.end annotation


# instance fields
.field final synthetic this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;


# direct methods
.method private constructor <init>(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$1;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;-><init>(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)V

    return-void
.end method


# virtual methods
.method public onStateUpdate(Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->sessionId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    .line 6
    .line 7
    invoke-static {v1}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->access$000(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)Landroid/util/SparseArray;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_4

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->status()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const-string v2, "PlayStoreDeferredComponentManager"

    .line 22
    .line 23
    packed-switch v1, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    new-instance p0, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string v0, "Unknown status: "

    .line 29
    .line 30
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->status()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {v2, p0}, Lio/flutter/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_0
    iget-object p1, p0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    .line 49
    .line 50
    invoke-static {p1}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->access$000(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)Landroid/util/SparseArray;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    filled-new-array {p1, v1}, [Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    const-string v1, "Module \"%s\" (sessionId %d) install canceling."

    .line 67
    .line 68
    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-static {v2, p1}, Lio/flutter/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    iget-object p0, p0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    .line 76
    .line 77
    invoke-static {p0}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->access$400(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)Landroid/util/SparseArray;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    const-string p1, "canceling"

    .line 82
    .line 83
    invoke-virtual {p0, v0, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :pswitch_1
    iget-object p1, p0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    .line 88
    .line 89
    invoke-static {p1}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->access$000(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)Landroid/util/SparseArray;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    filled-new-array {p1, v1}, [Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    const-string v1, "Module \"%s\" (sessionId %d) install requires user confirmation."

    .line 106
    .line 107
    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-static {v2, p1}, Lio/flutter/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    iget-object p0, p0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    .line 115
    .line 116
    invoke-static {p0}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->access$400(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)Landroid/util/SparseArray;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    const-string p1, "requiresUserConfirmation"

    .line 121
    .line 122
    invoke-virtual {p0, v0, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :pswitch_2
    iget-object p1, p0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    .line 127
    .line 128
    invoke-static {p1}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->access$000(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)Landroid/util/SparseArray;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    filled-new-array {p1, v1}, [Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    const-string v1, "Module \"%s\" (sessionId %d) install canceled."

    .line 145
    .line 146
    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-static {v2, p1}, Lio/flutter/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    iget-object p1, p0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    .line 154
    .line 155
    invoke-static {p1}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->access$300(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    if-eqz p1, :cond_0

    .line 160
    .line 161
    iget-object p1, p0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    .line 162
    .line 163
    invoke-static {p1}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->access$300(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    iget-object v1, p0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    .line 168
    .line 169
    invoke-static {v1}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->access$000(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)Landroid/util/SparseArray;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    check-cast v1, Ljava/lang/String;

    .line 178
    .line 179
    const-string v2, "Android Deferred Component installation canceled."

    .line 180
    .line 181
    invoke-virtual {p1, v1, v2}, Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel;->completeInstallError(Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    :cond_0
    iget-object p1, p0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    .line 185
    .line 186
    invoke-static {p1}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->access$000(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)Landroid/util/SparseArray;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->delete(I)V

    .line 191
    .line 192
    .line 193
    iget-object p1, p0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    .line 194
    .line 195
    invoke-static {p1}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->access$100(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)Landroid/util/SparseIntArray;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    invoke-virtual {p1, v0}, Landroid/util/SparseIntArray;->delete(I)V

    .line 200
    .line 201
    .line 202
    iget-object p0, p0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    .line 203
    .line 204
    invoke-static {p0}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->access$400(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)Landroid/util/SparseArray;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    const-string p1, "cancelled"

    .line 209
    .line 210
    invoke-virtual {p0, v0, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    return-void

    .line 214
    :pswitch_3
    iget-object v1, p0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    .line 215
    .line 216
    invoke-static {v1}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->access$000(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)Landroid/util/SparseArray;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    invoke-virtual {p1}, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->errorCode()I

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    filled-new-array {v1, v3, v4}, [Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    const-string v3, "Module \"%s\" (sessionId %d) install failed with: %s"

    .line 241
    .line 242
    invoke-static {v3, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    invoke-static {v2, v1}, Lio/flutter/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    iget-object v1, p0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    .line 250
    .line 251
    invoke-static {v1}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->access$200(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)Lio/flutter/embedding/engine/FlutterJNI;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    iget-object v2, p0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    .line 256
    .line 257
    invoke-static {v2}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->access$100(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)Landroid/util/SparseIntArray;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    invoke-virtual {v2, v0}, Landroid/util/SparseIntArray;->get(I)I

    .line 262
    .line 263
    .line 264
    move-result v2

    .line 265
    new-instance v3, Ljava/lang/StringBuilder;

    .line 266
    .line 267
    const-string v4, "Module install failed with "

    .line 268
    .line 269
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {p1}, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->errorCode()I

    .line 273
    .line 274
    .line 275
    move-result p1

    .line 276
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    const/4 v3, 0x1

    .line 284
    invoke-virtual {v1, v2, p1, v3}, Lio/flutter/embedding/engine/FlutterJNI;->deferredComponentInstallFailure(ILjava/lang/String;Z)V

    .line 285
    .line 286
    .line 287
    iget-object p1, p0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    .line 288
    .line 289
    invoke-static {p1}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->access$300(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    if-eqz p1, :cond_1

    .line 294
    .line 295
    iget-object p1, p0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    .line 296
    .line 297
    invoke-static {p1}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->access$300(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    iget-object v1, p0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    .line 302
    .line 303
    invoke-static {v1}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->access$000(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)Landroid/util/SparseArray;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    check-cast v1, Ljava/lang/String;

    .line 312
    .line 313
    const-string v2, "Android Deferred Component failed to install."

    .line 314
    .line 315
    invoke-virtual {p1, v1, v2}, Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel;->completeInstallError(Ljava/lang/String;Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    :cond_1
    iget-object p1, p0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    .line 319
    .line 320
    invoke-static {p1}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->access$000(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)Landroid/util/SparseArray;

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->delete(I)V

    .line 325
    .line 326
    .line 327
    iget-object p1, p0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    .line 328
    .line 329
    invoke-static {p1}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->access$100(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)Landroid/util/SparseIntArray;

    .line 330
    .line 331
    .line 332
    move-result-object p1

    .line 333
    invoke-virtual {p1, v0}, Landroid/util/SparseIntArray;->delete(I)V

    .line 334
    .line 335
    .line 336
    iget-object p0, p0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    .line 337
    .line 338
    invoke-static {p0}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->access$400(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)Landroid/util/SparseArray;

    .line 339
    .line 340
    .line 341
    move-result-object p0

    .line 342
    const-string p1, "failed"

    .line 343
    .line 344
    invoke-virtual {p0, v0, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    return-void

    .line 348
    :pswitch_4
    iget-object p1, p0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    .line 349
    .line 350
    invoke-static {p1}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->access$000(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)Landroid/util/SparseArray;

    .line 351
    .line 352
    .line 353
    move-result-object p1

    .line 354
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object p1

    .line 358
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 359
    .line 360
    .line 361
    move-result-object v1

    .line 362
    filled-new-array {p1, v1}, [Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object p1

    .line 366
    const-string v1, "Module \"%s\" (sessionId %d) install successfully."

    .line 367
    .line 368
    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object p1

    .line 372
    invoke-static {v2, p1}, Lio/flutter/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    iget-object p1, p0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    .line 376
    .line 377
    invoke-static {p1}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->access$100(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)Landroid/util/SparseIntArray;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    invoke-virtual {v1, v0}, Landroid/util/SparseIntArray;->get(I)I

    .line 382
    .line 383
    .line 384
    move-result v1

    .line 385
    iget-object v2, p0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    .line 386
    .line 387
    invoke-static {v2}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->access$000(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)Landroid/util/SparseArray;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v2

    .line 395
    check-cast v2, Ljava/lang/String;

    .line 396
    .line 397
    invoke-virtual {p1, v1, v2}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->loadAssets(ILjava/lang/String;)V

    .line 398
    .line 399
    .line 400
    iget-object p1, p0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    .line 401
    .line 402
    invoke-static {p1}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->access$100(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)Landroid/util/SparseIntArray;

    .line 403
    .line 404
    .line 405
    move-result-object p1

    .line 406
    invoke-virtual {p1, v0}, Landroid/util/SparseIntArray;->get(I)I

    .line 407
    .line 408
    .line 409
    move-result p1

    .line 410
    if-lez p1, :cond_2

    .line 411
    .line 412
    iget-object p1, p0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    .line 413
    .line 414
    invoke-static {p1}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->access$100(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)Landroid/util/SparseIntArray;

    .line 415
    .line 416
    .line 417
    move-result-object v1

    .line 418
    invoke-virtual {v1, v0}, Landroid/util/SparseIntArray;->get(I)I

    .line 419
    .line 420
    .line 421
    move-result v1

    .line 422
    iget-object v2, p0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    .line 423
    .line 424
    invoke-static {v2}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->access$000(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)Landroid/util/SparseArray;

    .line 425
    .line 426
    .line 427
    move-result-object v2

    .line 428
    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v2

    .line 432
    check-cast v2, Ljava/lang/String;

    .line 433
    .line 434
    invoke-virtual {p1, v1, v2}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->loadDartLibrary(ILjava/lang/String;)V

    .line 435
    .line 436
    .line 437
    :cond_2
    iget-object p1, p0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    .line 438
    .line 439
    invoke-static {p1}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->access$300(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel;

    .line 440
    .line 441
    .line 442
    move-result-object p1

    .line 443
    if-eqz p1, :cond_3

    .line 444
    .line 445
    iget-object p1, p0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    .line 446
    .line 447
    invoke-static {p1}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->access$300(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel;

    .line 448
    .line 449
    .line 450
    move-result-object p1

    .line 451
    iget-object v1, p0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    .line 452
    .line 453
    invoke-static {v1}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->access$000(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)Landroid/util/SparseArray;

    .line 454
    .line 455
    .line 456
    move-result-object v1

    .line 457
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v1

    .line 461
    check-cast v1, Ljava/lang/String;

    .line 462
    .line 463
    invoke-virtual {p1, v1}, Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel;->completeInstallSuccess(Ljava/lang/String;)V

    .line 464
    .line 465
    .line 466
    :cond_3
    iget-object p1, p0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    .line 467
    .line 468
    invoke-static {p1}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->access$000(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)Landroid/util/SparseArray;

    .line 469
    .line 470
    .line 471
    move-result-object p1

    .line 472
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->delete(I)V

    .line 473
    .line 474
    .line 475
    iget-object p1, p0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    .line 476
    .line 477
    invoke-static {p1}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->access$100(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)Landroid/util/SparseIntArray;

    .line 478
    .line 479
    .line 480
    move-result-object p1

    .line 481
    invoke-virtual {p1, v0}, Landroid/util/SparseIntArray;->delete(I)V

    .line 482
    .line 483
    .line 484
    iget-object p0, p0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    .line 485
    .line 486
    invoke-static {p0}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->access$400(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)Landroid/util/SparseArray;

    .line 487
    .line 488
    .line 489
    move-result-object p0

    .line 490
    const-string p1, "installed"

    .line 491
    .line 492
    invoke-virtual {p0, v0, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 493
    .line 494
    .line 495
    return-void

    .line 496
    :pswitch_5
    iget-object p1, p0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    .line 497
    .line 498
    invoke-static {p1}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->access$000(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)Landroid/util/SparseArray;

    .line 499
    .line 500
    .line 501
    move-result-object p1

    .line 502
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object p1

    .line 506
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 507
    .line 508
    .line 509
    move-result-object v1

    .line 510
    filled-new-array {p1, v1}, [Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object p1

    .line 514
    const-string v1, "Module \"%s\" (sessionId %d) installing."

    .line 515
    .line 516
    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 517
    .line 518
    .line 519
    move-result-object p1

    .line 520
    invoke-static {v2, p1}, Lio/flutter/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 521
    .line 522
    .line 523
    iget-object p0, p0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    .line 524
    .line 525
    invoke-static {p0}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->access$400(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)Landroid/util/SparseArray;

    .line 526
    .line 527
    .line 528
    move-result-object p0

    .line 529
    const-string p1, "installing"

    .line 530
    .line 531
    invoke-virtual {p0, v0, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 532
    .line 533
    .line 534
    return-void

    .line 535
    :pswitch_6
    iget-object p1, p0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    .line 536
    .line 537
    invoke-static {p1}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->access$000(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)Landroid/util/SparseArray;

    .line 538
    .line 539
    .line 540
    move-result-object p1

    .line 541
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 542
    .line 543
    .line 544
    move-result-object p1

    .line 545
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 546
    .line 547
    .line 548
    move-result-object v1

    .line 549
    filled-new-array {p1, v1}, [Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    move-result-object p1

    .line 553
    const-string v1, "Module \"%s\" (sessionId %d) downloaded."

    .line 554
    .line 555
    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 556
    .line 557
    .line 558
    move-result-object p1

    .line 559
    invoke-static {v2, p1}, Lio/flutter/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 560
    .line 561
    .line 562
    iget-object p0, p0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    .line 563
    .line 564
    invoke-static {p0}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->access$400(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)Landroid/util/SparseArray;

    .line 565
    .line 566
    .line 567
    move-result-object p0

    .line 568
    const-string p1, "downloaded"

    .line 569
    .line 570
    invoke-virtual {p0, v0, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 571
    .line 572
    .line 573
    return-void

    .line 574
    :pswitch_7
    iget-object p1, p0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    .line 575
    .line 576
    invoke-static {p1}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->access$000(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)Landroid/util/SparseArray;

    .line 577
    .line 578
    .line 579
    move-result-object p1

    .line 580
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    move-result-object p1

    .line 584
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 585
    .line 586
    .line 587
    move-result-object v1

    .line 588
    filled-new-array {p1, v1}, [Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object p1

    .line 592
    const-string v1, "Module \"%s\" (sessionId %d) downloading."

    .line 593
    .line 594
    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 595
    .line 596
    .line 597
    move-result-object p1

    .line 598
    invoke-static {v2, p1}, Lio/flutter/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 599
    .line 600
    .line 601
    iget-object p0, p0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    .line 602
    .line 603
    invoke-static {p0}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->access$400(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)Landroid/util/SparseArray;

    .line 604
    .line 605
    .line 606
    move-result-object p0

    .line 607
    const-string p1, "downloading"

    .line 608
    .line 609
    invoke-virtual {p0, v0, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 610
    .line 611
    .line 612
    return-void

    .line 613
    :pswitch_8
    iget-object p1, p0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    .line 614
    .line 615
    invoke-static {p1}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->access$000(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)Landroid/util/SparseArray;

    .line 616
    .line 617
    .line 618
    move-result-object p1

    .line 619
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object p1

    .line 623
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 624
    .line 625
    .line 626
    move-result-object v1

    .line 627
    filled-new-array {p1, v1}, [Ljava/lang/Object;

    .line 628
    .line 629
    .line 630
    move-result-object p1

    .line 631
    const-string v1, "Module \"%s\" (sessionId %d) install pending."

    .line 632
    .line 633
    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 634
    .line 635
    .line 636
    move-result-object p1

    .line 637
    invoke-static {v2, p1}, Lio/flutter/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 638
    .line 639
    .line 640
    iget-object p0, p0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->this$0:Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    .line 641
    .line 642
    invoke-static {p0}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;->access$400(Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;)Landroid/util/SparseArray;

    .line 643
    .line 644
    .line 645
    move-result-object p0

    .line 646
    const-string p1, "pending"

    .line 647
    .line 648
    invoke-virtual {p0, v0, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 649
    .line 650
    .line 651
    :cond_4
    return-void

    nop

    .line 652
    .line 653
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic onStateUpdate(Ljava/lang/Object;)V
    .locals 0

    .line 653
    check-cast p1, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;

    invoke-virtual {p0, p1}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener;->onStateUpdate(Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;)V

    return-void
.end method
