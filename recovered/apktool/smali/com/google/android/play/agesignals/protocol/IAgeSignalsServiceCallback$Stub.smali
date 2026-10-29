.class public abstract Lcom/google/android/play/agesignals/protocol/IAgeSignalsServiceCallback$Stub;
.super Lcom/google/android/gms/internal/playcore_age_signals/zzb;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lcom/google/android/play/agesignals/protocol/IAgeSignalsServiceCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/play/agesignals/protocol/IAgeSignalsServiceCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Stub"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/play/agesignals/protocol/IAgeSignalsServiceCallback$Stub$Proxy;
    }
.end annotation


# virtual methods
.method public final dispatchTransaction(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 7

    .line 1
    const/4 p3, 0x0

    .line 2
    const/4 p4, 0x1

    .line 3
    if-eq p1, p4, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x3

    .line 6
    if-eq p1, v0, :cond_0

    .line 7
    .line 8
    return p3

    .line 9
    :cond_0
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 10
    .line 11
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/playcore_age_signals/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Landroid/os/Bundle;

    .line 16
    .line 17
    invoke-static {p2}, Lcom/google/android/gms/internal/playcore_age_signals/zzc;->zzb(Landroid/os/Parcel;)V

    .line 18
    .line 19
    .line 20
    check-cast p0, Lfg3;

    .line 21
    .line 22
    iget-object p2, p0, Lfg3;->c:Lxg3;

    .line 23
    .line 24
    iget-object p2, p2, Lxg3;->b:Lcom/google/android/gms/internal/playcore_age_signals/zzo;

    .line 25
    .line 26
    iget-object p3, p0, Lfg3;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 27
    .line 28
    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/playcore_age_signals/zzo;->zzu(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 29
    .line 30
    .line 31
    const-string p2, "error.code"

    .line 32
    .line 33
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    iget-object p0, p0, Lfg3;->a:Lcom/google/android/gms/internal/playcore_age_signals/zzd;

    .line 46
    .line 47
    const-string v0, "onError(%d)"

    .line 48
    .line 49
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/playcore_age_signals/zzd;->zza(Ljava/lang/String;[Ljava/lang/Object;)I

    .line 50
    .line 51
    .line 52
    new-instance p0, La7;

    .line 53
    .line 54
    invoke-direct {p0, p1}, La7;-><init>(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p3, p0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetException(Ljava/lang/Exception;)Z

    .line 58
    .line 59
    .line 60
    return p4

    .line 61
    :cond_1
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 62
    .line 63
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/playcore_age_signals/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    check-cast p1, Landroid/os/Bundle;

    .line 68
    .line 69
    invoke-static {p2}, Lcom/google/android/gms/internal/playcore_age_signals/zzc;->zzb(Landroid/os/Parcel;)V

    .line 70
    .line 71
    .line 72
    check-cast p0, Lfg3;

    .line 73
    .line 74
    iget-object p2, p0, Lfg3;->c:Lxg3;

    .line 75
    .line 76
    iget-object p2, p2, Lxg3;->b:Lcom/google/android/gms/internal/playcore_age_signals/zzo;

    .line 77
    .line 78
    iget-object v0, p0, Lfg3;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 79
    .line 80
    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/playcore_age_signals/zzo;->zzu(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 81
    .line 82
    .line 83
    const-string p2, "onCompleteCheckAgeSignals"

    .line 84
    .line 85
    new-array p3, p3, [Ljava/lang/Object;

    .line 86
    .line 87
    iget-object p0, p0, Lfg3;->a:Lcom/google/android/gms/internal/playcore_age_signals/zzd;

    .line 88
    .line 89
    invoke-virtual {p0, p2, p3}, Lcom/google/android/gms/internal/playcore_age_signals/zzd;->zzc(Ljava/lang/String;[Ljava/lang/Object;)I

    .line 90
    .line 91
    .line 92
    const-string p0, "user.status"

    .line 93
    .line 94
    invoke-virtual {p1, p0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    if-nez p2, :cond_2

    .line 99
    .line 100
    new-instance v1, Lek3;

    .line 101
    .line 102
    const/4 v2, 0x0

    .line 103
    const/4 v3, 0x0

    .line 104
    const/4 v4, 0x0

    .line 105
    const/4 v5, 0x0

    .line 106
    const/4 v6, 0x0

    .line 107
    invoke-direct/range {v1 .. v6}, Lek3;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    goto/16 :goto_4

    .line 111
    .line 112
    :cond_2
    invoke-virtual {p1, p0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 113
    .line 114
    .line 115
    move-result p2

    .line 116
    const/4 p3, 0x0

    .line 117
    if-eqz p2, :cond_3

    .line 118
    .line 119
    invoke-virtual {p1, p0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    move-object v2, p0

    .line 128
    goto :goto_0

    .line 129
    :cond_3
    move-object v2, p3

    .line 130
    :goto_0
    const-string p0, "age.range.lower"

    .line 131
    .line 132
    invoke-virtual {p1, p0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 133
    .line 134
    .line 135
    move-result p2

    .line 136
    if-eqz p2, :cond_4

    .line 137
    .line 138
    invoke-virtual {p1, p0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 139
    .line 140
    .line 141
    move-result p0

    .line 142
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    move-object v3, p0

    .line 147
    goto :goto_1

    .line 148
    :cond_4
    move-object v3, p3

    .line 149
    :goto_1
    const-string p0, "age.range.upper"

    .line 150
    .line 151
    invoke-virtual {p1, p0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 152
    .line 153
    .line 154
    move-result p2

    .line 155
    if-eqz p2, :cond_5

    .line 156
    .line 157
    invoke-virtual {p1, p0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 158
    .line 159
    .line 160
    move-result p0

    .line 161
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    move-object v4, p0

    .line 166
    goto :goto_2

    .line 167
    :cond_5
    move-object v4, p3

    .line 168
    :goto_2
    const-string p0, "most.recent.approval.date"

    .line 169
    .line 170
    invoke-virtual {p1, p0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 171
    .line 172
    .line 173
    move-result p2

    .line 174
    if-eqz p2, :cond_6

    .line 175
    .line 176
    new-instance p2, Ljava/util/Date;

    .line 177
    .line 178
    invoke-virtual {p1, p0}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 179
    .line 180
    .line 181
    move-result-wide v5

    .line 182
    invoke-direct {p2, v5, v6}, Ljava/util/Date;-><init>(J)V

    .line 183
    .line 184
    .line 185
    move-object v5, p2

    .line 186
    goto :goto_3

    .line 187
    :cond_6
    move-object v5, p3

    .line 188
    :goto_3
    const-string p0, "install.id"

    .line 189
    .line 190
    invoke-virtual {p1, p0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 191
    .line 192
    .line 193
    move-result p2

    .line 194
    if-eqz p2, :cond_7

    .line 195
    .line 196
    invoke-virtual {p1, p0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p3

    .line 200
    :cond_7
    move-object v6, p3

    .line 201
    new-instance v1, Lek3;

    .line 202
    .line 203
    invoke-direct/range {v1 .. v6}, Lek3;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    :goto_4
    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    return p4
.end method
