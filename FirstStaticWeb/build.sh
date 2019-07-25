#!/usr/bin/env bash
echo "hello world"
ls -la  ./|awk "/^d/{print $5}"
date