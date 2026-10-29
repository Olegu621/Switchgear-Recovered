.class public abstract Llo1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# direct methods
.method public static a(Landroid/app/Notification$BubbleMetadata;)Lno1;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/app/Notification$BubbleMetadata;->getShortcutId()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    new-instance v1, Lmo1;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/app/Notification$BubbleMetadata;->getShortcutId()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-nez v3, :cond_1

    .line 25
    .line 26
    iput-object v2, v1, Lmo1;->g:Ljava/lang/String;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const-string p0, "Bubble requires a non-null shortcut id"

    .line 30
    .line 31
    invoke-static {p0}, Ln4;->s(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-object v0

    .line 35
    :cond_2
    new-instance v1, Lmo1;

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/app/Notification$BubbleMetadata;->getIntent()Landroid/app/PendingIntent;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {p0}, Landroid/app/Notification$BubbleMetadata;->getIcon()Landroid/graphics/drawable/Icon;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    sget-object v4, Landroidx/core/graphics/drawable/IconCompat;->k:Landroid/graphics/PorterDuff$Mode;

    .line 46
    .line 47
    invoke-static {v3}, Lgv0;->a(Landroid/graphics/drawable/Icon;)Landroidx/core/graphics/drawable/IconCompat;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 52
    .line 53
    .line 54
    if-eqz v2, :cond_9

    .line 55
    .line 56
    iput-object v2, v1, Lmo1;->a:Landroid/app/PendingIntent;

    .line 57
    .line 58
    iput-object v3, v1, Lmo1;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 59
    .line 60
    :goto_0
    invoke-virtual {p0}, Landroid/app/Notification$BubbleMetadata;->getAutoExpandBubble()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    const/4 v3, 0x1

    .line 65
    invoke-virtual {v1, v3, v2}, Lmo1;->a(IZ)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Landroid/app/Notification$BubbleMetadata;->getDeleteIntent()Landroid/app/PendingIntent;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    iput-object v2, v1, Lmo1;->f:Landroid/app/PendingIntent;

    .line 73
    .line 74
    invoke-virtual {p0}, Landroid/app/Notification$BubbleMetadata;->isNotificationSuppressed()Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    const/4 v3, 0x2

    .line 79
    invoke-virtual {v1, v3, v2}, Lmo1;->a(IZ)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Landroid/app/Notification$BubbleMetadata;->getDesiredHeight()I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    const/4 v3, 0x0

    .line 87
    if-eqz v2, :cond_3

    .line 88
    .line 89
    invoke-virtual {p0}, Landroid/app/Notification$BubbleMetadata;->getDesiredHeight()I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    iput v2, v1, Lmo1;->c:I

    .line 98
    .line 99
    iput v3, v1, Lmo1;->d:I

    .line 100
    .line 101
    :cond_3
    invoke-virtual {p0}, Landroid/app/Notification$BubbleMetadata;->getDesiredHeightResId()I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    if-eqz v2, :cond_4

    .line 106
    .line 107
    invoke-virtual {p0}, Landroid/app/Notification$BubbleMetadata;->getDesiredHeightResId()I

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    iput p0, v1, Lmo1;->d:I

    .line 112
    .line 113
    iput v3, v1, Lmo1;->c:I

    .line 114
    .line 115
    :cond_4
    iget-object p0, v1, Lmo1;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 116
    .line 117
    iget-object v2, v1, Lmo1;->a:Landroid/app/PendingIntent;

    .line 118
    .line 119
    iget-object v1, v1, Lmo1;->g:Ljava/lang/String;

    .line 120
    .line 121
    if-nez v1, :cond_6

    .line 122
    .line 123
    if-eqz v2, :cond_5

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_5
    const-string p0, "Must supply pending intent or shortcut to bubble"

    .line 127
    .line 128
    invoke-static {p0}, Ln4;->s(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    return-object v0

    .line 132
    :cond_6
    :goto_1
    if-nez v1, :cond_8

    .line 133
    .line 134
    if-eqz p0, :cond_7

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_7
    const-string p0, "Must supply an icon or shortcut for the bubble"

    .line 138
    .line 139
    invoke-static {p0}, Ln4;->s(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    return-object v0

    .line 143
    :cond_8
    :goto_2
    new-instance p0, Lno1;

    .line 144
    .line 145
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 146
    .line 147
    .line 148
    return-object p0

    .line 149
    :cond_9
    const-string p0, "Bubble requires non-null pending intent"

    .line 150
    .line 151
    invoke-static {p0}, Ln4;->s(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    return-object v0
.end method
