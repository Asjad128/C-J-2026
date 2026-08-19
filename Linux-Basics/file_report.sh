#!/bin/bash

target_dir="$1"

echo "$target_dir"

declare -A array

for file in "$target_dir"/*; do
    if [ -f "$file" ]; then

        filename=$(basename "$file")
        extension="${filename##*.}"
        ((array["$extension"]++))
    fi
done

echo "File extensions and their counts:"

for ext in "${!array[@]}"; do
    echo "$ext: ${array[$ext]}"
done