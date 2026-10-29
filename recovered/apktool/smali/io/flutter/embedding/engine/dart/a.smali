.class public final synthetic Lio/flutter/embedding/engine/dart/a;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lio/flutter/embedding/engine/dart/DartMessenger;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:I

.field public final synthetic d:Lio/flutter/embedding/engine/dart/DartMessenger$HandlerInfo;

.field public final synthetic e:Ljava/nio/ByteBuffer;

.field public final synthetic f:J


# direct methods
.method public synthetic constructor <init>(Lio/flutter/embedding/engine/dart/DartMessenger;Ljava/lang/String;ILio/flutter/embedding/engine/dart/DartMessenger$HandlerInfo;Ljava/nio/ByteBuffer;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/flutter/embedding/engine/dart/a;->a:Lio/flutter/embedding/engine/dart/DartMessenger;

    .line 5
    .line 6
    iput-object p2, p0, Lio/flutter/embedding/engine/dart/a;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput p3, p0, Lio/flutter/embedding/engine/dart/a;->c:I

    .line 9
    .line 10
    iput-object p4, p0, Lio/flutter/embedding/engine/dart/a;->d:Lio/flutter/embedding/engine/dart/DartMessenger$HandlerInfo;

    .line 11
    .line 12
    iput-object p5, p0, Lio/flutter/embedding/engine/dart/a;->e:Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    iput-wide p6, p0, Lio/flutter/embedding/engine/dart/a;->f:J

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-object v4, p0, Lio/flutter/embedding/engine/dart/a;->e:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    iget-wide v5, p0, Lio/flutter/embedding/engine/dart/a;->f:J

    .line 4
    .line 5
    iget-object v0, p0, Lio/flutter/embedding/engine/dart/a;->a:Lio/flutter/embedding/engine/dart/DartMessenger;

    .line 6
    .line 7
    iget-object v1, p0, Lio/flutter/embedding/engine/dart/a;->b:Ljava/lang/String;

    .line 8
    .line 9
    iget v2, p0, Lio/flutter/embedding/engine/dart/a;->c:I

    .line 10
    .line 11
    iget-object v3, p0, Lio/flutter/embedding/engine/dart/a;->d:Lio/flutter/embedding/engine/dart/DartMessenger$HandlerInfo;

    .line 12
    .line 13
    invoke-static/range {v0 .. v6}, Lio/flutter/embedding/engine/dart/DartMessenger;->a(Lio/flutter/embedding/engine/dart/DartMessenger;Ljava/lang/String;ILio/flutter/embedding/engine/dart/DartMessenger$HandlerInfo;Ljava/nio/ByteBuffer;J)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
