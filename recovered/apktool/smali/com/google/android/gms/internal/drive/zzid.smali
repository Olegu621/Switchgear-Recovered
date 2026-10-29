.class public Lcom/google/android/gms/internal/drive/zzid;
.super Ljm3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljm3;"
    }
.end annotation


# static fields
.field public static final zzlc:Lzg3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/drive/zzie;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/drive/zzie;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/drive/zzid;->zzlc:Lzg3;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(I)V
    .locals 3

    .line 1
    const-string p1, "hasCustomProperties"

    .line 2
    .line 3
    const-string v0, "sqlId"

    .line 4
    .line 5
    filled-new-array {p1, v0}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-string v0, "customPropertiesExtra"

    .line 14
    .line 15
    const-string v1, "customPropertiesExtraHolder"

    .line 16
    .line 17
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const v1, 0x4c4b40

    .line 26
    .line 27
    .line 28
    const-string v2, "customProperties"

    .line 29
    .line 30
    invoke-direct {p0, v2, p1, v0, v1}, Lsc3;-><init>(Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;I)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method private static zzc(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/data/DataHolder;->f:Landroid/os/Bundle;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    monitor-enter p0

    .line 7
    :try_start_0
    const-string v1, "customPropertiesExtraHolder"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lcom/google/android/gms/common/data/DataHolder;

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/google/android/gms/common/data/DataHolder;->close()V

    .line 18
    .line 19
    .line 20
    const-string v1, "customPropertiesExtraHolder"

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :goto_0
    monitor-exit p0

    .line 29
    return-void

    .line 30
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    throw v0
.end method

.method public static synthetic zzd(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/drive/zzid;->zzc(Lcom/google/android/gms/common/data/DataHolder;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static zzf(Lcom/google/android/gms/common/data/DataHolder;II)Lcom/google/android/gms/drive/metadata/internal/AppVisibleCustomProperties;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lcom/google/android/gms/common/data/DataHolder;->f:Landroid/os/Bundle;

    .line 4
    .line 5
    const-string v2, "customPropertiesExtra"

    .line 6
    .line 7
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-nez v2, :cond_6

    .line 12
    .line 13
    const-string v3, "customPropertiesExtraHolder"

    .line 14
    .line 15
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    if-eqz v3, :cond_5

    .line 20
    .line 21
    monitor-enter p0

    .line 22
    :try_start_0
    iget-object v2, v1, Lcom/google/android/gms/common/data/DataHolder;->f:Landroid/os/Bundle;

    .line 23
    .line 24
    const-string v3, "customPropertiesExtraHolder"

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
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    goto/16 :goto_3

    .line 36
    .line 37
    :catchall_0
    move-exception v0

    .line 38
    goto/16 :goto_5

    .line 39
    .line 40
    :cond_0
    :try_start_1
    iget-object v3, v2, Lcom/google/android/gms/common/data/DataHolder;->f:Landroid/os/Bundle;

    .line 41
    .line 42
    const-string v4, "entryIdColumn"

    .line 43
    .line 44
    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    const-string v5, "keyColumn"

    .line 49
    .line 50
    invoke-virtual {v3, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    const-string v6, "visibilityColumn"

    .line 55
    .line 56
    invoke-virtual {v3, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    const-string v7, "valueColumn"

    .line 61
    .line 62
    invoke-virtual {v3, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    new-instance v7, Lta1;

    .line 67
    .line 68
    invoke-direct {v7}, Lta1;-><init>()V

    .line 69
    .line 70
    .line 71
    const/4 v9, 0x0

    .line 72
    :goto_0
    iget v10, v2, Lcom/google/android/gms/common/data/DataHolder;->v:I

    .line 73
    .line 74
    if-ge v9, v10, :cond_2

    .line 75
    .line 76
    invoke-virtual {v2, v9}, Lcom/google/android/gms/common/data/DataHolder;->H1(I)I

    .line 77
    .line 78
    .line 79
    move-result v10

    .line 80
    invoke-virtual {v2, v9, v10, v4}, Lcom/google/android/gms/common/data/DataHolder;->F1(IILjava/lang/String;)J

    .line 81
    .line 82
    .line 83
    move-result-wide v11

    .line 84
    invoke-virtual {v2, v9, v10, v5}, Lcom/google/android/gms/common/data/DataHolder;->G1(IILjava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v13

    .line 88
    invoke-virtual {v2, v9, v10, v6}, Lcom/google/android/gms/common/data/DataHolder;->E1(IILjava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v14

    .line 92
    invoke-virtual {v2, v9, v10, v3}, Lcom/google/android/gms/common/data/DataHolder;->G1(IILjava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v10

    .line 96
    new-instance v15, Lcom/google/android/gms/drive/metadata/internal/zzc;

    .line 97
    .line 98
    new-instance v8, Lcom/google/android/gms/drive/metadata/CustomPropertyKey;

    .line 99
    .line 100
    invoke-direct {v8, v13, v14}, Lcom/google/android/gms/drive/metadata/CustomPropertyKey;-><init>(Ljava/lang/String;I)V

    .line 101
    .line 102
    .line 103
    invoke-direct {v15, v8, v10}, Lcom/google/android/gms/drive/metadata/internal/zzc;-><init>(Lcom/google/android/gms/drive/metadata/CustomPropertyKey;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v7, v11, v12}, Lta1;->c(J)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    check-cast v8, Lnc;

    .line 111
    .line 112
    if-nez v8, :cond_1

    .line 113
    .line 114
    new-instance v8, Lnc;

    .line 115
    .line 116
    invoke-direct {v8}, Lnc;-><init>()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v7, v8, v11, v12}, Lta1;->d(Ljava/lang/Object;J)V

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :catchall_1
    move-exception v0

    .line 124
    goto :goto_4

    .line 125
    :cond_1
    :goto_1
    iget-object v8, v8, Lnc;->a:Ljava/util/HashMap;

    .line 126
    .line 127
    iget-object v10, v15, Lcom/google/android/gms/drive/metadata/internal/zzc;->a:Lcom/google/android/gms/drive/metadata/CustomPropertyKey;

    .line 128
    .line 129
    invoke-virtual {v8, v10, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    add-int/lit8 v9, v9, 0x1

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_2
    new-instance v3, Landroid/util/SparseArray;

    .line 136
    .line 137
    invoke-direct {v3}, Landroid/util/SparseArray;-><init>()V

    .line 138
    .line 139
    .line 140
    const/4 v8, 0x0

    .line 141
    :goto_2
    iget v4, v1, Lcom/google/android/gms/common/data/DataHolder;->v:I

    .line 142
    .line 143
    if-ge v8, v4, :cond_4

    .line 144
    .line 145
    const-string v4, "sqlId"

    .line 146
    .line 147
    invoke-virtual {v1, v8}, Lcom/google/android/gms/common/data/DataHolder;->H1(I)I

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    invoke-virtual {v1, v8, v5, v4}, Lcom/google/android/gms/common/data/DataHolder;->F1(IILjava/lang/String;)J

    .line 152
    .line 153
    .line 154
    move-result-wide v4

    .line 155
    invoke-virtual {v7, v4, v5}, Lta1;->c(J)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    check-cast v4, Lnc;

    .line 160
    .line 161
    if-eqz v4, :cond_3

    .line 162
    .line 163
    new-instance v5, Lcom/google/android/gms/drive/metadata/internal/AppVisibleCustomProperties;

    .line 164
    .line 165
    iget-object v4, v4, Lnc;->a:Ljava/util/HashMap;

    .line 166
    .line 167
    invoke-virtual {v4}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    invoke-direct {v5, v4}, Lcom/google/android/gms/drive/metadata/internal/AppVisibleCustomProperties;-><init>(Ljava/util/Collection;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v3, v8, v5}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    :cond_3
    add-int/lit8 v8, v8, 0x1

    .line 178
    .line 179
    goto :goto_2

    .line 180
    :cond_4
    iget-object v4, v1, Lcom/google/android/gms/common/data/DataHolder;->f:Landroid/os/Bundle;

    .line 181
    .line 182
    const-string v5, "customPropertiesExtra"

    .line 183
    .line 184
    invoke-virtual {v4, v5, v3}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 185
    .line 186
    .line 187
    :try_start_2
    invoke-virtual {v2}, Lcom/google/android/gms/common/data/DataHolder;->close()V

    .line 188
    .line 189
    .line 190
    iget-object v2, v1, Lcom/google/android/gms/common/data/DataHolder;->f:Landroid/os/Bundle;

    .line 191
    .line 192
    const-string v3, "customPropertiesExtraHolder"

    .line 193
    .line 194
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 198
    :goto_3
    const-string v1, "customPropertiesExtra"

    .line 199
    .line 200
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    goto :goto_6

    .line 205
    :goto_4
    :try_start_3
    invoke-virtual {v2}, Lcom/google/android/gms/common/data/DataHolder;->close()V

    .line 206
    .line 207
    .line 208
    iget-object v2, v1, Lcom/google/android/gms/common/data/DataHolder;->f:Landroid/os/Bundle;

    .line 209
    .line 210
    const-string v3, "customPropertiesExtraHolder"

    .line 211
    .line 212
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    throw v0

    .line 216
    :goto_5
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 217
    throw v0

    .line 218
    :cond_5
    :goto_6
    if-nez v2, :cond_6

    .line 219
    .line 220
    sget-object v0, Lcom/google/android/gms/drive/metadata/internal/AppVisibleCustomProperties;->b:Lcom/google/android/gms/drive/metadata/internal/AppVisibleCustomProperties;

    .line 221
    .line 222
    return-object v0

    .line 223
    :cond_6
    sget-object v0, Lcom/google/android/gms/drive/metadata/internal/AppVisibleCustomProperties;->b:Lcom/google/android/gms/drive/metadata/internal/AppVisibleCustomProperties;

    .line 224
    .line 225
    move/from16 v1, p1

    .line 226
    .line 227
    invoke-virtual {v2, v1, v0}, Landroid/util/SparseArray;->get(ILjava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    check-cast v0, Lcom/google/android/gms/drive/metadata/internal/AppVisibleCustomProperties;

    .line 232
    .line 233
    return-object v0
.end method


# virtual methods
.method public final synthetic zzc(Lcom/google/android/gms/common/data/DataHolder;II)Ljava/lang/Object;
    .locals 0

    .line 32
    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/drive/zzid;->zzf(Lcom/google/android/gms/common/data/DataHolder;II)Lcom/google/android/gms/drive/metadata/internal/AppVisibleCustomProperties;

    move-result-object p0

    return-object p0
.end method
