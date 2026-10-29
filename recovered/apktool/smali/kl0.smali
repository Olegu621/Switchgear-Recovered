.class public final synthetic Lkl0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lkl0;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4

    .line 1
    iget p0, p0, Lkl0;->a:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    check-cast p1, Ljava/io/File;

    .line 8
    .line 9
    check-cast p2, Ljava/io/File;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    .line 12
    .line 13
    .line 14
    move-result-wide p0

    .line 15
    invoke-virtual {p2}, Ljava/io/File;->lastModified()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    invoke-static {p0, p1, v0, v1}, Ljava/lang/Long;->compare(JJ)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    :pswitch_0
    check-cast p1, Lio/sentry/android/core/anr/a;

    .line 25
    .line 26
    check-cast p2, Lio/sentry/android/core/anr/a;

    .line 27
    .line 28
    iget p0, p1, Lio/sentry/android/core/anr/a;->f:I

    .line 29
    .line 30
    int-to-float p0, p0

    .line 31
    iget v0, p1, Lio/sentry/android/core/anr/a;->b:F

    .line 32
    .line 33
    const/high16 v1, 0x3f800000    # 1.0f

    .line 34
    .line 35
    add-float/2addr v0, v1

    .line 36
    mul-float/2addr v0, p0

    .line 37
    iget p0, p1, Lio/sentry/android/core/anr/a;->a:I

    .line 38
    .line 39
    int-to-float p0, p0

    .line 40
    mul-float/2addr v0, p0

    .line 41
    iget p0, p2, Lio/sentry/android/core/anr/a;->f:I

    .line 42
    .line 43
    int-to-float p0, p0

    .line 44
    iget p1, p2, Lio/sentry/android/core/anr/a;->b:F

    .line 45
    .line 46
    add-float/2addr p1, v1

    .line 47
    mul-float/2addr p1, p0

    .line 48
    iget p0, p2, Lio/sentry/android/core/anr/a;->a:I

    .line 49
    .line 50
    int-to-float p0, p0

    .line 51
    mul-float/2addr p1, p0

    .line 52
    invoke-static {v0, p1}, Ljava/lang/Float;->compare(FF)I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    return p0

    .line 57
    :pswitch_1
    check-cast p1, Lio/sentry/k1;

    .line 58
    .line 59
    check-cast p2, Lio/sentry/k1;

    .line 60
    .line 61
    if-ne p1, p2, :cond_0

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    invoke-interface {p1}, Lio/sentry/k1;->w()Lio/sentry/t4;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-interface {p2}, Lio/sentry/k1;->w()Lio/sentry/t4;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {p0, v0}, Lio/sentry/t4;->a(Lio/sentry/t4;)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    invoke-interface {p1}, Lio/sentry/k1;->s()Lio/sentry/b7;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    iget-object p0, p0, Lio/sentry/b7;->b:Lio/sentry/d7;

    .line 84
    .line 85
    invoke-virtual {p0}, Lio/sentry/d7;->a()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-interface {p2}, Lio/sentry/k1;->s()Lio/sentry/b7;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    iget-object p1, p1, Lio/sentry/b7;->b:Lio/sentry/d7;

    .line 94
    .line 95
    invoke-virtual {p1}, Lio/sentry/d7;->a()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    :goto_0
    return v0

    .line 104
    :pswitch_2
    check-cast p1, Llf;

    .line 105
    .line 106
    check-cast p2, Llf;

    .line 107
    .line 108
    iget-object p0, p1, Llf;->a:Ljava/lang/String;

    .line 109
    .line 110
    iget-object p1, p2, Llf;->a:Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    return p0

    .line 117
    :pswitch_3
    check-cast p1, Landroid/util/Size;

    .line 118
    .line 119
    check-cast p2, Landroid/util/Size;

    .line 120
    .line 121
    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    int-to-long v0, p0

    .line 126
    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    .line 127
    .line 128
    .line 129
    move-result p0

    .line 130
    int-to-long p0, p0

    .line 131
    mul-long/2addr v0, p0

    .line 132
    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    int-to-long p0, p0

    .line 137
    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    .line 138
    .line 139
    .line 140
    move-result p2

    .line 141
    int-to-long v2, p2

    .line 142
    mul-long/2addr p0, v2

    .line 143
    sub-long/2addr v0, p0

    .line 144
    invoke-static {v0, v1}, Ljava/lang/Long;->signum(J)I

    .line 145
    .line 146
    .line 147
    move-result p0

    .line 148
    return p0

    .line 149
    :pswitch_4
    check-cast p1, [B

    .line 150
    .line 151
    check-cast p2, [B

    .line 152
    .line 153
    array-length p0, p1

    .line 154
    array-length v1, p2

    .line 155
    if-eq p0, v1, :cond_2

    .line 156
    .line 157
    array-length p0, p1

    .line 158
    array-length p1, p2

    .line 159
    sub-int v0, p0, p1

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_2
    move p0, v0

    .line 163
    :goto_1
    array-length v1, p1

    .line 164
    if-ge p0, v1, :cond_4

    .line 165
    .line 166
    aget-byte v1, p1, p0

    .line 167
    .line 168
    aget-byte v2, p2, p0

    .line 169
    .line 170
    if-eq v1, v2, :cond_3

    .line 171
    .line 172
    sub-int v0, v1, v2

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_3
    add-int/lit8 p0, p0, 0x1

    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_4
    :goto_2
    return v0

    .line 179
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
