.class public final Lgo3;
.super Lll3;


# static fields
.field public static final a:Lhp3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lhp3;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lgo3;->a:Lhp3;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final synthetic zzb(Landroid/os/Bundle;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lgo3;->zzc(Landroid/os/Bundle;)Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final zzc(Lcom/google/android/gms/common/data/DataHolder;II)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    iget-object v0, v1, Lcom/google/android/gms/common/data/DataHolder;->f:Landroid/os/Bundle;

    .line 4
    .line 5
    const-string v2, "parentsExtra"

    .line 6
    .line 7
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-nez v2, :cond_4

    .line 12
    .line 13
    const-string v3, "parentsExtraHolder"

    .line 14
    .line 15
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    if-eqz v3, :cond_3

    .line 20
    .line 21
    monitor-enter p1

    .line 22
    :try_start_0
    iget-object v2, v1, Lcom/google/android/gms/common/data/DataHolder;->f:Landroid/os/Bundle;

    .line 23
    .line 24
    const-string v3, "parentsExtraHolder"

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lcom/google/android/gms/common/data/DataHolder;

    .line 31
    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    goto/16 :goto_2

    .line 36
    .line 37
    :catchall_0
    move-exception v0

    .line 38
    goto/16 :goto_4

    .line 39
    .line 40
    :cond_0
    :try_start_1
    iget v3, v1, Lcom/google/android/gms/common/data/DataHolder;->v:I

    .line 41
    .line 42
    new-instance v4, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 45
    .line 46
    .line 47
    new-instance v5, Ljava/util/HashMap;

    .line 48
    .line 49
    invoke-direct {v5, v3}, Ljava/util/HashMap;-><init>(I)V

    .line 50
    .line 51
    .line 52
    const/4 v6, 0x0

    .line 53
    move v7, v6

    .line 54
    :goto_0
    if-ge v7, v3, :cond_1

    .line 55
    .line 56
    invoke-virtual {v1, v7}, Lcom/google/android/gms/common/data/DataHolder;->H1(I)I

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    new-instance v9, Lcom/google/android/gms/drive/metadata/internal/ParentDriveIdSet;

    .line 61
    .line 62
    new-instance v10, Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-direct {v9, v10}, Lcom/google/android/gms/drive/metadata/internal/ParentDriveIdSet;-><init>(Ljava/util/ArrayList;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    const-string v10, "sqlId"

    .line 74
    .line 75
    invoke-virtual {v1, v7, v8, v10}, Lcom/google/android/gms/common/data/DataHolder;->F1(IILjava/lang/String;)J

    .line 76
    .line 77
    .line 78
    move-result-wide v10

    .line 79
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    invoke-virtual {v5, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    add-int/lit8 v7, v7, 0x1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :catchall_1
    move-exception v0

    .line 90
    goto :goto_3

    .line 91
    :cond_1
    iget-object v3, v2, Lcom/google/android/gms/common/data/DataHolder;->f:Landroid/os/Bundle;

    .line 92
    .line 93
    const-string v7, "childSqlIdColumn"

    .line 94
    .line 95
    invoke-virtual {v3, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    const-string v8, "parentSqlIdColumn"

    .line 100
    .line 101
    invoke-virtual {v3, v8}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v8

    .line 105
    const-string v9, "parentResIdColumn"

    .line 106
    .line 107
    invoke-virtual {v3, v9}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    iget v9, v2, Lcom/google/android/gms/common/data/DataHolder;->v:I

    .line 112
    .line 113
    :goto_1
    if-ge v6, v9, :cond_2

    .line 114
    .line 115
    invoke-virtual {v2, v6}, Lcom/google/android/gms/common/data/DataHolder;->H1(I)I

    .line 116
    .line 117
    .line 118
    move-result v10

    .line 119
    invoke-virtual {v2, v6, v10, v7}, Lcom/google/android/gms/common/data/DataHolder;->F1(IILjava/lang/String;)J

    .line 120
    .line 121
    .line 122
    move-result-wide v11

    .line 123
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 124
    .line 125
    .line 126
    move-result-object v11

    .line 127
    invoke-virtual {v5, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v11

    .line 131
    check-cast v11, Lcom/google/android/gms/drive/metadata/internal/ParentDriveIdSet;

    .line 132
    .line 133
    new-instance v12, Lcom/google/android/gms/drive/metadata/internal/zzq;

    .line 134
    .line 135
    invoke-virtual {v2, v6, v10, v3}, Lcom/google/android/gms/common/data/DataHolder;->G1(IILjava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v13

    .line 139
    invoke-virtual {v2, v6, v10, v8}, Lcom/google/android/gms/common/data/DataHolder;->F1(IILjava/lang/String;)J

    .line 140
    .line 141
    .line 142
    move-result-wide v14

    .line 143
    const/4 v10, 0x1

    .line 144
    invoke-direct {v12, v13, v14, v15, v10}, Lcom/google/android/gms/drive/metadata/internal/zzq;-><init>(Ljava/lang/String;JI)V

    .line 145
    .line 146
    .line 147
    iget-object v10, v11, Lcom/google/android/gms/drive/metadata/internal/ParentDriveIdSet;->a:Ljava/util/List;

    .line 148
    .line 149
    invoke-interface {v10, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    add-int/lit8 v6, v6, 0x1

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_2
    iget-object v3, v1, Lcom/google/android/gms/common/data/DataHolder;->f:Landroid/os/Bundle;

    .line 156
    .line 157
    const-string v5, "parentsExtra"

    .line 158
    .line 159
    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 160
    .line 161
    .line 162
    :try_start_2
    invoke-virtual {v2}, Lcom/google/android/gms/common/data/DataHolder;->close()V

    .line 163
    .line 164
    .line 165
    iget-object v2, v1, Lcom/google/android/gms/common/data/DataHolder;->f:Landroid/os/Bundle;

    .line 166
    .line 167
    const-string v3, "parentsExtraHolder"

    .line 168
    .line 169
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 173
    :goto_2
    const-string v1, "parentsExtra"

    .line 174
    .line 175
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    goto :goto_5

    .line 180
    :goto_3
    :try_start_3
    invoke-virtual {v2}, Lcom/google/android/gms/common/data/DataHolder;->close()V

    .line 181
    .line 182
    .line 183
    iget-object v2, v1, Lcom/google/android/gms/common/data/DataHolder;->f:Landroid/os/Bundle;

    .line 184
    .line 185
    const-string v3, "parentsExtraHolder"

    .line 186
    .line 187
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    throw v0

    .line 191
    :goto_4
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 192
    throw v0

    .line 193
    :cond_3
    :goto_5
    if-nez v2, :cond_4

    .line 194
    .line 195
    const/4 v0, 0x0

    .line 196
    return-object v0

    .line 197
    :cond_4
    const-string v1, "dbInstanceId"

    .line 198
    .line 199
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 200
    .line 201
    .line 202
    move-result-wide v7

    .line 203
    move/from16 v0, p2

    .line 204
    .line 205
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    check-cast v0, Lcom/google/android/gms/drive/metadata/internal/ParentDriveIdSet;

    .line 210
    .line 211
    new-instance v1, Ljava/util/HashSet;

    .line 212
    .line 213
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 214
    .line 215
    .line 216
    iget-object v0, v0, Lcom/google/android/gms/drive/metadata/internal/ParentDriveIdSet;->a:Ljava/util/List;

    .line 217
    .line 218
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    if-eqz v2, :cond_5

    .line 227
    .line 228
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    check-cast v2, Lcom/google/android/gms/drive/metadata/internal/zzq;

    .line 233
    .line 234
    new-instance v3, Lcom/google/android/gms/drive/DriveId;

    .line 235
    .line 236
    iget-object v4, v2, Lcom/google/android/gms/drive/metadata/internal/zzq;->a:Ljava/lang/String;

    .line 237
    .line 238
    iget-wide v5, v2, Lcom/google/android/gms/drive/metadata/internal/zzq;->b:J

    .line 239
    .line 240
    iget v9, v2, Lcom/google/android/gms/drive/metadata/internal/zzq;->c:I

    .line 241
    .line 242
    invoke-direct/range {v3 .. v9}, Lcom/google/android/gms/drive/DriveId;-><init>(Ljava/lang/String;JJI)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    goto :goto_6

    .line 249
    :cond_5
    return-object v1
.end method

.method public final zzc(Landroid/os/Bundle;)Ljava/util/Collection;
    .locals 0

    .line 250
    invoke-super {p0, p1}, Lll3;->zzc(Landroid/os/Bundle;)Ljava/util/Collection;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 251
    :cond_0
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1, p0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    return-object p1
.end method
