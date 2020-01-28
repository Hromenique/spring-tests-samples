package br.com.hrom.demotestspringdb.config

import org.slf4j.LoggerFactory

interface Loggable

fun <T:Loggable> T.logger() = LoggerFactory.getLogger(javaClass)