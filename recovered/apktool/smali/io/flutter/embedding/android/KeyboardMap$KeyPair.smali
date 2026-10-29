.class public Lio/flutter/embedding/android/KeyboardMap$KeyPair;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/embedding/android/KeyboardMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "KeyPair"
.end annotation


# instance fields
.field public logicalKey:J

.field public physicalKey:J


# direct methods
.method public constructor <init>(JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lio/flutter/embedding/android/KeyboardMap$KeyPair;->physicalKey:J

    .line 5
    .line 6
    iput-wide p3, p0, Lio/flutter/embedding/android/KeyboardMap$KeyPair;->logicalKey:J

    .line 7
    .line 8
    return-void
.end method
