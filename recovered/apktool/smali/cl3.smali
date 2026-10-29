.class public final Lcl3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcl3;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static a(Lcom/google/android/gms/common/internal/GetServiceRequest;Landroid/os/Parcel;I)V
    .locals 5

    .line 1
    const/16 v0, 0x4f45

    .line 2
    .line 3
    invoke-static {v0, p1}, Lw11;->c0(ILandroid/os/Parcel;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->a:I

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x4

    .line 11
    invoke-static {p1, v2, v3}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 15
    .line 16
    .line 17
    iget v1, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->b:I

    .line 18
    .line 19
    const/4 v2, 0x2

    .line 20
    invoke-static {p1, v2, v3}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 24
    .line 25
    .line 26
    iget v1, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->c:I

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    invoke-static {p1, v2, v3}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->d:Ljava/lang/String;

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    invoke-static {p1, v3, v1, v2}, Lw11;->T(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 39
    .line 40
    .line 41
    const/4 v1, 0x5

    .line 42
    iget-object v4, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->e:Landroid/os/IBinder;

    .line 43
    .line 44
    invoke-static {p1, v1, v4}, Lw11;->O(Landroid/os/Parcel;ILandroid/os/IBinder;)V

    .line 45
    .line 46
    .line 47
    const/4 v1, 0x6

    .line 48
    iget-object v4, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->f:[Lcom/google/android/gms/common/api/Scope;

    .line 49
    .line 50
    invoke-static {p1, v1, v4, p2}, Lw11;->W(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    .line 51
    .line 52
    .line 53
    const/4 v1, 0x7

    .line 54
    iget-object v4, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->i:Landroid/os/Bundle;

    .line 55
    .line 56
    invoke-static {p1, v1, v4, v2}, Lw11;->L(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V

    .line 57
    .line 58
    .line 59
    const/16 v1, 0x8

    .line 60
    .line 61
    iget-object v4, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->v:Landroid/accounts/Account;

    .line 62
    .line 63
    invoke-static {p1, v1, v4, p2, v2}, Lw11;->S(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 64
    .line 65
    .line 66
    const/16 v1, 0xa

    .line 67
    .line 68
    iget-object v4, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->w:[Lcom/google/android/gms/common/Feature;

    .line 69
    .line 70
    invoke-static {p1, v1, v4, p2}, Lw11;->W(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    .line 71
    .line 72
    .line 73
    const/16 v1, 0xb

    .line 74
    .line 75
    iget-object v4, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->U:[Lcom/google/android/gms/common/Feature;

    .line 76
    .line 77
    invoke-static {p1, v1, v4, p2}, Lw11;->W(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    .line 78
    .line 79
    .line 80
    iget-boolean p2, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->V:Z

    .line 81
    .line 82
    const/16 v1, 0xc

    .line 83
    .line 84
    invoke-static {p1, v1, v3}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 88
    .line 89
    .line 90
    iget p2, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->W:I

    .line 91
    .line 92
    const/16 v1, 0xd

    .line 93
    .line 94
    invoke-static {p1, v1, v3}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 98
    .line 99
    .line 100
    iget-boolean p2, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->X:Z

    .line 101
    .line 102
    const/16 v1, 0xe

    .line 103
    .line 104
    invoke-static {p1, v1, v3}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 108
    .line 109
    .line 110
    const/16 p2, 0xf

    .line 111
    .line 112
    iget-object p0, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->Y:Ljava/lang/String;

    .line 113
    .line 114
    invoke-static {p1, p2, p0, v2}, Lw11;->T(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 115
    .line 116
    .line 117
    invoke-static {v0, p1}, Lw11;->f0(ILandroid/os/Parcel;)V

    .line 118
    .line 119
    .line 120
    return-void
.end method

.method public static b(Lcom/google/android/gms/measurement/internal/zzpk;Landroid/os/Parcel;)V
    .locals 7

    .line 1
    iget v0, p0, Lcom/google/android/gms/measurement/internal/zzpk;->a:I

    .line 2
    .line 3
    const/16 v1, 0x4f45

    .line 4
    .line 5
    invoke-static {v1, p1}, Lw11;->c0(ILandroid/os/Parcel;)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x4

    .line 11
    invoke-static {p1, v2, v3}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzpk;->b:Ljava/lang/String;

    .line 18
    .line 19
    const/4 v2, 0x2

    .line 20
    const/4 v4, 0x0

    .line 21
    invoke-static {p1, v2, v0, v4}, Lw11;->T(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 22
    .line 23
    .line 24
    iget-wide v5, p0, Lcom/google/android/gms/measurement/internal/zzpk;->c:J

    .line 25
    .line 26
    const/4 v0, 0x3

    .line 27
    const/16 v2, 0x8

    .line 28
    .line 29
    invoke-static {p1, v0, v2}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v5, v6}, Landroid/os/Parcel;->writeLong(J)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzpk;->d:Ljava/lang/Long;

    .line 36
    .line 37
    invoke-static {p1, v3, v0}, Lw11;->R(Landroid/os/Parcel;ILjava/lang/Long;)V

    .line 38
    .line 39
    .line 40
    const/4 v0, 0x6

    .line 41
    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/zzpk;->e:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {p1, v0, v3, v4}, Lw11;->T(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x7

    .line 47
    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/zzpk;->f:Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {p1, v0, v3, v4}, Lw11;->T(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 50
    .line 51
    .line 52
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/zzpk;->i:Ljava/lang/Double;

    .line 53
    .line 54
    invoke-static {p1, v2, p0}, Lw11;->N(Landroid/os/Parcel;ILjava/lang/Double;)V

    .line 55
    .line 56
    .line 57
    invoke-static {v1, p1}, Lw11;->f0(ILandroid/os/Parcel;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 39

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v0, v0, Lcl3;->a:I

    .line 6
    .line 7
    const/4 v2, 0x5

    .line 8
    const/4 v5, 0x4

    .line 9
    const/4 v6, 0x3

    .line 10
    const/4 v7, 0x1

    .line 11
    const/4 v9, 0x2

    .line 12
    const/4 v10, 0x0

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v2, 0x0

    .line 21
    const/4 v8, 0x0

    .line 22
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-ge v3, v0, :cond_2

    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    int-to-char v4, v3

    .line 33
    if-eq v4, v7, :cond_1

    .line 34
    .line 35
    if-eq v4, v9, :cond_0

    .line 36
    .line 37
    invoke-static {v3, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-static {v3, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    invoke-static {v3, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    move v8, v3

    .line 51
    goto :goto_0

    .line 52
    :cond_2
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 53
    .line 54
    .line 55
    new-instance v0, Lcom/google/android/gms/location/DetectedActivity;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 58
    .line 59
    .line 60
    iput v8, v0, Lcom/google/android/gms/location/DetectedActivity;->a:I

    .line 61
    .line 62
    iput v2, v0, Lcom/google/android/gms/location/DetectedActivity;->b:I

    .line 63
    .line 64
    return-object v0

    .line 65
    :pswitch_0
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    const/4 v11, 0x0

    .line 70
    const-wide/16 v12, 0x0

    .line 71
    .line 72
    const-wide/16 v14, 0x0

    .line 73
    .line 74
    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-ge v2, v0, :cond_6

    .line 79
    .line 80
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    int-to-char v3, v2

    .line 85
    if-eq v3, v7, :cond_5

    .line 86
    .line 87
    if-eq v3, v9, :cond_4

    .line 88
    .line 89
    if-eq v3, v6, :cond_3

    .line 90
    .line 91
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 96
    .line 97
    .line 98
    move-result-wide v2

    .line 99
    move-wide v14, v2

    .line 100
    goto :goto_1

    .line 101
    :cond_4
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 102
    .line 103
    .line 104
    move-result-wide v2

    .line 105
    move-wide v12, v2

    .line 106
    goto :goto_1

    .line 107
    :cond_5
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    move v11, v2

    .line 112
    goto :goto_1

    .line 113
    :cond_6
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 114
    .line 115
    .line 116
    new-instance v10, Lcom/google/android/gms/games/PlayerLevel;

    .line 117
    .line 118
    invoke-direct/range {v10 .. v15}, Lcom/google/android/gms/games/PlayerLevel;-><init>(IJJ)V

    .line 119
    .line 120
    .line 121
    return-object v10

    .line 122
    :pswitch_1
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    const/4 v2, -0x1

    .line 127
    const-wide/16 v3, 0x0

    .line 128
    .line 129
    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 130
    .line 131
    .line 132
    move-result v7

    .line 133
    if-ge v7, v0, :cond_a

    .line 134
    .line 135
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 136
    .line 137
    .line 138
    move-result v7

    .line 139
    int-to-char v8, v7

    .line 140
    if-eq v8, v9, :cond_9

    .line 141
    .line 142
    if-eq v8, v6, :cond_8

    .line 143
    .line 144
    if-eq v8, v5, :cond_7

    .line 145
    .line 146
    invoke-static {v7, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 147
    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_7
    invoke-static {v7, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    goto :goto_2

    .line 155
    :cond_8
    invoke-static {v7, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 156
    .line 157
    .line 158
    move-result-wide v3

    .line 159
    goto :goto_2

    .line 160
    :cond_9
    invoke-static {v7, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v10

    .line 164
    goto :goto_2

    .line 165
    :cond_a
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 166
    .line 167
    .line 168
    new-instance v0, Lcom/google/android/gms/drive/metadata/internal/zzq;

    .line 169
    .line 170
    invoke-direct {v0, v10, v3, v4, v2}, Lcom/google/android/gms/drive/metadata/internal/zzq;-><init>(Ljava/lang/String;JI)V

    .line 171
    .line 172
    .line 173
    return-object v0

    .line 174
    :pswitch_2
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    if-ge v2, v0, :cond_c

    .line 183
    .line 184
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    int-to-char v3, v2

    .line 189
    if-eq v3, v7, :cond_b

    .line 190
    .line 191
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 192
    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_b
    sget-object v3, Lcom/google/android/gms/fido/fido2/api/common/zzn;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 196
    .line 197
    invoke-static {v1, v2, v3}, Lqj3;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 198
    .line 199
    .line 200
    move-result-object v10

    .line 201
    goto :goto_3

    .line 202
    :cond_c
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 203
    .line 204
    .line 205
    new-instance v0, Lcom/google/android/gms/fido/fido2/api/common/zzp;

    .line 206
    .line 207
    invoke-direct {v0, v10}, Lcom/google/android/gms/fido/fido2/api/common/zzp;-><init>(Ljava/util/ArrayList;)V

    .line 208
    .line 209
    .line 210
    return-object v0

    .line 211
    :pswitch_3
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    move-object v12, v10

    .line 216
    move-object v15, v12

    .line 217
    const/4 v13, 0x0

    .line 218
    const/4 v14, 0x0

    .line 219
    const/16 v16, 0x0

    .line 220
    .line 221
    const/16 v17, 0x0

    .line 222
    .line 223
    const/16 v18, 0x0

    .line 224
    .line 225
    :goto_4
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    if-ge v2, v0, :cond_d

    .line 230
    .line 231
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 232
    .line 233
    .line 234
    move-result v2

    .line 235
    int-to-char v3, v2

    .line 236
    packed-switch v3, :pswitch_data_1

    .line 237
    .line 238
    .line 239
    :pswitch_4
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 240
    .line 241
    .line 242
    goto :goto_4

    .line 243
    :pswitch_5
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 244
    .line 245
    .line 246
    move-result v18

    .line 247
    goto :goto_4

    .line 248
    :pswitch_6
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 249
    .line 250
    .line 251
    move-result v17

    .line 252
    goto :goto_4

    .line 253
    :pswitch_7
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 254
    .line 255
    .line 256
    move-result v16

    .line 257
    goto :goto_4

    .line 258
    :pswitch_8
    invoke-static {v2, v1}, Lqj3;->C(ILandroid/os/Parcel;)Landroid/os/IBinder;

    .line 259
    .line 260
    .line 261
    move-result-object v15

    .line 262
    goto :goto_4

    .line 263
    :pswitch_9
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 264
    .line 265
    .line 266
    move-result v14

    .line 267
    goto :goto_4

    .line 268
    :pswitch_a
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 269
    .line 270
    .line 271
    move-result v13

    .line 272
    goto :goto_4

    .line 273
    :pswitch_b
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v12

    .line 277
    goto :goto_4

    .line 278
    :cond_d
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 279
    .line 280
    .line 281
    new-instance v11, Lcom/google/android/gms/common/zzp;

    .line 282
    .line 283
    invoke-direct/range {v11 .. v18}, Lcom/google/android/gms/common/zzp;-><init>(Ljava/lang/String;ZZLandroid/os/IBinder;ZZZ)V

    .line 284
    .line 285
    .line 286
    return-object v11

    .line 287
    :pswitch_c
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    move-object v13, v10

    .line 292
    move-object/from16 v16, v13

    .line 293
    .line 294
    move-object/from16 v17, v16

    .line 295
    .line 296
    move-object/from16 v18, v17

    .line 297
    .line 298
    move-object/from16 v19, v18

    .line 299
    .line 300
    move-object/from16 v20, v19

    .line 301
    .line 302
    const/4 v12, 0x0

    .line 303
    const-wide/16 v14, 0x0

    .line 304
    .line 305
    :goto_5
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 306
    .line 307
    .line 308
    move-result v2

    .line 309
    if-ge v2, v0, :cond_f

    .line 310
    .line 311
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 312
    .line 313
    .line 314
    move-result v2

    .line 315
    int-to-char v3, v2

    .line 316
    packed-switch v3, :pswitch_data_2

    .line 317
    .line 318
    .line 319
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 320
    .line 321
    .line 322
    goto :goto_5

    .line 323
    :pswitch_d
    invoke-static {v2, v1}, Lqj3;->A(ILandroid/os/Parcel;)Ljava/lang/Double;

    .line 324
    .line 325
    .line 326
    move-result-object v20

    .line 327
    goto :goto_5

    .line 328
    :pswitch_e
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v19

    .line 332
    goto :goto_5

    .line 333
    :pswitch_f
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v18

    .line 337
    goto :goto_5

    .line 338
    :pswitch_10
    invoke-static {v2, v1}, Lqj3;->H(ILandroid/os/Parcel;)I

    .line 339
    .line 340
    .line 341
    move-result v2

    .line 342
    if-nez v2, :cond_e

    .line 343
    .line 344
    move-object/from16 v17, v10

    .line 345
    .line 346
    goto :goto_5

    .line 347
    :cond_e
    invoke-static {v1, v2, v5}, Lqj3;->U(Landroid/os/Parcel;II)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v1}, Landroid/os/Parcel;->readFloat()F

    .line 351
    .line 352
    .line 353
    move-result v2

    .line 354
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 355
    .line 356
    .line 357
    move-result-object v2

    .line 358
    move-object/from16 v17, v2

    .line 359
    .line 360
    goto :goto_5

    .line 361
    :pswitch_11
    invoke-static {v2, v1}, Lqj3;->G(ILandroid/os/Parcel;)Ljava/lang/Long;

    .line 362
    .line 363
    .line 364
    move-result-object v16

    .line 365
    goto :goto_5

    .line 366
    :pswitch_12
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 367
    .line 368
    .line 369
    move-result-wide v2

    .line 370
    move-wide v14, v2

    .line 371
    goto :goto_5

    .line 372
    :pswitch_13
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v13

    .line 376
    goto :goto_5

    .line 377
    :pswitch_14
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 378
    .line 379
    .line 380
    move-result v2

    .line 381
    move v12, v2

    .line 382
    goto :goto_5

    .line 383
    :cond_f
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 384
    .line 385
    .line 386
    new-instance v11, Lcom/google/android/gms/measurement/internal/zzpk;

    .line 387
    .line 388
    invoke-direct/range {v11 .. v20}, Lcom/google/android/gms/measurement/internal/zzpk;-><init>(ILjava/lang/String;JLjava/lang/Long;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V

    .line 389
    .line 390
    .line 391
    return-object v11

    .line 392
    :pswitch_15
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 393
    .line 394
    .line 395
    move-result v0

    .line 396
    move-object v2, v10

    .line 397
    :goto_6
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 398
    .line 399
    .line 400
    move-result v3

    .line 401
    if-ge v3, v0, :cond_12

    .line 402
    .line 403
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 404
    .line 405
    .line 406
    move-result v3

    .line 407
    int-to-char v4, v3

    .line 408
    if-eq v4, v7, :cond_11

    .line 409
    .line 410
    if-eq v4, v9, :cond_10

    .line 411
    .line 412
    invoke-static {v3, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 413
    .line 414
    .line 415
    goto :goto_6

    .line 416
    :cond_10
    invoke-static {v3, v1}, Lqj3;->f(ILandroid/os/Parcel;)Landroid/os/Bundle;

    .line 417
    .line 418
    .line 419
    move-result-object v2

    .line 420
    goto :goto_6

    .line 421
    :cond_11
    sget-object v4, Lcom/google/android/gms/location/ActivityTransitionEvent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 422
    .line 423
    invoke-static {v1, v3, v4}, Lqj3;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 424
    .line 425
    .line 426
    move-result-object v3

    .line 427
    move-object v10, v3

    .line 428
    goto :goto_6

    .line 429
    :cond_12
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 430
    .line 431
    .line 432
    new-instance v0, Lcom/google/android/gms/location/ActivityTransitionResult;

    .line 433
    .line 434
    invoke-direct {v0, v10, v2}, Lcom/google/android/gms/location/ActivityTransitionResult;-><init>(Ljava/util/ArrayList;Landroid/os/Bundle;)V

    .line 435
    .line 436
    .line 437
    return-object v0

    .line 438
    :pswitch_16
    invoke-static {}, Lcom/google/android/gms/common/internal/DowngradeableSafeParcel;->E1()V

    .line 439
    .line 440
    .line 441
    invoke-static {}, Lcom/google/android/gms/common/internal/DowngradeableSafeParcel;->D1()V

    .line 442
    .line 443
    .line 444
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 445
    .line 446
    .line 447
    move-result v0

    .line 448
    const-wide/16 v5, -0x1

    .line 449
    .line 450
    move-wide/from16 v34, v5

    .line 451
    .line 452
    move-object v12, v10

    .line 453
    move-object v13, v12

    .line 454
    move-object v14, v13

    .line 455
    move-object v15, v14

    .line 456
    move-object/from16 v21, v15

    .line 457
    .line 458
    move-object/from16 v22, v21

    .line 459
    .line 460
    move-object/from16 v23, v22

    .line 461
    .line 462
    move-object/from16 v24, v23

    .line 463
    .line 464
    move-object/from16 v25, v24

    .line 465
    .line 466
    move-object/from16 v28, v25

    .line 467
    .line 468
    move-object/from16 v29, v28

    .line 469
    .line 470
    move-object/from16 v30, v29

    .line 471
    .line 472
    move-object/from16 v31, v30

    .line 473
    .line 474
    move-object/from16 v32, v31

    .line 475
    .line 476
    move-object/from16 v33, v32

    .line 477
    .line 478
    move-object/from16 v36, v33

    .line 479
    .line 480
    move-object/from16 v37, v36

    .line 481
    .line 482
    const-wide/16 v16, 0x0

    .line 483
    .line 484
    const/16 v18, 0x0

    .line 485
    .line 486
    const-wide/16 v19, 0x0

    .line 487
    .line 488
    const/16 v26, 0x0

    .line 489
    .line 490
    const/16 v27, 0x0

    .line 491
    .line 492
    const/16 v38, 0x0

    .line 493
    .line 494
    :goto_7
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 495
    .line 496
    .line 497
    move-result v2

    .line 498
    if-ge v2, v0, :cond_17

    .line 499
    .line 500
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 501
    .line 502
    .line 503
    move-result v2

    .line 504
    int-to-char v3, v2

    .line 505
    const/16 v4, 0x1d

    .line 506
    .line 507
    if-eq v3, v4, :cond_16

    .line 508
    .line 509
    const/16 v4, 0x21

    .line 510
    .line 511
    if-eq v3, v4, :cond_15

    .line 512
    .line 513
    const/16 v4, 0x23

    .line 514
    .line 515
    if-eq v3, v4, :cond_14

    .line 516
    .line 517
    const/16 v4, 0x24

    .line 518
    .line 519
    if-eq v3, v4, :cond_13

    .line 520
    .line 521
    packed-switch v3, :pswitch_data_3

    .line 522
    .line 523
    .line 524
    packed-switch v3, :pswitch_data_4

    .line 525
    .line 526
    .line 527
    packed-switch v3, :pswitch_data_5

    .line 528
    .line 529
    .line 530
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 531
    .line 532
    .line 533
    goto :goto_7

    .line 534
    :pswitch_17
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 535
    .line 536
    .line 537
    move-result-object v2

    .line 538
    move-object/from16 v33, v2

    .line 539
    .line 540
    goto :goto_7

    .line 541
    :pswitch_18
    sget-object v3, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 542
    .line 543
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 544
    .line 545
    .line 546
    move-result-object v2

    .line 547
    check-cast v2, Landroid/net/Uri;

    .line 548
    .line 549
    move-object/from16 v32, v2

    .line 550
    .line 551
    goto :goto_7

    .line 552
    :pswitch_19
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 553
    .line 554
    .line 555
    move-result-object v2

    .line 556
    move-object/from16 v31, v2

    .line 557
    .line 558
    goto :goto_7

    .line 559
    :pswitch_1a
    sget-object v3, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 560
    .line 561
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 562
    .line 563
    .line 564
    move-result-object v2

    .line 565
    check-cast v2, Landroid/net/Uri;

    .line 566
    .line 567
    move-object/from16 v30, v2

    .line 568
    .line 569
    goto :goto_7

    .line 570
    :pswitch_1b
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 571
    .line 572
    .line 573
    move-result-object v2

    .line 574
    move-object/from16 v29, v2

    .line 575
    .line 576
    goto :goto_7

    .line 577
    :pswitch_1c
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v2

    .line 581
    move-object/from16 v28, v2

    .line 582
    .line 583
    goto :goto_7

    .line 584
    :pswitch_1d
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 585
    .line 586
    .line 587
    move-result v2

    .line 588
    move/from16 v27, v2

    .line 589
    .line 590
    goto :goto_7

    .line 591
    :pswitch_1e
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 592
    .line 593
    .line 594
    move-result v2

    .line 595
    move/from16 v26, v2

    .line 596
    .line 597
    goto :goto_7

    .line 598
    :pswitch_1f
    sget-object v3, Lcom/google/android/gms/games/PlayerLevelInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 599
    .line 600
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 601
    .line 602
    .line 603
    move-result-object v2

    .line 604
    check-cast v2, Lcom/google/android/gms/games/PlayerLevelInfo;

    .line 605
    .line 606
    move-object/from16 v25, v2

    .line 607
    .line 608
    goto :goto_7

    .line 609
    :pswitch_20
    sget-object v3, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 610
    .line 611
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 612
    .line 613
    .line 614
    move-result-object v2

    .line 615
    check-cast v2, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;

    .line 616
    .line 617
    move-object/from16 v24, v2

    .line 618
    .line 619
    goto :goto_7

    .line 620
    :pswitch_21
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 621
    .line 622
    .line 623
    move-result-object v2

    .line 624
    move-object/from16 v23, v2

    .line 625
    .line 626
    goto/16 :goto_7

    .line 627
    .line 628
    :pswitch_22
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 629
    .line 630
    .line 631
    move-result-object v2

    .line 632
    move-object/from16 v22, v2

    .line 633
    .line 634
    goto/16 :goto_7

    .line 635
    .line 636
    :pswitch_23
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 637
    .line 638
    .line 639
    move-result-object v2

    .line 640
    move-object/from16 v21, v2

    .line 641
    .line 642
    goto/16 :goto_7

    .line 643
    .line 644
    :pswitch_24
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 645
    .line 646
    .line 647
    move-result-wide v2

    .line 648
    move-wide/from16 v19, v2

    .line 649
    .line 650
    goto/16 :goto_7

    .line 651
    .line 652
    :pswitch_25
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 653
    .line 654
    .line 655
    move-result v2

    .line 656
    move/from16 v18, v2

    .line 657
    .line 658
    goto/16 :goto_7

    .line 659
    .line 660
    :pswitch_26
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 661
    .line 662
    .line 663
    move-result-wide v2

    .line 664
    move-wide/from16 v16, v2

    .line 665
    .line 666
    goto/16 :goto_7

    .line 667
    .line 668
    :pswitch_27
    sget-object v3, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 669
    .line 670
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 671
    .line 672
    .line 673
    move-result-object v2

    .line 674
    check-cast v2, Landroid/net/Uri;

    .line 675
    .line 676
    move-object v15, v2

    .line 677
    goto/16 :goto_7

    .line 678
    .line 679
    :pswitch_28
    sget-object v3, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 680
    .line 681
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 682
    .line 683
    .line 684
    move-result-object v2

    .line 685
    check-cast v2, Landroid/net/Uri;

    .line 686
    .line 687
    move-object v14, v2

    .line 688
    goto/16 :goto_7

    .line 689
    .line 690
    :pswitch_29
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 691
    .line 692
    .line 693
    move-result-object v2

    .line 694
    move-object v13, v2

    .line 695
    goto/16 :goto_7

    .line 696
    .line 697
    :pswitch_2a
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 698
    .line 699
    .line 700
    move-result-object v2

    .line 701
    move-object v12, v2

    .line 702
    goto/16 :goto_7

    .line 703
    .line 704
    :cond_13
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 705
    .line 706
    .line 707
    move-result v2

    .line 708
    move/from16 v38, v2

    .line 709
    .line 710
    goto/16 :goto_7

    .line 711
    .line 712
    :cond_14
    sget-object v3, Lcom/google/android/gms/games/zza;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 713
    .line 714
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 715
    .line 716
    .line 717
    move-result-object v2

    .line 718
    check-cast v2, Lcom/google/android/gms/games/zza;

    .line 719
    .line 720
    move-object/from16 v37, v2

    .line 721
    .line 722
    goto/16 :goto_7

    .line 723
    .line 724
    :cond_15
    sget-object v3, Lcom/google/android/gms/games/zzt;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 725
    .line 726
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 727
    .line 728
    .line 729
    move-result-object v2

    .line 730
    check-cast v2, Lcom/google/android/gms/games/zzt;

    .line 731
    .line 732
    move-object/from16 v36, v2

    .line 733
    .line 734
    goto/16 :goto_7

    .line 735
    .line 736
    :cond_16
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 737
    .line 738
    .line 739
    move-result-wide v2

    .line 740
    move-wide/from16 v34, v2

    .line 741
    .line 742
    goto/16 :goto_7

    .line 743
    .line 744
    :cond_17
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 745
    .line 746
    .line 747
    new-instance v11, Lcom/google/android/gms/games/PlayerEntity;

    .line 748
    .line 749
    invoke-direct/range {v11 .. v38}, Lcom/google/android/gms/games/PlayerEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;JIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;Lcom/google/android/gms/games/PlayerLevelInfo;ZZLjava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;JLcom/google/android/gms/games/zzt;Lcom/google/android/gms/games/zza;Z)V

    .line 750
    .line 751
    .line 752
    return-object v11

    .line 753
    :pswitch_2b
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 754
    .line 755
    .line 756
    move-result v0

    .line 757
    const/4 v2, 0x0

    .line 758
    const/4 v8, 0x0

    .line 759
    :goto_8
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 760
    .line 761
    .line 762
    move-result v3

    .line 763
    if-ge v3, v0, :cond_1b

    .line 764
    .line 765
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 766
    .line 767
    .line 768
    move-result v3

    .line 769
    int-to-char v4, v3

    .line 770
    if-eq v4, v9, :cond_1a

    .line 771
    .line 772
    if-eq v4, v6, :cond_19

    .line 773
    .line 774
    if-eq v4, v5, :cond_18

    .line 775
    .line 776
    invoke-static {v3, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 777
    .line 778
    .line 779
    goto :goto_8

    .line 780
    :cond_18
    invoke-static {v3, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 781
    .line 782
    .line 783
    move-result v2

    .line 784
    goto :goto_8

    .line 785
    :cond_19
    invoke-static {v3, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 786
    .line 787
    .line 788
    move-result v8

    .line 789
    goto :goto_8

    .line 790
    :cond_1a
    sget-object v4, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 791
    .line 792
    invoke-static {v1, v3, v4}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 793
    .line 794
    .line 795
    move-result-object v3

    .line 796
    move-object v10, v3

    .line 797
    check-cast v10, Lcom/google/android/gms/common/data/DataHolder;

    .line 798
    .line 799
    goto :goto_8

    .line 800
    :cond_1b
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 801
    .line 802
    .line 803
    new-instance v0, Lcom/google/android/gms/drive/events/zzo;

    .line 804
    .line 805
    invoke-direct {v0, v10, v8, v2}, Lcom/google/android/gms/drive/events/zzo;-><init>(Lcom/google/android/gms/common/data/DataHolder;ZI)V

    .line 806
    .line 807
    .line 808
    return-object v0

    .line 809
    :pswitch_2c
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 810
    .line 811
    .line 812
    move-result v0

    .line 813
    new-instance v12, Ljava/util/HashSet;

    .line 814
    .line 815
    invoke-direct {v12}, Ljava/util/HashSet;-><init>()V

    .line 816
    .line 817
    .line 818
    move-object v14, v10

    .line 819
    move-object/from16 v16, v14

    .line 820
    .line 821
    const/4 v13, 0x0

    .line 822
    const/4 v15, 0x0

    .line 823
    :goto_9
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 824
    .line 825
    .line 826
    move-result v2

    .line 827
    if-ge v2, v0, :cond_20

    .line 828
    .line 829
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 830
    .line 831
    .line 832
    move-result v2

    .line 833
    int-to-char v3, v2

    .line 834
    if-eq v3, v7, :cond_1f

    .line 835
    .line 836
    if-eq v3, v9, :cond_1e

    .line 837
    .line 838
    if-eq v3, v6, :cond_1d

    .line 839
    .line 840
    if-eq v3, v5, :cond_1c

    .line 841
    .line 842
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 843
    .line 844
    .line 845
    goto :goto_9

    .line 846
    :cond_1c
    sget-object v3, Lcom/google/android/gms/auth/api/accounttransfer/zzs;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 847
    .line 848
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 849
    .line 850
    .line 851
    move-result-object v2

    .line 852
    check-cast v2, Lcom/google/android/gms/auth/api/accounttransfer/zzs;

    .line 853
    .line 854
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 855
    .line 856
    .line 857
    move-result-object v3

    .line 858
    invoke-virtual {v12, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 859
    .line 860
    .line 861
    move-object/from16 v16, v2

    .line 862
    .line 863
    goto :goto_9

    .line 864
    :cond_1d
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 865
    .line 866
    .line 867
    move-result v2

    .line 868
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 869
    .line 870
    .line 871
    move-result-object v3

    .line 872
    invoke-virtual {v12, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 873
    .line 874
    .line 875
    move v15, v2

    .line 876
    goto :goto_9

    .line 877
    :cond_1e
    sget-object v3, Lcom/google/android/gms/auth/api/accounttransfer/zzu;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 878
    .line 879
    invoke-static {v1, v2, v3}, Lqj3;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 880
    .line 881
    .line 882
    move-result-object v2

    .line 883
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 884
    .line 885
    .line 886
    move-result-object v3

    .line 887
    invoke-virtual {v12, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 888
    .line 889
    .line 890
    move-object v14, v2

    .line 891
    goto :goto_9

    .line 892
    :cond_1f
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 893
    .line 894
    .line 895
    move-result v2

    .line 896
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 897
    .line 898
    .line 899
    move-result-object v3

    .line 900
    invoke-virtual {v12, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 901
    .line 902
    .line 903
    move v13, v2

    .line 904
    goto :goto_9

    .line 905
    :cond_20
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 906
    .line 907
    .line 908
    move-result v2

    .line 909
    if-ne v2, v0, :cond_21

    .line 910
    .line 911
    new-instance v11, Lcom/google/android/gms/auth/api/accounttransfer/zzo;

    .line 912
    .line 913
    invoke-direct/range {v11 .. v16}, Lcom/google/android/gms/auth/api/accounttransfer/zzo;-><init>(Ljava/util/HashSet;ILjava/util/ArrayList;ILcom/google/android/gms/auth/api/accounttransfer/zzs;)V

    .line 914
    .line 915
    .line 916
    return-object v11

    .line 917
    :cond_21
    new-instance v2, Lg62;

    .line 918
    .line 919
    const-string v3, "Overread allowed size end="

    .line 920
    .line 921
    invoke-static {v0, v3}, Lfm0;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 922
    .line 923
    .line 924
    move-result-object v0

    .line 925
    invoke-direct {v2, v0, v1}, Lg62;-><init>(Ljava/lang/String;Landroid/os/Parcel;)V

    .line 926
    .line 927
    .line 928
    throw v2

    .line 929
    :pswitch_2d
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 930
    .line 931
    .line 932
    move-result v0

    .line 933
    :goto_a
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 934
    .line 935
    .line 936
    move-result v2

    .line 937
    if-ge v2, v0, :cond_23

    .line 938
    .line 939
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 940
    .line 941
    .line 942
    move-result v2

    .line 943
    int-to-char v3, v2

    .line 944
    if-eq v3, v7, :cond_22

    .line 945
    .line 946
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 947
    .line 948
    .line 949
    goto :goto_a

    .line 950
    :cond_22
    sget-object v3, Lcom/google/android/gms/measurement/internal/zzol;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 951
    .line 952
    invoke-static {v1, v2, v3}, Lqj3;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 953
    .line 954
    .line 955
    move-result-object v10

    .line 956
    goto :goto_a

    .line 957
    :cond_23
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 958
    .line 959
    .line 960
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzop;

    .line 961
    .line 962
    invoke-direct {v0, v10}, Lcom/google/android/gms/measurement/internal/zzop;-><init>(Ljava/util/ArrayList;)V

    .line 963
    .line 964
    .line 965
    return-object v0

    .line 966
    :pswitch_2e
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 967
    .line 968
    .line 969
    move-result v0

    .line 970
    :goto_b
    move-object v2, v10

    .line 971
    :goto_c
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 972
    .line 973
    .line 974
    move-result v3

    .line 975
    if-ge v3, v0, :cond_27

    .line 976
    .line 977
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 978
    .line 979
    .line 980
    move-result v3

    .line 981
    int-to-char v4, v3

    .line 982
    if-eq v4, v7, :cond_24

    .line 983
    .line 984
    invoke-static {v3, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 985
    .line 986
    .line 987
    goto :goto_c

    .line 988
    :cond_24
    invoke-static {v3, v1}, Lqj3;->H(ILandroid/os/Parcel;)I

    .line 989
    .line 990
    .line 991
    move-result v2

    .line 992
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 993
    .line 994
    .line 995
    move-result v3

    .line 996
    if-nez v2, :cond_25

    .line 997
    .line 998
    goto :goto_b

    .line 999
    :cond_25
    new-instance v4, Ljava/util/ArrayList;

    .line 1000
    .line 1001
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1002
    .line 1003
    .line 1004
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1005
    .line 1006
    .line 1007
    move-result v5

    .line 1008
    const/4 v6, 0x0

    .line 1009
    :goto_d
    if-ge v6, v5, :cond_26

    .line 1010
    .line 1011
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1012
    .line 1013
    .line 1014
    move-result v9

    .line 1015
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v9

    .line 1019
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1020
    .line 1021
    .line 1022
    add-int/lit8 v6, v6, 0x1

    .line 1023
    .line 1024
    goto :goto_d

    .line 1025
    :cond_26
    add-int/2addr v3, v2

    .line 1026
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 1027
    .line 1028
    .line 1029
    move-object v2, v4

    .line 1030
    goto :goto_c

    .line 1031
    :cond_27
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1032
    .line 1033
    .line 1034
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzon;

    .line 1035
    .line 1036
    invoke-direct {v0, v2}, Lcom/google/android/gms/measurement/internal/zzon;-><init>(Ljava/util/ArrayList;)V

    .line 1037
    .line 1038
    .line 1039
    return-object v0

    .line 1040
    :pswitch_2f
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1041
    .line 1042
    .line 1043
    move-result v0

    .line 1044
    move-object v14, v10

    .line 1045
    move-object v15, v14

    .line 1046
    move-object/from16 v16, v15

    .line 1047
    .line 1048
    move-object/from16 v20, v16

    .line 1049
    .line 1050
    const-wide/16 v12, 0x0

    .line 1051
    .line 1052
    const/16 v17, 0x0

    .line 1053
    .line 1054
    const-wide/16 v18, 0x0

    .line 1055
    .line 1056
    :goto_e
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1057
    .line 1058
    .line 1059
    move-result v2

    .line 1060
    if-ge v2, v0, :cond_28

    .line 1061
    .line 1062
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1063
    .line 1064
    .line 1065
    move-result v2

    .line 1066
    int-to-char v3, v2

    .line 1067
    packed-switch v3, :pswitch_data_6

    .line 1068
    .line 1069
    .line 1070
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1071
    .line 1072
    .line 1073
    goto :goto_e

    .line 1074
    :pswitch_30
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v2

    .line 1078
    move-object/from16 v20, v2

    .line 1079
    .line 1080
    goto :goto_e

    .line 1081
    :pswitch_31
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 1082
    .line 1083
    .line 1084
    move-result-wide v2

    .line 1085
    move-wide/from16 v18, v2

    .line 1086
    .line 1087
    goto :goto_e

    .line 1088
    :pswitch_32
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1089
    .line 1090
    .line 1091
    move-result v2

    .line 1092
    move/from16 v17, v2

    .line 1093
    .line 1094
    goto :goto_e

    .line 1095
    :pswitch_33
    invoke-static {v2, v1}, Lqj3;->f(ILandroid/os/Parcel;)Landroid/os/Bundle;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v2

    .line 1099
    move-object/from16 v16, v2

    .line 1100
    .line 1101
    goto :goto_e

    .line 1102
    :pswitch_34
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v2

    .line 1106
    move-object v15, v2

    .line 1107
    goto :goto_e

    .line 1108
    :pswitch_35
    invoke-static {v2, v1}, Lqj3;->g(ILandroid/os/Parcel;)[B

    .line 1109
    .line 1110
    .line 1111
    move-result-object v2

    .line 1112
    move-object v14, v2

    .line 1113
    goto :goto_e

    .line 1114
    :pswitch_36
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 1115
    .line 1116
    .line 1117
    move-result-wide v2

    .line 1118
    move-wide v12, v2

    .line 1119
    goto :goto_e

    .line 1120
    :cond_28
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1121
    .line 1122
    .line 1123
    new-instance v11, Lcom/google/android/gms/measurement/internal/zzol;

    .line 1124
    .line 1125
    invoke-direct/range {v11 .. v20}, Lcom/google/android/gms/measurement/internal/zzol;-><init>(J[BLjava/lang/String;Landroid/os/Bundle;IJLjava/lang/String;)V

    .line 1126
    .line 1127
    .line 1128
    return-object v11

    .line 1129
    :pswitch_37
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1130
    .line 1131
    .line 1132
    move-result v0

    .line 1133
    const-wide/16 v3, 0x0

    .line 1134
    .line 1135
    const/4 v8, 0x0

    .line 1136
    :goto_f
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1137
    .line 1138
    .line 1139
    move-result v2

    .line 1140
    if-ge v2, v0, :cond_2c

    .line 1141
    .line 1142
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1143
    .line 1144
    .line 1145
    move-result v2

    .line 1146
    int-to-char v5, v2

    .line 1147
    if-eq v5, v7, :cond_2b

    .line 1148
    .line 1149
    if-eq v5, v9, :cond_2a

    .line 1150
    .line 1151
    if-eq v5, v6, :cond_29

    .line 1152
    .line 1153
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1154
    .line 1155
    .line 1156
    goto :goto_f

    .line 1157
    :cond_29
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1158
    .line 1159
    .line 1160
    move-result v2

    .line 1161
    move v8, v2

    .line 1162
    goto :goto_f

    .line 1163
    :cond_2a
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 1164
    .line 1165
    .line 1166
    move-result-wide v2

    .line 1167
    move-wide v3, v2

    .line 1168
    goto :goto_f

    .line 1169
    :cond_2b
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v2

    .line 1173
    move-object v10, v2

    .line 1174
    goto :goto_f

    .line 1175
    :cond_2c
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1176
    .line 1177
    .line 1178
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzog;

    .line 1179
    .line 1180
    invoke-direct {v0, v10, v3, v4, v8}, Lcom/google/android/gms/measurement/internal/zzog;-><init>(Ljava/lang/String;JI)V

    .line 1181
    .line 1182
    .line 1183
    return-object v0

    .line 1184
    :pswitch_38
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1185
    .line 1186
    .line 1187
    move-result v0

    .line 1188
    move-object v2, v10

    .line 1189
    move-object v3, v2

    .line 1190
    move-object v4, v3

    .line 1191
    :goto_10
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1192
    .line 1193
    .line 1194
    move-result v8

    .line 1195
    if-ge v8, v0, :cond_31

    .line 1196
    .line 1197
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1198
    .line 1199
    .line 1200
    move-result v8

    .line 1201
    int-to-char v11, v8

    .line 1202
    if-eq v11, v7, :cond_30

    .line 1203
    .line 1204
    if-eq v11, v9, :cond_2f

    .line 1205
    .line 1206
    if-eq v11, v6, :cond_2e

    .line 1207
    .line 1208
    if-eq v11, v5, :cond_2d

    .line 1209
    .line 1210
    invoke-static {v8, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1211
    .line 1212
    .line 1213
    goto :goto_10

    .line 1214
    :cond_2d
    invoke-static {v8, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v4

    .line 1218
    goto :goto_10

    .line 1219
    :cond_2e
    sget-object v3, Lcom/google/android/gms/common/internal/ClientIdentity;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1220
    .line 1221
    invoke-static {v1, v8, v3}, Lqj3;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v3

    .line 1225
    goto :goto_10

    .line 1226
    :cond_2f
    invoke-static {v8, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v2

    .line 1230
    goto :goto_10

    .line 1231
    :cond_30
    sget-object v10, Lcom/google/android/gms/location/ActivityTransition;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1232
    .line 1233
    invoke-static {v1, v8, v10}, Lqj3;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1234
    .line 1235
    .line 1236
    move-result-object v8

    .line 1237
    move-object v10, v8

    .line 1238
    goto :goto_10

    .line 1239
    :cond_31
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1240
    .line 1241
    .line 1242
    new-instance v0, Lcom/google/android/gms/location/ActivityTransitionRequest;

    .line 1243
    .line 1244
    invoke-direct {v0, v10, v2, v3, v4}, Lcom/google/android/gms/location/ActivityTransitionRequest;-><init>(Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)V

    .line 1245
    .line 1246
    .line 1247
    return-object v0

    .line 1248
    :pswitch_39
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1249
    .line 1250
    .line 1251
    move-result v0

    .line 1252
    move-object v14, v10

    .line 1253
    move-object v15, v14

    .line 1254
    move-object/from16 v16, v15

    .line 1255
    .line 1256
    const-wide/16 v12, 0x0

    .line 1257
    .line 1258
    :goto_11
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1259
    .line 1260
    .line 1261
    move-result v2

    .line 1262
    if-ge v2, v0, :cond_36

    .line 1263
    .line 1264
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1265
    .line 1266
    .line 1267
    move-result v2

    .line 1268
    int-to-char v3, v2

    .line 1269
    if-eq v3, v7, :cond_35

    .line 1270
    .line 1271
    if-eq v3, v9, :cond_34

    .line 1272
    .line 1273
    if-eq v3, v6, :cond_33

    .line 1274
    .line 1275
    if-eq v3, v5, :cond_32

    .line 1276
    .line 1277
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1278
    .line 1279
    .line 1280
    goto :goto_11

    .line 1281
    :cond_32
    invoke-static {v2, v1}, Lqj3;->g(ILandroid/os/Parcel;)[B

    .line 1282
    .line 1283
    .line 1284
    move-result-object v2

    .line 1285
    move-object/from16 v16, v2

    .line 1286
    .line 1287
    goto :goto_11

    .line 1288
    :cond_33
    invoke-static {v2, v1}, Lqj3;->g(ILandroid/os/Parcel;)[B

    .line 1289
    .line 1290
    .line 1291
    move-result-object v2

    .line 1292
    move-object v15, v2

    .line 1293
    goto :goto_11

    .line 1294
    :cond_34
    invoke-static {v2, v1}, Lqj3;->g(ILandroid/os/Parcel;)[B

    .line 1295
    .line 1296
    .line 1297
    move-result-object v2

    .line 1298
    move-object v14, v2

    .line 1299
    goto :goto_11

    .line 1300
    :cond_35
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 1301
    .line 1302
    .line 1303
    move-result-wide v2

    .line 1304
    move-wide v12, v2

    .line 1305
    goto :goto_11

    .line 1306
    :cond_36
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1307
    .line 1308
    .line 1309
    new-instance v11, Lcom/google/android/gms/fido/fido2/api/common/zzn;

    .line 1310
    .line 1311
    invoke-direct/range {v11 .. v16}, Lcom/google/android/gms/fido/fido2/api/common/zzn;-><init>(J[B[B[B)V

    .line 1312
    .line 1313
    .line 1314
    return-object v11

    .line 1315
    :pswitch_3a
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1316
    .line 1317
    .line 1318
    move-result v0

    .line 1319
    :goto_12
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1320
    .line 1321
    .line 1322
    move-result v2

    .line 1323
    if-ge v2, v0, :cond_38

    .line 1324
    .line 1325
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1326
    .line 1327
    .line 1328
    move-result v2

    .line 1329
    int-to-char v3, v2

    .line 1330
    if-eq v3, v9, :cond_37

    .line 1331
    .line 1332
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1333
    .line 1334
    .line 1335
    goto :goto_12

    .line 1336
    :cond_37
    sget-object v3, Lcom/google/android/gms/drive/metadata/internal/zzq;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1337
    .line 1338
    invoke-static {v1, v2, v3}, Lqj3;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1339
    .line 1340
    .line 1341
    move-result-object v10

    .line 1342
    goto :goto_12

    .line 1343
    :cond_38
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1344
    .line 1345
    .line 1346
    new-instance v0, Lcom/google/android/gms/drive/metadata/internal/ParentDriveIdSet;

    .line 1347
    .line 1348
    invoke-direct {v0, v10}, Lcom/google/android/gms/drive/metadata/internal/ParentDriveIdSet;-><init>(Ljava/util/ArrayList;)V

    .line 1349
    .line 1350
    .line 1351
    return-object v0

    .line 1352
    :pswitch_3b
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1353
    .line 1354
    .line 1355
    move-result v0

    .line 1356
    :try_start_0
    invoke-static {v0}, Lcom/google/android/gms/fido/fido2/api/common/COSEAlgorithmIdentifier;->a(I)Lcom/google/android/gms/fido/fido2/api/common/COSEAlgorithmIdentifier;

    .line 1357
    .line 1358
    .line 1359
    move-result-object v10
    :try_end_0
    .catch Lhm; {:try_start_0 .. :try_end_0} :catch_0

    .line 1360
    goto :goto_13

    .line 1361
    :catch_0
    move-exception v0

    .line 1362
    invoke-static {v0}, Lds0;->p(Ljava/lang/Throwable;)V

    .line 1363
    .line 1364
    .line 1365
    :goto_13
    return-object v10

    .line 1366
    :pswitch_3c
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1367
    .line 1368
    .line 1369
    move-result v0

    .line 1370
    :goto_14
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1371
    .line 1372
    .line 1373
    move-result v2

    .line 1374
    if-ge v2, v0, :cond_3a

    .line 1375
    .line 1376
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1377
    .line 1378
    .line 1379
    move-result v2

    .line 1380
    int-to-char v3, v2

    .line 1381
    if-eq v3, v7, :cond_39

    .line 1382
    .line 1383
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1384
    .line 1385
    .line 1386
    goto :goto_14

    .line 1387
    :cond_39
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1388
    .line 1389
    .line 1390
    move-result-object v10

    .line 1391
    goto :goto_14

    .line 1392
    :cond_3a
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1393
    .line 1394
    .line 1395
    new-instance v0, Lcom/google/android/gms/drive/query/internal/zzl;

    .line 1396
    .line 1397
    invoke-direct {v0, v10}, Lcom/google/android/gms/drive/query/internal/zzl;-><init>(Ljava/lang/String;)V

    .line 1398
    .line 1399
    .line 1400
    return-object v0

    .line 1401
    :pswitch_3d
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1402
    .line 1403
    .line 1404
    move-result v0

    .line 1405
    :goto_15
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1406
    .line 1407
    .line 1408
    move-result v2

    .line 1409
    if-ge v2, v0, :cond_3c

    .line 1410
    .line 1411
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1412
    .line 1413
    .line 1414
    move-result v2

    .line 1415
    int-to-char v3, v2

    .line 1416
    if-eq v3, v9, :cond_3b

    .line 1417
    .line 1418
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1419
    .line 1420
    .line 1421
    goto :goto_15

    .line 1422
    :cond_3b
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v10

    .line 1426
    goto :goto_15

    .line 1427
    :cond_3c
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1428
    .line 1429
    .line 1430
    new-instance v0, Lcom/google/android/gms/drive/DriveSpace;

    .line 1431
    .line 1432
    invoke-direct {v0, v10}, Lcom/google/android/gms/drive/DriveSpace;-><init>(Ljava/lang/String;)V

    .line 1433
    .line 1434
    .line 1435
    return-object v0

    .line 1436
    :pswitch_3e
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1437
    .line 1438
    .line 1439
    move-result v0

    .line 1440
    new-instance v2, Landroid/os/Bundle;

    .line 1441
    .line 1442
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 1443
    .line 1444
    .line 1445
    sget-object v3, Lcom/google/android/gms/common/internal/GetServiceRequest;->Z:[Lcom/google/android/gms/common/api/Scope;

    .line 1446
    .line 1447
    sget-object v4, Lcom/google/android/gms/common/internal/GetServiceRequest;->a0:[Lcom/google/android/gms/common/Feature;

    .line 1448
    .line 1449
    move-object/from16 v18, v2

    .line 1450
    .line 1451
    move-object/from16 v17, v3

    .line 1452
    .line 1453
    move-object/from16 v20, v4

    .line 1454
    .line 1455
    move-object/from16 v21, v20

    .line 1456
    .line 1457
    move-object v15, v10

    .line 1458
    move-object/from16 v16, v15

    .line 1459
    .line 1460
    move-object/from16 v19, v16

    .line 1461
    .line 1462
    move-object/from16 v25, v19

    .line 1463
    .line 1464
    const/4 v12, 0x0

    .line 1465
    const/4 v13, 0x0

    .line 1466
    const/4 v14, 0x0

    .line 1467
    const/16 v22, 0x0

    .line 1468
    .line 1469
    const/16 v23, 0x0

    .line 1470
    .line 1471
    const/16 v24, 0x0

    .line 1472
    .line 1473
    :goto_16
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1474
    .line 1475
    .line 1476
    move-result v2

    .line 1477
    if-ge v2, v0, :cond_3d

    .line 1478
    .line 1479
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1480
    .line 1481
    .line 1482
    move-result v2

    .line 1483
    int-to-char v3, v2

    .line 1484
    packed-switch v3, :pswitch_data_7

    .line 1485
    .line 1486
    .line 1487
    :pswitch_3f
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1488
    .line 1489
    .line 1490
    goto :goto_16

    .line 1491
    :pswitch_40
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1492
    .line 1493
    .line 1494
    move-result-object v25

    .line 1495
    goto :goto_16

    .line 1496
    :pswitch_41
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1497
    .line 1498
    .line 1499
    move-result v24

    .line 1500
    goto :goto_16

    .line 1501
    :pswitch_42
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1502
    .line 1503
    .line 1504
    move-result v23

    .line 1505
    goto :goto_16

    .line 1506
    :pswitch_43
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1507
    .line 1508
    .line 1509
    move-result v22

    .line 1510
    goto :goto_16

    .line 1511
    :pswitch_44
    sget-object v3, Lcom/google/android/gms/common/Feature;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1512
    .line 1513
    invoke-static {v1, v2, v3}, Lqj3;->m(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 1514
    .line 1515
    .line 1516
    move-result-object v2

    .line 1517
    move-object/from16 v21, v2

    .line 1518
    .line 1519
    check-cast v21, [Lcom/google/android/gms/common/Feature;

    .line 1520
    .line 1521
    goto :goto_16

    .line 1522
    :pswitch_45
    sget-object v3, Lcom/google/android/gms/common/Feature;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1523
    .line 1524
    invoke-static {v1, v2, v3}, Lqj3;->m(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 1525
    .line 1526
    .line 1527
    move-result-object v2

    .line 1528
    move-object/from16 v20, v2

    .line 1529
    .line 1530
    check-cast v20, [Lcom/google/android/gms/common/Feature;

    .line 1531
    .line 1532
    goto :goto_16

    .line 1533
    :pswitch_46
    sget-object v3, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1534
    .line 1535
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1536
    .line 1537
    .line 1538
    move-result-object v2

    .line 1539
    move-object/from16 v19, v2

    .line 1540
    .line 1541
    check-cast v19, Landroid/accounts/Account;

    .line 1542
    .line 1543
    goto :goto_16

    .line 1544
    :pswitch_47
    invoke-static {v2, v1}, Lqj3;->f(ILandroid/os/Parcel;)Landroid/os/Bundle;

    .line 1545
    .line 1546
    .line 1547
    move-result-object v18

    .line 1548
    goto :goto_16

    .line 1549
    :pswitch_48
    sget-object v3, Lcom/google/android/gms/common/api/Scope;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1550
    .line 1551
    invoke-static {v1, v2, v3}, Lqj3;->m(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 1552
    .line 1553
    .line 1554
    move-result-object v2

    .line 1555
    move-object/from16 v17, v2

    .line 1556
    .line 1557
    check-cast v17, [Lcom/google/android/gms/common/api/Scope;

    .line 1558
    .line 1559
    goto :goto_16

    .line 1560
    :pswitch_49
    invoke-static {v2, v1}, Lqj3;->C(ILandroid/os/Parcel;)Landroid/os/IBinder;

    .line 1561
    .line 1562
    .line 1563
    move-result-object v16

    .line 1564
    goto :goto_16

    .line 1565
    :pswitch_4a
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1566
    .line 1567
    .line 1568
    move-result-object v15

    .line 1569
    goto :goto_16

    .line 1570
    :pswitch_4b
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1571
    .line 1572
    .line 1573
    move-result v14

    .line 1574
    goto :goto_16

    .line 1575
    :pswitch_4c
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1576
    .line 1577
    .line 1578
    move-result v13

    .line 1579
    goto :goto_16

    .line 1580
    :pswitch_4d
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1581
    .line 1582
    .line 1583
    move-result v12

    .line 1584
    goto :goto_16

    .line 1585
    :cond_3d
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1586
    .line 1587
    .line 1588
    new-instance v11, Lcom/google/android/gms/common/internal/GetServiceRequest;

    .line 1589
    .line 1590
    invoke-direct/range {v11 .. v25}, Lcom/google/android/gms/common/internal/GetServiceRequest;-><init>(IIILjava/lang/String;Landroid/os/IBinder;[Lcom/google/android/gms/common/api/Scope;Landroid/os/Bundle;Landroid/accounts/Account;[Lcom/google/android/gms/common/Feature;[Lcom/google/android/gms/common/Feature;ZIZLjava/lang/String;)V

    .line 1591
    .line 1592
    .line 1593
    return-object v11

    .line 1594
    :pswitch_4e
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1595
    .line 1596
    .line 1597
    move-result v0

    .line 1598
    move-object v13, v10

    .line 1599
    move-object v14, v13

    .line 1600
    move-object/from16 v17, v14

    .line 1601
    .line 1602
    move-object/from16 v18, v17

    .line 1603
    .line 1604
    const/4 v12, 0x0

    .line 1605
    const/4 v15, 0x0

    .line 1606
    const/16 v16, 0x0

    .line 1607
    .line 1608
    :goto_17
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1609
    .line 1610
    .line 1611
    move-result v2

    .line 1612
    if-ge v2, v0, :cond_3e

    .line 1613
    .line 1614
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1615
    .line 1616
    .line 1617
    move-result v2

    .line 1618
    int-to-char v3, v2

    .line 1619
    packed-switch v3, :pswitch_data_8

    .line 1620
    .line 1621
    .line 1622
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1623
    .line 1624
    .line 1625
    goto :goto_17

    .line 1626
    :pswitch_4f
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1627
    .line 1628
    .line 1629
    move-result-object v2

    .line 1630
    move-object/from16 v18, v2

    .line 1631
    .line 1632
    goto :goto_17

    .line 1633
    :pswitch_50
    invoke-static {v2, v1}, Lqj3;->l(ILandroid/os/Parcel;)Ljava/util/ArrayList;

    .line 1634
    .line 1635
    .line 1636
    move-result-object v2

    .line 1637
    move-object/from16 v17, v2

    .line 1638
    .line 1639
    goto :goto_17

    .line 1640
    :pswitch_51
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1641
    .line 1642
    .line 1643
    move-result v2

    .line 1644
    move/from16 v16, v2

    .line 1645
    .line 1646
    goto :goto_17

    .line 1647
    :pswitch_52
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1648
    .line 1649
    .line 1650
    move-result v2

    .line 1651
    move v15, v2

    .line 1652
    goto :goto_17

    .line 1653
    :pswitch_53
    invoke-static {v2, v1}, Lqj3;->G(ILandroid/os/Parcel;)Ljava/lang/Long;

    .line 1654
    .line 1655
    .line 1656
    move-result-object v2

    .line 1657
    move-object v14, v2

    .line 1658
    goto :goto_17

    .line 1659
    :pswitch_54
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1660
    .line 1661
    .line 1662
    move-result-object v2

    .line 1663
    move-object v13, v2

    .line 1664
    goto :goto_17

    .line 1665
    :pswitch_55
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1666
    .line 1667
    .line 1668
    move-result v2

    .line 1669
    move v12, v2

    .line 1670
    goto :goto_17

    .line 1671
    :cond_3e
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1672
    .line 1673
    .line 1674
    new-instance v11, Lcom/google/android/gms/auth/TokenData;

    .line 1675
    .line 1676
    invoke-direct/range {v11 .. v18}, Lcom/google/android/gms/auth/TokenData;-><init>(ILjava/lang/String;Ljava/lang/Long;ZZLjava/util/ArrayList;Ljava/lang/String;)V

    .line 1677
    .line 1678
    .line 1679
    return-object v11

    .line 1680
    :pswitch_56
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1681
    .line 1682
    .line 1683
    move-result v0

    .line 1684
    const/4 v2, 0x0

    .line 1685
    const-wide/16 v3, 0x0

    .line 1686
    .line 1687
    const/4 v8, 0x0

    .line 1688
    :goto_18
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1689
    .line 1690
    .line 1691
    move-result v5

    .line 1692
    if-ge v5, v0, :cond_42

    .line 1693
    .line 1694
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1695
    .line 1696
    .line 1697
    move-result v5

    .line 1698
    int-to-char v10, v5

    .line 1699
    if-eq v10, v7, :cond_41

    .line 1700
    .line 1701
    if-eq v10, v9, :cond_40

    .line 1702
    .line 1703
    if-eq v10, v6, :cond_3f

    .line 1704
    .line 1705
    invoke-static {v5, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1706
    .line 1707
    .line 1708
    goto :goto_18

    .line 1709
    :cond_3f
    invoke-static {v5, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 1710
    .line 1711
    .line 1712
    move-result-wide v3

    .line 1713
    goto :goto_18

    .line 1714
    :cond_40
    invoke-static {v5, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1715
    .line 1716
    .line 1717
    move-result v2

    .line 1718
    goto :goto_18

    .line 1719
    :cond_41
    invoke-static {v5, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1720
    .line 1721
    .line 1722
    move-result v5

    .line 1723
    move v8, v5

    .line 1724
    goto :goto_18

    .line 1725
    :cond_42
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1726
    .line 1727
    .line 1728
    new-instance v0, Lcom/google/android/gms/location/ActivityTransitionEvent;

    .line 1729
    .line 1730
    invoke-direct {v0, v3, v4, v8, v2}, Lcom/google/android/gms/location/ActivityTransitionEvent;-><init>(JII)V

    .line 1731
    .line 1732
    .line 1733
    return-object v0

    .line 1734
    :pswitch_57
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1735
    .line 1736
    .line 1737
    move-result v0

    .line 1738
    const/4 v2, 0x0

    .line 1739
    const/4 v8, 0x0

    .line 1740
    :goto_19
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1741
    .line 1742
    .line 1743
    move-result v3

    .line 1744
    if-ge v3, v0, :cond_45

    .line 1745
    .line 1746
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1747
    .line 1748
    .line 1749
    move-result v3

    .line 1750
    int-to-char v4, v3

    .line 1751
    if-eq v4, v7, :cond_44

    .line 1752
    .line 1753
    if-eq v4, v9, :cond_43

    .line 1754
    .line 1755
    invoke-static {v3, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1756
    .line 1757
    .line 1758
    goto :goto_19

    .line 1759
    :cond_43
    invoke-static {v3, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1760
    .line 1761
    .line 1762
    move-result v2

    .line 1763
    goto :goto_19

    .line 1764
    :cond_44
    invoke-static {v3, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1765
    .line 1766
    .line 1767
    move-result v3

    .line 1768
    move v8, v3

    .line 1769
    goto :goto_19

    .line 1770
    :cond_45
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1771
    .line 1772
    .line 1773
    new-instance v0, Lcom/google/android/gms/location/ActivityTransition;

    .line 1774
    .line 1775
    invoke-direct {v0, v8, v2}, Lcom/google/android/gms/location/ActivityTransition;-><init>(II)V

    .line 1776
    .line 1777
    .line 1778
    return-object v0

    .line 1779
    :pswitch_58
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1780
    .line 1781
    .line 1782
    move-result v0

    .line 1783
    move-object v3, v10

    .line 1784
    move-object v4, v3

    .line 1785
    move-object v7, v4

    .line 1786
    :goto_1a
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1787
    .line 1788
    .line 1789
    move-result v8

    .line 1790
    if-ge v8, v0, :cond_4a

    .line 1791
    .line 1792
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1793
    .line 1794
    .line 1795
    move-result v8

    .line 1796
    int-to-char v11, v8

    .line 1797
    if-eq v11, v9, :cond_49

    .line 1798
    .line 1799
    if-eq v11, v6, :cond_48

    .line 1800
    .line 1801
    if-eq v11, v5, :cond_47

    .line 1802
    .line 1803
    if-eq v11, v2, :cond_46

    .line 1804
    .line 1805
    invoke-static {v8, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1806
    .line 1807
    .line 1808
    goto :goto_1a

    .line 1809
    :cond_46
    invoke-static {v8, v1}, Lqj3;->g(ILandroid/os/Parcel;)[B

    .line 1810
    .line 1811
    .line 1812
    move-result-object v7

    .line 1813
    goto :goto_1a

    .line 1814
    :cond_47
    invoke-static {v8, v1}, Lqj3;->g(ILandroid/os/Parcel;)[B

    .line 1815
    .line 1816
    .line 1817
    move-result-object v4

    .line 1818
    goto :goto_1a

    .line 1819
    :cond_48
    invoke-static {v8, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1820
    .line 1821
    .line 1822
    move-result-object v3

    .line 1823
    goto :goto_1a

    .line 1824
    :cond_49
    invoke-static {v8, v1}, Lqj3;->g(ILandroid/os/Parcel;)[B

    .line 1825
    .line 1826
    .line 1827
    move-result-object v10

    .line 1828
    goto :goto_1a

    .line 1829
    :cond_4a
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1830
    .line 1831
    .line 1832
    new-instance v0, Lcom/google/android/gms/fido/u2f/api/common/SignResponseData;

    .line 1833
    .line 1834
    invoke-direct {v0, v10, v3, v4, v7}, Lcom/google/android/gms/fido/u2f/api/common/SignResponseData;-><init>([BLjava/lang/String;[B[B)V

    .line 1835
    .line 1836
    .line 1837
    return-object v0

    .line 1838
    :pswitch_59
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1839
    .line 1840
    .line 1841
    move-result v0

    .line 1842
    move-object v2, v10

    .line 1843
    move-object v3, v2

    .line 1844
    :goto_1b
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1845
    .line 1846
    .line 1847
    move-result v4

    .line 1848
    if-ge v4, v0, :cond_4e

    .line 1849
    .line 1850
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1851
    .line 1852
    .line 1853
    move-result v4

    .line 1854
    int-to-char v7, v4

    .line 1855
    if-eq v7, v9, :cond_4d

    .line 1856
    .line 1857
    if-eq v7, v6, :cond_4c

    .line 1858
    .line 1859
    if-eq v7, v5, :cond_4b

    .line 1860
    .line 1861
    invoke-static {v4, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1862
    .line 1863
    .line 1864
    goto :goto_1b

    .line 1865
    :cond_4b
    invoke-static {v4, v1}, Lqj3;->g(ILandroid/os/Parcel;)[B

    .line 1866
    .line 1867
    .line 1868
    move-result-object v3

    .line 1869
    goto :goto_1b

    .line 1870
    :cond_4c
    sget-object v2, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1871
    .line 1872
    invoke-static {v1, v4, v2}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1873
    .line 1874
    .line 1875
    move-result-object v2

    .line 1876
    check-cast v2, Landroid/net/Uri;

    .line 1877
    .line 1878
    goto :goto_1b

    .line 1879
    :cond_4d
    sget-object v7, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialRequestOptions;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1880
    .line 1881
    invoke-static {v1, v4, v7}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1882
    .line 1883
    .line 1884
    move-result-object v4

    .line 1885
    move-object v10, v4

    .line 1886
    check-cast v10, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialRequestOptions;

    .line 1887
    .line 1888
    goto :goto_1b

    .line 1889
    :cond_4e
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1890
    .line 1891
    .line 1892
    new-instance v0, Lcom/google/android/gms/fido/fido2/api/common/BrowserPublicKeyCredentialRequestOptions;

    .line 1893
    .line 1894
    invoke-direct {v0, v10, v2, v3}, Lcom/google/android/gms/fido/fido2/api/common/BrowserPublicKeyCredentialRequestOptions;-><init>(Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialRequestOptions;Landroid/net/Uri;[B)V

    .line 1895
    .line 1896
    .line 1897
    return-object v0

    .line 1898
    :pswitch_5a
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1899
    .line 1900
    .line 1901
    move-result v0

    .line 1902
    move-object v2, v10

    .line 1903
    move-object v5, v2

    .line 1904
    move-object v7, v5

    .line 1905
    const/4 v3, 0x0

    .line 1906
    const/4 v4, 0x0

    .line 1907
    const/4 v6, 0x0

    .line 1908
    :goto_1c
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1909
    .line 1910
    .line 1911
    move-result v8

    .line 1912
    if-ge v8, v0, :cond_4f

    .line 1913
    .line 1914
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1915
    .line 1916
    .line 1917
    move-result v8

    .line 1918
    int-to-char v9, v8

    .line 1919
    packed-switch v9, :pswitch_data_9

    .line 1920
    .line 1921
    .line 1922
    invoke-static {v8, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1923
    .line 1924
    .line 1925
    goto :goto_1c

    .line 1926
    :pswitch_5b
    invoke-static {v8, v1}, Lqj3;->h(ILandroid/os/Parcel;)[I

    .line 1927
    .line 1928
    .line 1929
    move-result-object v7

    .line 1930
    goto :goto_1c

    .line 1931
    :pswitch_5c
    invoke-static {v8, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1932
    .line 1933
    .line 1934
    move-result v6

    .line 1935
    goto :goto_1c

    .line 1936
    :pswitch_5d
    invoke-static {v8, v1}, Lqj3;->h(ILandroid/os/Parcel;)[I

    .line 1937
    .line 1938
    .line 1939
    move-result-object v5

    .line 1940
    goto :goto_1c

    .line 1941
    :pswitch_5e
    invoke-static {v8, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1942
    .line 1943
    .line 1944
    move-result v4

    .line 1945
    goto :goto_1c

    .line 1946
    :pswitch_5f
    invoke-static {v8, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1947
    .line 1948
    .line 1949
    move-result v3

    .line 1950
    goto :goto_1c

    .line 1951
    :pswitch_60
    sget-object v2, Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1952
    .line 1953
    invoke-static {v1, v8, v2}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1954
    .line 1955
    .line 1956
    move-result-object v2

    .line 1957
    check-cast v2, Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;

    .line 1958
    .line 1959
    goto :goto_1c

    .line 1960
    :cond_4f
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1961
    .line 1962
    .line 1963
    new-instance v1, Lcom/google/android/gms/common/internal/ConnectionTelemetryConfiguration;

    .line 1964
    .line 1965
    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/common/internal/ConnectionTelemetryConfiguration;-><init>(Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;ZZ[II[I)V

    .line 1966
    .line 1967
    .line 1968
    return-object v1

    .line 1969
    :pswitch_61
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1970
    .line 1971
    .line 1972
    move-result v0

    .line 1973
    move-object v11, v10

    .line 1974
    const/4 v3, 0x0

    .line 1975
    const-wide/16 v12, 0x0

    .line 1976
    .line 1977
    const-wide/16 v14, 0x0

    .line 1978
    .line 1979
    const-wide/16 v16, 0x0

    .line 1980
    .line 1981
    :goto_1d
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1982
    .line 1983
    .line 1984
    move-result v4

    .line 1985
    if-ge v4, v0, :cond_55

    .line 1986
    .line 1987
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1988
    .line 1989
    .line 1990
    move-result v4

    .line 1991
    int-to-char v8, v4

    .line 1992
    if-eq v8, v7, :cond_54

    .line 1993
    .line 1994
    if-eq v8, v9, :cond_53

    .line 1995
    .line 1996
    if-eq v8, v6, :cond_52

    .line 1997
    .line 1998
    if-eq v8, v5, :cond_51

    .line 1999
    .line 2000
    if-eq v8, v2, :cond_50

    .line 2001
    .line 2002
    invoke-static {v4, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 2003
    .line 2004
    .line 2005
    goto :goto_1d

    .line 2006
    :cond_50
    invoke-static {v4, v1}, Lqj3;->f(ILandroid/os/Parcel;)Landroid/os/Bundle;

    .line 2007
    .line 2008
    .line 2009
    move-result-object v4

    .line 2010
    move-object v11, v4

    .line 2011
    goto :goto_1d

    .line 2012
    :cond_51
    invoke-static {v4, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 2013
    .line 2014
    .line 2015
    move-result v3

    .line 2016
    goto :goto_1d

    .line 2017
    :cond_52
    invoke-static {v4, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 2018
    .line 2019
    .line 2020
    move-result-wide v14

    .line 2021
    goto :goto_1d

    .line 2022
    :cond_53
    invoke-static {v4, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 2023
    .line 2024
    .line 2025
    move-result-wide v12

    .line 2026
    goto :goto_1d

    .line 2027
    :cond_54
    sget-object v8, Lcom/google/android/gms/location/DetectedActivity;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 2028
    .line 2029
    invoke-static {v1, v4, v8}, Lqj3;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 2030
    .line 2031
    .line 2032
    move-result-object v4

    .line 2033
    move-object v10, v4

    .line 2034
    goto :goto_1d

    .line 2035
    :cond_55
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 2036
    .line 2037
    .line 2038
    new-instance v0, Lcom/google/android/gms/location/ActivityRecognitionResult;

    .line 2039
    .line 2040
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 2041
    .line 2042
    .line 2043
    if-eqz v10, :cond_56

    .line 2044
    .line 2045
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 2046
    .line 2047
    .line 2048
    move-result v1

    .line 2049
    if-lez v1, :cond_56

    .line 2050
    .line 2051
    move v1, v7

    .line 2052
    goto :goto_1e

    .line 2053
    :cond_56
    const/4 v1, 0x0

    .line 2054
    :goto_1e
    const-string v2, "Must have at least 1 detected activity"

    .line 2055
    .line 2056
    invoke-static {v2, v1}, Lkb1;->f(Ljava/lang/String;Z)V

    .line 2057
    .line 2058
    .line 2059
    cmp-long v1, v12, v16

    .line 2060
    .line 2061
    if-lez v1, :cond_57

    .line 2062
    .line 2063
    cmp-long v1, v14, v16

    .line 2064
    .line 2065
    if-lez v1, :cond_57

    .line 2066
    .line 2067
    goto :goto_1f

    .line 2068
    :cond_57
    const/4 v7, 0x0

    .line 2069
    :goto_1f
    const-string v1, "Must set times"

    .line 2070
    .line 2071
    invoke-static {v1, v7}, Lkb1;->f(Ljava/lang/String;Z)V

    .line 2072
    .line 2073
    .line 2074
    iput-object v10, v0, Lcom/google/android/gms/location/ActivityRecognitionResult;->a:Ljava/util/ArrayList;

    .line 2075
    .line 2076
    iput-wide v12, v0, Lcom/google/android/gms/location/ActivityRecognitionResult;->b:J

    .line 2077
    .line 2078
    iput-wide v14, v0, Lcom/google/android/gms/location/ActivityRecognitionResult;->c:J

    .line 2079
    .line 2080
    iput v3, v0, Lcom/google/android/gms/location/ActivityRecognitionResult;->d:I

    .line 2081
    .line 2082
    iput-object v11, v0, Lcom/google/android/gms/location/ActivityRecognitionResult;->e:Landroid/os/Bundle;

    .line 2083
    .line 2084
    return-object v0

    .line 2085
    :pswitch_62
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 2086
    .line 2087
    .line 2088
    move-result v0

    .line 2089
    move-object v2, v10

    .line 2090
    move-object v3, v2

    .line 2091
    move-object v4, v3

    .line 2092
    move-object v5, v4

    .line 2093
    move-object v6, v5

    .line 2094
    move-object v7, v6

    .line 2095
    move-object v8, v7

    .line 2096
    :goto_20
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 2097
    .line 2098
    .line 2099
    move-result v9

    .line 2100
    if-ge v9, v0, :cond_58

    .line 2101
    .line 2102
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 2103
    .line 2104
    .line 2105
    move-result v9

    .line 2106
    int-to-char v10, v9

    .line 2107
    packed-switch v10, :pswitch_data_a

    .line 2108
    .line 2109
    .line 2110
    invoke-static {v9, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 2111
    .line 2112
    .line 2113
    goto :goto_20

    .line 2114
    :pswitch_63
    invoke-static {v9, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 2115
    .line 2116
    .line 2117
    move-result-object v8

    .line 2118
    goto :goto_20

    .line 2119
    :pswitch_64
    sget-object v7, Lcom/google/android/gms/fido/u2f/api/common/ChannelIdValue;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 2120
    .line 2121
    invoke-static {v1, v9, v7}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 2122
    .line 2123
    .line 2124
    move-result-object v7

    .line 2125
    check-cast v7, Lcom/google/android/gms/fido/u2f/api/common/ChannelIdValue;

    .line 2126
    .line 2127
    goto :goto_20

    .line 2128
    :pswitch_65
    sget-object v6, Lcom/google/android/gms/fido/u2f/api/common/RegisteredKey;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 2129
    .line 2130
    invoke-static {v1, v9, v6}, Lqj3;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 2131
    .line 2132
    .line 2133
    move-result-object v6

    .line 2134
    goto :goto_20

    .line 2135
    :pswitch_66
    invoke-static {v9, v1}, Lqj3;->g(ILandroid/os/Parcel;)[B

    .line 2136
    .line 2137
    .line 2138
    move-result-object v5

    .line 2139
    goto :goto_20

    .line 2140
    :pswitch_67
    sget-object v4, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 2141
    .line 2142
    invoke-static {v1, v9, v4}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 2143
    .line 2144
    .line 2145
    move-result-object v4

    .line 2146
    check-cast v4, Landroid/net/Uri;

    .line 2147
    .line 2148
    goto :goto_20

    .line 2149
    :pswitch_68
    invoke-static {v9, v1}, Lqj3;->A(ILandroid/os/Parcel;)Ljava/lang/Double;

    .line 2150
    .line 2151
    .line 2152
    move-result-object v3

    .line 2153
    goto :goto_20

    .line 2154
    :pswitch_69
    invoke-static {v9, v1}, Lqj3;->E(ILandroid/os/Parcel;)Ljava/lang/Integer;

    .line 2155
    .line 2156
    .line 2157
    move-result-object v2

    .line 2158
    goto :goto_20

    .line 2159
    :cond_58
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 2160
    .line 2161
    .line 2162
    new-instance v1, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;

    .line 2163
    .line 2164
    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;-><init>(Ljava/lang/Integer;Ljava/lang/Double;Landroid/net/Uri;[BLjava/util/ArrayList;Lcom/google/android/gms/fido/u2f/api/common/ChannelIdValue;Ljava/lang/String;)V

    .line 2165
    .line 2166
    .line 2167
    return-object v1

    .line 2168
    :pswitch_6a
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 2169
    .line 2170
    .line 2171
    move-result v0

    .line 2172
    move-object v2, v10

    .line 2173
    move-object v3, v2

    .line 2174
    :goto_21
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 2175
    .line 2176
    .line 2177
    move-result v4

    .line 2178
    if-ge v4, v0, :cond_5c

    .line 2179
    .line 2180
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 2181
    .line 2182
    .line 2183
    move-result v4

    .line 2184
    int-to-char v7, v4

    .line 2185
    if-eq v7, v9, :cond_5b

    .line 2186
    .line 2187
    if-eq v7, v6, :cond_5a

    .line 2188
    .line 2189
    if-eq v7, v5, :cond_59

    .line 2190
    .line 2191
    invoke-static {v4, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 2192
    .line 2193
    .line 2194
    goto :goto_21

    .line 2195
    :cond_59
    invoke-static {v4, v1}, Lqj3;->g(ILandroid/os/Parcel;)[B

    .line 2196
    .line 2197
    .line 2198
    move-result-object v3

    .line 2199
    goto :goto_21

    .line 2200
    :cond_5a
    sget-object v2, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 2201
    .line 2202
    invoke-static {v1, v4, v2}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 2203
    .line 2204
    .line 2205
    move-result-object v2

    .line 2206
    check-cast v2, Landroid/net/Uri;

    .line 2207
    .line 2208
    goto :goto_21

    .line 2209
    :cond_5b
    sget-object v7, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 2210
    .line 2211
    invoke-static {v1, v4, v7}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 2212
    .line 2213
    .line 2214
    move-result-object v4

    .line 2215
    move-object v10, v4

    .line 2216
    check-cast v10, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;

    .line 2217
    .line 2218
    goto :goto_21

    .line 2219
    :cond_5c
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 2220
    .line 2221
    .line 2222
    new-instance v0, Lcom/google/android/gms/fido/fido2/api/common/BrowserPublicKeyCredentialCreationOptions;

    .line 2223
    .line 2224
    invoke-direct {v0, v10, v2, v3}, Lcom/google/android/gms/fido/fido2/api/common/BrowserPublicKeyCredentialCreationOptions;-><init>(Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;Landroid/net/Uri;[B)V

    .line 2225
    .line 2226
    .line 2227
    return-object v0

    .line 2228
    nop

    .line 2229
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6a
        :pswitch_62
        :pswitch_61
        :pswitch_5a
        :pswitch_59
        :pswitch_58
        :pswitch_57
        :pswitch_56
        :pswitch_4e
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_16
        :pswitch_15
        :pswitch_c
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_4
        :pswitch_5
    .end packed-switch

    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
    .end packed-switch

    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
    .end packed-switch

    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    :pswitch_data_4
    .packed-switch 0xe
        :pswitch_21
        :pswitch_20
        :pswitch_1f
    .end packed-switch

    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    :pswitch_data_5
    .packed-switch 0x12
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
    .end packed-switch

    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    :pswitch_data_6
    .packed-switch 0x1
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
    .end packed-switch

    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    :pswitch_data_7
    .packed-switch 0x1
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_3f
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
    .end packed-switch

    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    :pswitch_data_8
    .packed-switch 0x1
        :pswitch_55
        :pswitch_54
        :pswitch_53
        :pswitch_52
        :pswitch_51
        :pswitch_50
        :pswitch_4f
    .end packed-switch

    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    :pswitch_data_9
    .packed-switch 0x1
        :pswitch_60
        :pswitch_5f
        :pswitch_5e
        :pswitch_5d
        :pswitch_5c
        :pswitch_5b
    .end packed-switch

    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    :pswitch_data_a
    .packed-switch 0x2
        :pswitch_69
        :pswitch_68
        :pswitch_67
        :pswitch_66
        :pswitch_65
        :pswitch_64
        :pswitch_63
    .end packed-switch
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    iget p0, p0, Lcl3;->a:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p0, p1, [Lcom/google/android/gms/location/DetectedActivity;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    new-array p0, p1, [Lcom/google/android/gms/games/PlayerLevel;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    new-array p0, p1, [Lcom/google/android/gms/drive/metadata/internal/zzq;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/zzp;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_3
    new-array p0, p1, [Lcom/google/android/gms/common/zzp;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_4
    new-array p0, p1, [Lcom/google/android/gms/measurement/internal/zzpk;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_5
    new-array p0, p1, [Lcom/google/android/gms/location/ActivityTransitionResult;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_6
    new-array p0, p1, [Lcom/google/android/gms/games/PlayerEntity;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_7
    new-array p0, p1, [Lcom/google/android/gms/drive/events/zzo;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_8
    new-array p0, p1, [Lcom/google/android/gms/auth/api/accounttransfer/zzo;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_9
    new-array p0, p1, [Lcom/google/android/gms/measurement/internal/zzop;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_a
    new-array p0, p1, [Lcom/google/android/gms/measurement/internal/zzon;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_b
    new-array p0, p1, [Lcom/google/android/gms/measurement/internal/zzol;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_c
    new-array p0, p1, [Lcom/google/android/gms/measurement/internal/zzog;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_d
    new-array p0, p1, [Lcom/google/android/gms/location/ActivityTransitionRequest;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_e
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/zzn;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_f
    new-array p0, p1, [Lcom/google/android/gms/drive/metadata/internal/ParentDriveIdSet;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_10
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/COSEAlgorithmIdentifier;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_11
    new-array p0, p1, [Lcom/google/android/gms/drive/query/internal/zzl;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_12
    new-array p0, p1, [Lcom/google/android/gms/drive/DriveSpace;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_13
    new-array p0, p1, [Lcom/google/android/gms/common/internal/GetServiceRequest;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_14
    new-array p0, p1, [Lcom/google/android/gms/auth/TokenData;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_15
    new-array p0, p1, [Lcom/google/android/gms/location/ActivityTransitionEvent;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_16
    new-array p0, p1, [Lcom/google/android/gms/location/ActivityTransition;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_17
    new-array p0, p1, [Lcom/google/android/gms/fido/u2f/api/common/SignResponseData;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_18
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/BrowserPublicKeyCredentialRequestOptions;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_19
    new-array p0, p1, [Lcom/google/android/gms/common/internal/ConnectionTelemetryConfiguration;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_1a
    new-array p0, p1, [Lcom/google/android/gms/location/ActivityRecognitionResult;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_1b
    new-array p0, p1, [Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_1c
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/BrowserPublicKeyCredentialCreationOptions;

    .line 94
    .line 95
    return-object p0

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
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
